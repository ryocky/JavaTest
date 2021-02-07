//四角形クラスの利用その2
import java.util.Scanner;

public class RectangleTester2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("四角形のデータを入力してください。");
        System.out.print("名前は:"); String name = stdIn.next();
        System.out.print("幅は:"); int width = stdIn.nextInt();
        System.out.print("高さは:"); int height = stdIn.nextInt();
        System.out.print("奥行きは:"); int depth = stdIn.nextInt();

        RectangleInfo newRect = new RectangleInfo(name, width, height, depth);

        while(true){
            System.out.println("現在の座標(" + newRect.getX() + ", " + newRect.getY() + ")");
            System.out.print("移動しますか[0…NO/1…YES]:");
            if(stdIn.nextInt() == 0) break;

            System.out.print("X方向の移動距離:");
            double dx = stdIn.nextDouble();
            System.out.print("Y方向の移動距離:");
            double dy = stdIn.nextDouble();

            if(!newRect.move(dx, dy))
                System.out.println("移動なし");
        }
        stdIn.close();
    }
}
