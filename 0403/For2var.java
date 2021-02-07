//読み込んだ整数値と各値との差を表示
import java.util.Scanner;

public class For2var {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数値:");
        int n = stdIn.nextInt();

        for(int i = 1, j = n-1; i <= n; i++, j--){
            System.out.println("数字" + i +  "との差は" + j);
        }
        stdIn.close();
    }    
}