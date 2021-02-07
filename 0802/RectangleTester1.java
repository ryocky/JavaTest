//四角形クラスの利用その1

public class RectangleTester1 {
    public static void main(String[] args){
        RectangleInfo rect1 = new RectangleInfo("四角形1", 6, 4, 3);
        RectangleInfo rect2 = new RectangleInfo("四角形2", 5, 5, 5);

        rect1.putSpec(); //rect1のスペックを表示
        System.out.println();
        rect2.putSpec(); //rect2のスペックを表示
    }    
}
