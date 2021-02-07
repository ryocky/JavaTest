//入力された月の季節を表示
import java.util.Scanner;

public class Season2 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int retry;

        do{
            System.out.print("季節を求めます。\n何月ですか:");
            int month = stdIn.nextInt();

            if(month >= 3 && month <= 5)
                System.out.println("その季節は春です。");
            else if(month >= 6 && month <= 8) 
                System.out.println("その季節は夏です。");
            else if(month >= 9 && month <= 11) 
                System.out.println("その季節は秋です。");
            else if(month >= 12 || month == 1 || month == 2 ) 
                System.out.println("その季節は冬です。");
        
            System.out.print("もう一度？ 1…Yes/0…No :");
            retry = stdIn.nextInt();
        }while(retry==1);
        stdIn.close();
    }
}
