package HashTableImplementation;

public class MainClass {
	public static void main(String args[]){
		Map<Integer,String> map = new Map<>();
		map.add(1, "Allison");
		map.add(2, "Clyne");
		map.add(3, "Fabinho");
		map.add(1, "Allison");
		map.add(4, "Van Dijk");
		
		System.out.println("Map Size: "+map.size());
		System.out.println("Removing Player: "+map.remove(2));
		System.out.println("Map Size:"+map.size());
	}
}
