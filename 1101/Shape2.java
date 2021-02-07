//クラスShapeは、図形の概念を表す抽象クラス
//具体的な図形クラスはこのクラスから派生します。

public abstract class Shape2 {
    
    /*図形情報を表す文字列を返却するメソッド
    クラスShapeから派生し、このメソッド本体を実装*/
    public abstract String toString();

    /*メソッドdrawは、図形を描画するためのメソッド
    クラスShapeから派生し、このメソッド本体を実装*/
    public abstract void draw();

    //メソッドprintは、図形情報の表示と図形の表示を行う
    public void print(){
        System.out.println(toString());
        draw();
    }
}
