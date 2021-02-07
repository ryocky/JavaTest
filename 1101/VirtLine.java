//クラスVirtLineは垂直直線を表すクラス
//AbstLineから派生したクラス
public class VirtLine extends AbstLine {

    /*垂直直線を生成するコンストラクタ
    長さを引数として受け取る*/
    public VirtLine(int length){super(length);}

    /*メソッドtoStringは、垂直直線に関する図形情報を表す文字列を返却*/
    public String toString(){
        return "VirtLine(length:" + getLength() + ")";
    }
    /*メソッドdrawは、垂直直線を描画
    縦線記号を横に並べます*/
    public void draw(){
        for(int i = 1; i <= getLength(); i++)
            System.out.println('|');
    }
}

