//九九の表示(System.out.printf利用)

public class MultitablePrintf {
    public static void main(String[] args){
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
