class ShapeTester2 {
    public static void main(String[] args){
        Shape2[] p = new Shape2[4];

        p[0] = new Point2();
        p[1] = new HorzLine(5);
        p[2] = new VirtLine(3);
        p[3] = new Rectangle2(4, 4);

        for(Shape2 s : p){
            s.print();
            System.out.println();
        }
    }    
}
