package HashTableImplementation;

import java.util.ArrayList;

public class Map<k,v> {
	private ArrayList<HashNode<k, v>> bucketArray;	//bucketArray to store the array of buckets/chains
	private int numBuckets;							//Current Capacity of the arrayList
	private int size;								//Current Size of the arrayList
	
	//Constructor to initialize capacity,size and buckets will null
	Map(){
		bucketArray = new ArrayList<HashNode<k,v>>();
		numBuckets = 10;
		size = 0;
		
		for(int i=0;i<numBuckets;i++){
			bucketArray.add(null);
		}
	}
	
	public int size(){return size;}
	public boolean isEmpty(){return size==0;}
	
	public int getBucketIndex(k key){
		int hashCode = key.hashCode();								//Internal hashCode method, we can also override it
		return hashCode % numBuckets;								//Mod the hashCode with number of buckets
	}
	
	public v get(k key){											//Returns the value mapped for the key
		int bucketIndex = getBucketIndex(key);						//Finding the bucket
		HashNode<k, v> headNode = bucketArray.get(bucketIndex);		//Starting with the first node in the bucket
		while(headNode!=null){										//Traversing the linkedList/chain of nodes in that bucket
			if(headNode.key.equals(key)){
				return headNode.value;								//Returning the value of the node if we find the key
			}
			headNode = headNode.next;
		}
		return null;								//if key is not found
	}
	
	public void add(k key,v value){
		int bucketIndex = getBucketIndex(key);
		HashNode<k, v> headNode = bucketArray.get(bucketIndex);
		while(headNode!=null){										//Checking if the give key already exists
			if(headNode.key.equals(key)){							//If yes
				headNode.value = value;								//then update the existing value with the new value
				return;
			}
			headNode = headNode.next;
		}
		HashNode<k, v> newNode = new HashNode<k, v>(key, value);	//Creating a new node for the give key and value
		headNode = bucketArray.get(bucketIndex);					//******
		newNode.next = headNode;
		bucketArray.set(bucketIndex, newNode);						//Adding the new node to the chain
		size++;
		//rehashing
	}
	
	public v remove(k key){
		int bucketIndex = getBucketIndex(key);
		HashNode<k, v> headNode = bucketArray.get(bucketIndex);
		HashNode<k, v> prevNode = null;
		while(headNode!=null){
			if(headNode.key.equals(key)){							//key found
				break;
			}
			prevNode = headNode;
			headNode = headNode.next;
		}
		if(headNode==null){return null;}							//key not found
		
		if(prevNode!=null){
			prevNode = headNode.next;
		}else{
			bucketArray.set(bucketIndex, headNode.next); 
		}
		size--;
		return headNode.value;
	}
}
