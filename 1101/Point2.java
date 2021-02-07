//クラスPointは、点を表すクラス
//Shapeから派生しています
public class Point2 extends Shape2 {
    
    /*点を生成するコンストラクタ
    受け取る引き数はなし*/
    public Point2(){
        //何も行わない
    }

    /*メソッドtoStringは点に関する図形情報を表す文字列を返却
    返却する文字列はPointです*/
    public String toString(){
        return "Point";
    }

    /*メソッドdrawは、点を描画するメソッド
    プラス記号を1つ表示して改行*/
    public void draw(){
        System.out.println('+');
    }
}
