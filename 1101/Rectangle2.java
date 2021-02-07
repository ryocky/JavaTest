//クラスRectangle2は、長方形を表すクラスです。
public class Rectangle2 extends Shape2{
    //長方形の幅を表すint型のフィールド
    private int width;
    //長方形の高さを表すint型のフィールド
    private int height;

    /*長方形を生成するコンストラクタ
    幅と高さを引数として受け取る*/
    public Rectangle2(int width, int height){
        this.width = width;
        this.height = height;
    }
    /*メソッドtoStringは、長方形に関する図形情報を表す文字列を返却*/
    public String toString(){
        return "Rectangle(width:" + width + ", height:" + height + ")";
    }
    /*メソッドdrawは、長方形を描画
    描画はアスタリスクを並べます*/
    public void draw(){
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= width; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
