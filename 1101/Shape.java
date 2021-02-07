//図形クラス群

//図形
abstract class Shape {
    abstract void draw();
}
//点
class Point extends Shape{
    Point(){}

    void draw(){
        System.out.println('+');
    }
}
//長方形
class Rectangle extends Shape{
    private int width;
    private int height;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    void draw(){
        for(int i = 1; i <= height; i++){
            for(int j = 1; j <= width; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}