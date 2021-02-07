//月を表す英単語の学習プログラム
import java.util.Random;
import java.util.Scanner;

public class MonthCAI {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);
        String[] month = {"Jenuary", "February", "March", "April", "May",
    "June", "July", "August", "September", "October", "November", "December"};

        int num = rand.nextInt(12);
        System.out.println("問題は" + month[num]);

        while(true){
            System.out.print("何月かな?:");
            int m = stdIn.nextInt();
            
            if(m == num + 1) break;
            System.out.println("違います。");
        }
        System.out.println("正解です。");
        stdIn.close();
    }    
}
