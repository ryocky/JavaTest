//整数リテラル（10進数/8進数/16進数）

public class DecOctHexLiteral {
    public static void main(String[] args){
        int a = 13; //10進数の13
        int b = 013; //8進数の13
        int c = 0x13; //16進数の13

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }    
}
