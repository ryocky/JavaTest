//点数を読み込んで最高値を表示
import java.util.Scanner;

public class HighScore {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        final int num = 5;
        int[] score = new int[num];

        System.out.println(num + "人分の点数を入力してください。");
        for(int i = 0; i < num; i++){
            System.out.print((i + 1) + "番の点数:");
            score[i] = stdIn.nextInt();
        }

        int max = score[0];
        for(int i = 1; i < score.length; i++)
            if(score[i] > max) max = score[i];

        System.out.println("最高点は" + max + "点です。");
        stdIn.close();
    }
}
