//点数を読み込んで合計点、平均点を表示
import java.util.Scanner;

public class PointSumAveArray {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int sum = 0;
        final int num = 5;
        int[] score = new int[num];

        System.out.println(num + "人分の点数を入力してください。");
        for(int i = 0; i < num; i++){
            System.out.print((i + 1) + "番の点数:");
            score[i] = stdIn.nextInt();
            sum += score[i];
        }
        System.out.println("合計は" + sum + "点です。");
        System.out.println("平均は" + (double)sum / num + "点です。");
        stdIn.close();
    }
}
