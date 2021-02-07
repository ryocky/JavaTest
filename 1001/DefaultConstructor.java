//スーパークラスとサブクラス

//スーパークラス
class A{
    private int a;
    A(){a = 50;}
    int getA(){return a;}
}
//サブクラス
class B extends A{
    //デフォルトコンストラクタが生成
}

public class DefaultConstructor {
    public static void main(String[] args){
        B x = new B();
        System.out.println("x.getA() = " + x.getA());
    }
}
