//式の評価順序の確認

public class EvaluationOrder {
    public static void main(String[] args){
        int a = 3;
        int x = (a++) * (3 + a);
        System.out.println("a = " + a);
        System.out.println("x = " + x);
    }    
}
