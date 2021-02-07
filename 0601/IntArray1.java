//構成要素がint型の配列（構成要素は5:newによって本体を生成）

public class IntArray1 {
    public static void main(String[] args){
        int[] a = new int[5];

        a[1] = 27;
        a[2] = 55;
        a[4] = a[1] * 2;
        
        System.out.println("a[" + 0 + "] = " + a[0]);
        System.out.println("a[" + 1 + "] = " + a[1]);
        System.out.println("a[" + 2 + "] = " + a[2]);
        System.out.println("a[" + 3 + "] = " + a[3]);
        System.out.println("a[" + 4 + "] = " + a[4]);
    }
}
