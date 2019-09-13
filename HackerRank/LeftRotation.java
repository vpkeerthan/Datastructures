/* Quest 16) Left Rotation 
 * */

package HackerRankDS;

public class LeftRotation {
	static int [] rotLeft(int[] a, int d) {

        //ArrayList<Integer> alist = new ArrayList<Integer>();
        int [] modArray = new int[a.length];
        int index =0;
        for(int i=d;i<a.length;i++){
            //alist.add(a[i]);
            modArray[index++] = a[i];
        }
        for(int i=0;i<d;i++){
            //alist.add(a[i]);
            modArray[index++] = a[i];
        }
        //System.out.println(alist);
        return modArray;
    }
	
	public static void main(String []args){
		
		//read the vals of a and d
		
//		int[] result = rotLeft(a, d);
		
//		for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
	}
}
