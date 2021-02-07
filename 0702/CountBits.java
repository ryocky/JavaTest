//int型整数中の1であるビット数をカウント
import java.util.Scanner;

public class CountBits {
    //int型のビット構成を表示
    static void printBits(int x){
        for(int i = 31; i >= 0; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }
    //int型整数中の1であるビット数をカウント
    static int countBits(int x){
        int bits = 0;
        while (x != 0){
            if((x & 1) == 1) bits++;
            x >>>= 1;
        }
        return bits;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数:");
        int x = stdIn.nextInt();

        System.out.print("ビット構成 = ");
        printBits(x);
        System.out.println("\n1であるビット数 = " + countBits(x));
        stdIn.close();
    }
}
