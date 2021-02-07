//読み込んだ整数値の桁数判別（2桁以上かどうか）
import java.util.Scanner;

public class DigitsNo2 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:");
        int n = stdIn.nextInt();
        if(n <= -10 || n >= 10)
            System.out.println("2桁以上です。");
        else if(n >= -9 && n <= 9)
            System.out.println("2桁未満です。");
        stdIn.close();
    }
}
