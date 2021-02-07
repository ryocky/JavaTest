//点数を読み込んで合計点、平均点を表示

import java.util.Scanner;

public class PointSumAve {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int sum = 0;
        System.out.println("5人の点数を入力してください。");

        System.out.print("1番の点数:");
        int akane = stdIn.nextInt();
        sum += akane;

        System.out.print("2番の点数:");
        int baba = stdIn.nextInt();
        sum += baba;

        System.out.print("3番の点数:");
        int cocone = stdIn.nextInt();
        sum += cocone;

        System.out.print("4番の点数:");
        int docomo = stdIn.nextInt();
        sum += docomo;

        System.out.print("5番の点数:");
        int eita = stdIn.nextInt();
        sum += eita;

        System.out.println("合計は" + sum + "点です。");
        System.out.println("平均は" + (double)sum / 5 + "点です。");
        stdIn.close();
    }
}
