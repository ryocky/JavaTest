//読み込んだ2つの整数値の小さい方の値を表示（if文）
import java.util.Scanner;

public class Min2 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a:");
        int a = stdIn.nextInt();
        System.out.print("整数b:");
        int b = stdIn.nextInt();

        int min; //小さい方の値
        if(a < b)
            min = a;
        else  
            min = b;
        System.out.println("小さい値は" + min + "です。");
        stdIn.close();
    }    
}
