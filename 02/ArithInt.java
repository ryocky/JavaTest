//2つの整数値を読み込んで加減乗除した値を表示
import java.util.Scanner;

public class ArithInt {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("xとyを加減乗除します");

        System.out.print("xの値:"); //xの値を入力
        int x = stdIn.nextInt(); //xに整数値を読み込む
        System.out.print("yの値:"); //yの値を入力
        int y = stdIn.nextInt(); //yに整数値を読み込む

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x % y = " + (x % y));
        stdIn.close();
    }
}
