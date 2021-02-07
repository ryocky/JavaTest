//配列の全要素をコピー
import java.util.Scanner;

public class CoppyArray {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("要素数:");
        int n = stdIn.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        for(int i = 0; i < n; i++)
            b[i] = a[i];

        System.out.println("aの全要素を配列bにコピーしました。");

        for(int i = 0; i < n; i++)
        System.out.println("b[" + i + "] = " + b[i]);

        stdIn.close();
    }
}
