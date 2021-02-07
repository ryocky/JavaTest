//最も背が高い人の身長と最も重い人の体重を求める
import java.util.Scanner;

public class MaxOfHeightWeight {
    //配列のaの最大値を求めて返却
    static int maxOf(int[] a){
        int max = a[0];
        for(int i = 1; i < a.length; i++)
            if(a[i] > max)
                max = a[i];
        return max;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("人数は:");
        int ninzu = stdIn.nextInt();

        int[] height = new int[ninzu];
        int[] weight = new int[ninzu];

        System.out.println("身長と体重を入力してください。");

        for(int i = 0; i < ninzu; i++){
            System.out.print((i + 1) + "番目の身長:");
            height[i] = stdIn.nextInt();
            System.out.print((i + 1) + "番目の体重:");
            weight[i] = stdIn.nextInt();
        }
        System.out.println("最も身長が高い人の身長:" + maxOf(height) + "cm");
        System.out.println("最も太っている人の体重:" + maxOf(weight) + "kg");
        stdIn.close();

    }
}
