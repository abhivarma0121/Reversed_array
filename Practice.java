
import java.util.Scanner;
public class Practice {
    static String[] getReverseArray(String[] arr) { 
        int i,j,n;
        String t;
        n=arr.length;
        for (i = 0; i < n / 2; i++) {
            t = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = t;
        }
        
        return arr; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: --->");
        
        //taking input of array size
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the values of array: ---->");
        
        //taking input in array
        for(int i=0; i<n; i++) {
            String tmpS = sc.next();
            arr[i] = tmpS;
        }
        System.out.println("\nThe Reversed array is :");
        arr= getReverseArray(arr);
        for(String s: arr) {
            System.out.println(s); //print your result array
        }
    }
}




