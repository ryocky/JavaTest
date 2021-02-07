//2つの整数値の大小比較表示
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:");
        int a = stdIn.nextInt();
        System.out.print("整数b:");
        int b = stdIn.nextInt();

        int min, max; 
        if(a < b){
            min = a;
            max = b;
        }else{
            min = b;
            max = a;
        }
        
        System.out.println("小さい値は" + min + "です。");
        System.out.println("大きい値は" + max + "です。");
        stdIn.close();
    }   
}
