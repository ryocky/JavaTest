//数当てゲーム(0-99)
import java.util.Random;
import java.util.Scanner;

public class NumGussing {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int num = rand.nextInt(100);

        System.out.println("数当てゲームスタート");
        System.out.println("0~99の値を当ててください。");
    
        int x;
        do{
            System.out.println("数を入力してください。:");
            x = stdIn.nextInt();

            if(x > num)
                System.out.println("もっと小さい数です。");
            else if(x < num)
                System.out.println("もっと大きい数です。");
        }while(x != num);
        System.out.println("正解です。");
        stdIn.close();
    }
}
