//読み込んだ整数値の符号(正/負/0)を判別
import java.util.Scanner;

public class Sign {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:");
        int n = stdIn.nextInt();
        if(n > 0)
            System.out.println("その値は正です。");
        else if(n < 0)
            System.out.println("その値は負です。");
        else
            System.out.println("その値は0です。");
        stdIn.close();
    }
}
