public class SortArrayWithInsert{
	public static void main(String[] args){
		final int LENGTH=10;
		int[] arr = new int[LENGTH];
		int a = 0;
        	int b = 100; 
		for(int i=0;i<LENGTH;i++){
			arr[i]=a+(int)(Math.random()*b);
			System.out.print(arr[i]+" ");
       		}
		System.out.println();
		for(int i=1;i<LENGTH;i++) {   
			for(int j=i;(j>0) && (arr[j-1]>arr[j]);j--){
				int k=arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=k;
			}
		}
		for(int i=0;i<LENGTH;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
