//四角形クラス

public class RectangleInfo {
    private String name; //四角形名前
    private int width; //幅
    private int height; //高さ
    private int depth; //奥行き
    private double x; //現在位置X座標
    private double y; //現在位置Y座標

    //コンストラクタ
    RectangleInfo(String name, int width, int height, int depth){
        this.name = name; this.width = width; this.height = height;
        this.depth = depth; x = y = 0.0;
    }

    double getX(){return x;} //現在位置X座標を取得
    double getY(){return y;} //現在位置Y座標を取得

    //スペック表示
    void putSpec(){
        System.out.println("名前:" + name);
        System.out.println("幅:" + width + "cm");
        System.out.println("高さ" + height + "cm");
        System.out.println("奥行き" + depth + "cm");
    }

    //四角形の移動
    boolean move(double dx, double dy){
        double dist = Math.sqrt(dx * dx + dy * dy); //移動距離
        if(dist == 0)
            return false; //移動なし
        else{
            x += dx;
            y += dy;
            return true; //移動あり
        }
    }
}
