//名前を読み込んで挨拶する１
import java.util.Scanner;

public class HelloNext {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("お名前は:");
        String s = stdIn.next(); //文字列を読み込む
        System.out.println("こんにちは！" + s + "さん");
        stdIn.close();
    }    
}
