//Operations of Binary Min Heap
public class MinHeap {
	private int []heap;
	private int maxSize;
	private int Size;
	
	public MinHeap(int maxSize){
		this.maxSize = maxSize;
		Size = 0;
		heap = new int [maxSize + 1];
		heap[0]=Integer.MIN_VALUE;
	}
	public int parent(int pos){
		return pos/2;
	}
	public int leftChild(int pos){
		return pos*2;
	}
	public int rightChild(int pos){
		return (pos*2) + 1;
	}
	public boolean isLeaf(int pos){
		if(pos>=Size/2 && pos<=Size){
			return true;
		}else{
			return false;
		}
	}
	public void swap(int pos1, int pos2){
		int temp;
		temp = heap[pos1];
		heap[pos1] = heap[pos2];
		heap[pos2] = temp;
	}
	public void buildHeap(int value){
		heap[++Size] = value;
		int current = Size;
		heapifyUp(current);
	}
	public void heapifyUp(int current){
		while(heap[current]<heap[parent(current)]){
			swap(current,parent(current));
			current = parent(current);
		}
	}
	public void heapifyDown(int pos){
		System.out.println("pos1:: "+!isLeaf(pos));
		if(!isLeaf(pos)){
			System.out.println("pos:: "+pos+"heap[pos] :: "+heap[pos]+" leftChild(pos):: "+heap[leftChild(pos)]);
			if(heap[rightChild(pos)]>heap[leftChild(pos)]){
				swap(pos,leftChild(pos));
				heapifyDown(leftChild(pos));
			}else{
				swap(pos,rightChild(pos));
				heapifyDown(rightChild(pos));
			}
		}
	}
	public int extractMin(){
		int ele = heap[1];
		System.out.println("Heap Size Before:"+Size);
		heap[1] = heap[Size--];
		System.out.println("Deleted Ele :"+ele);
		System.out.println("Heap Size After:"+Size);
		heapifyDown(1);
		return ele;
	}
	public void print(){
		for(int i=1;i<=Size/2;i++){
			System.out.println(" Parent : "+heap[i]+" Left Child : "+heap[2*i]+" Right Child : "+heap[2*i+1]);
		}
	}
	public void minHeap() 
    { 
        for (int pos=(Size/2);pos>=1;pos--) { 
            heapifyUp(pos); 
        } 
    }

	public static void main(String[]args){
		MinHeap minHeap = new MinHeap(15);
		minHeap.buildHeap(10);
		minHeap.buildHeap(20);
		minHeap.buildHeap(30);
		minHeap.buildHeap(40);
		minHeap.buildHeap(50);
		minHeap.print();
		int ele = minHeap.extractMin();
		System.out.println("Deleted min ele : "+ele);
		minHeap.minHeap();
		minHeap.print();
	}
}
