//いろいろな桁数の整数を少なくとも3桁で表示

public class PrintfWidth {
    public static void main(String[] args){
        System.out.printf("%3d\n", 1);
        System.out.printf("%3d\n", 12);
        System.out.printf("%3d\n", 123);
        System.out.printf("%3d\n", 1234);
        System.out.printf("%3d\n", 12345);
    }
}
