//読み込んだ整数を加算
import java.util.Scanner;

public class SumBreak1 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数を加算します。");
        System.out.print("いくつ加算しますか？:");
        int n = stdIn.nextInt();

        int sum = 0;
        for(int i = 0; i < n; i++){
            System.out.print("整数0で終了:");
            int t = stdIn.nextInt();
            if(t == 0)break;   //for文から抜け出せる
            sum += t;
        }
        System.out.println("合計は" + sum + "です。");
        stdIn.close();
    }
}
