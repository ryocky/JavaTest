//線形探索
import java.util.Scanner;

public class LinearSearch2 {
   //配列aの要素からKeyと一致する最も先頭の要素を線形探索
   static int linearSearch(int[] a, int key){
       for(int i = 0; i < a.length; i++)
        if(a[i] == key)
            return i;  //探索成功
        return -1;  //探索失敗
   } 

   public static void main(String[] args){
       Scanner stdIn = new Scanner(System.in);

       System.out.print("要素数:");
       int num = stdIn.nextInt();
       int[] x = new int[num];

       for(int i = 0; i < num; i++){
           System.out.print("x[" + i + "]:");
           x[i] = stdIn.nextInt();
       }

       System.out.print("探す値:");
       int ky = stdIn.nextInt();

       int idx = linearSearch(x, ky);

       if(idx == -1)
          System.out.println("その値の要素は存在しません。");
       else
          System.out.println("その値はx[" + idx + "]にあります。");
       stdIn.close();
   }
}
