import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        while (length < 0) {
            System.out.println("Enter one NATURAL number or zero");
            length = sc.nextInt();
        }
        int[] arr = new int[length];
        System.out.println("Enter array elements");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        arr = sort(arr);
        for (int i = 0;i<length;i++){
            if (i!=length-1){
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }

        }
    }

    public static int[] sort(int[] arr) {
        int length = arr.length;
        for(int i=1;i<length;i++) {
            for(int j=i;(j>0) && (arr[j-1]>arr[j]);j--){
                int k=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=k;
            }
        }
        return arr;
    }
}
