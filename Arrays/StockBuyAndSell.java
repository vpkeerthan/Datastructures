import java.util.*;
public class StockBuyAndSell {
	
	public static void calculateBestBuyAndSell(int arr[],int N){
		
		if(N==1){
			System.out.println("No Profit");
			return;
		}
		
		int counter=0,i=0,j=0;
		int buy[] = new int[N];
		int sell[] = new int[N];
		while(counter<N){
			
			while(counter<N && arr[counter]>arr[counter+1]){
				counter++;
			}
			if(counter==N-1){
				return;
			}
			buy[i++]=counter++;
			while(counter<N && arr[counter]>arr[counter-1]){
				counter++;
			}
			sell[j++]=counter -1;
		}
		for(int k=0;k<i;k++){
			System.out.println("Buy: "+buy[k]+" Sell: "+sell[k]);
		}
	}
	
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T!=0){
			int N = sc.nextInt();
			int arr[] = new int[N];
			for(int i=0;i<N;i++){
				arr[i] = sc.nextInt();
			}
			calculateBestBuyAndSell(arr, N);
			T--;
		}
	}
}
