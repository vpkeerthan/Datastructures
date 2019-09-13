/* Quest 14) Ransom Note
 * */

package HackerRankDS;
import java.util.*;

public class RansomNote {
	static void checkMagazine(String[] magazine, String[] note) {
        ArrayList<String> magazine_list = new ArrayList<String>();

        for(int i=0;i<magazine.length;i++){
            magazine_list.add(magazine[i]);
        }

        for(int i=0;i<note.length;i++){
            if(!magazine_list.contains(note[i])){
                System.out.println("No");
                return;
            }else{
                magazine_list.remove(note[i]);
            }
        }
        System.out.println("Yes");
    }
	
	public static void main(String []args){
		//read input - passed all test cases :)
	}
}
