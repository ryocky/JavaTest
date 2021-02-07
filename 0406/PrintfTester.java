//System.out.printfのテストプログラム

public class PrintfTester {
    public static void main(String[] args) {
        System.out.printf("%d\n", 12345); //10進数
        System.out.printf("%3d\n", 12345); //少なくとも3桁
        System.out.printf("%7d\n", 12345); //少なくとも7桁
        System.out.println();

        System.out.printf("%5d\n", 123); //少なくとも5桁
        System.out.printf("%05d\n", 123); //少なくとも5桁
        System.out.println();

        System.out.printf("%d\n", 12345); //10進数
        System.out.printf("%o\n", 12345); //8進数
        System.out.printf("%x\n", 12345); //16進数(小文字)
        System.out.printf("%x\n", 12345); //16進数(大文字)
        System.out.println();

        System.out.printf("%f\n", 123.45); //浮動小数点数
        System.out.printf("%15f\n", 123.45); //全体を15桁
        System.out.printf("%9.2f\n", 123.45); //全体を9桁で小数点以下を2桁
        System.out.println();

        System.out.printf("XYZ\n"); //文字列変換なし
        System.out.printf("%s\n", "ABCDE"); //文字列
        System.out.printf("%3s\n", "ABCDE"); //少なくとも3桁
        System.out.printf("%10s\n", "ABCDE"); //少なくとも10桁
        System.out.println();
    }    
}
