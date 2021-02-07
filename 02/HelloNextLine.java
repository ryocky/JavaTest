//名前を読み込んで挨拶する２
import java.util.Scanner;

public class HelloNextLine {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("お名前は:");
        String s = stdIn.nextLine(); //一行分の文字列読み込み
        System.out.println("こんにちは！" + s + "さん");
        stdIn.close();
    }
}
