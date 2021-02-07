//クラスAbstLineは直線を表す抽象クラス
//Shapeクラスから派生したクラス
public abstract class AbstLine extends Shape2{
    //直線の長さを表すint型のフィールド
    private int length;

    /*直線を生成するコンストラクタ
    長さを引数として受け取る*/
    public AbstLine(int length){
        setLength(length);
    }
    /*直線の長さを取得*/
    public int getLength(){
        return length;
    }
    /*直線の長さを設定*/
    public void setLength(int length){
        this.length = length;
    }
    /*メソッドtoStringは、直線に関する図形情報を表す文字列を返却*/
    public String toString(){
        return "AbstLine(length:" + length + ")";
    }
}
