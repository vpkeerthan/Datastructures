import java.util.HashSet;
/*
public class HashSet{
	
	// A HashMap object
	private transient HashMap<E,Object> map;

	// A Dummy value(PRESENT) to associate with an Object in the Map
	private static final Object PRESENT = new Object();
	
	/ default constructor of HashSet class
    // It creates a HashMap by calling 
    // default constructor of HashMap class
    public HashSet() {
        map = new HashMap<E,Object>();
    }
    
    // add method 
    // it calls put() method on map object
    // and then compares it's return value with null
    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }
	
}
*/
public class HashSetImplementation {
	public static void main (String [] args){
		HashSet<String> hset = new HashSet<>();
		hset.add("Geeks");
		hset.add("for");
		hset.add("Geeks");
	}

}
