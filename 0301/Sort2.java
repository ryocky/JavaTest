//2つの変数を昇順にソート
import java.util.Scanner;

public class Sort2 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:");
        int a = stdIn.nextInt();
        System.out.print("整数b:");
        int b = stdIn.nextInt();

        if(a > b){
            int t = a;
            a = b;
            b = t;
        }
        System.out.println("小さい値から順に" + a + "、" + b + "です。");
        stdIn.close();
    }   
}
