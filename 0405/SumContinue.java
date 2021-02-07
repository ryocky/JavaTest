//読み込んだ整数を加算(負の値は加算しない)
import java.util.Scanner;

public class SumContinue {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("整数を加算します。");
        System.out.print("いくつ加算しますか？:");
        int n = stdIn.nextInt();

        int sum = 0;
        for(int i = 0; i < n; i++){
            System.out.print("整数:");
            int t = stdIn.nextInt();
            if(t < 0){
                System.out.println("負の数は加算されません。");
                continue;
            }
            sum += t;
        }
        System.out.println("合計は" + sum + "です。");
        stdIn.close();
    }
}