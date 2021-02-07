//クラスHorzLineは水平直線を表すクラス
//AbstLineから派生したクラス
public class HorzLine extends AbstLine {

    /*水平直線を生成するコンストラクタ
    長さを引数として受け取る*/
    public HorzLine(int length){super(length);}

    /*メソッドtoStringは、水平直線に関する図形情報を表す文字列を返却*/
    public String toString(){
        return "HorzLine(length:" + getLength() + ")";
    }
    /*メソッドdrawは、水平直線を描画
    マイナス記号を横に並べます*/
    public void draw(){
        for(int i = 1; i <= getLength(); i++)
            System.out.print('-');
        System.out.println();
    }
}
