package HashTableImplementation;

public class HashNode<k,v> {
	k key;
	v value;
	
	HashNode<k, v> next;				//Reference to next node
	
	HashNode(k key,v value){			//Constructor
		this.key = key;
		this.value = value;
	}
}
