//読み込んだ2つの整数値が等しいか判別
import java.util.Scanner;

public class Equal {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:");
        int a = stdIn.nextInt();
        System.out.print("整数b:");
        int b = stdIn.nextInt();

        if(a == b)
            System.out.println("2つの値は等しいです。");
        else
            System.out.println("2つの値は等しくありません。");
        stdIn.close();
    }
}
