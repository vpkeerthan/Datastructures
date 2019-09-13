package JavaConcepts;

//public class SingletonClass {
//	
//	//private constructor to avoid instantiation or object creation
//	private SingletonClass(){}
//	
//	private static class LazyInit{
//		private final static SingletonClass obj = new SingletonClass();
//		
//		public SingletonClass createInstance(){
//			return LazyInit.obj;
//		}
//	}
//	
//	
//}


// Early Initialization
public class SingletonClass{
	
	private SingletonClass(){}
	
	private static SingletonClass obj = new SingletonClass();
	
	public SingletonClass getInstance(){
		return obj;
	}
}
