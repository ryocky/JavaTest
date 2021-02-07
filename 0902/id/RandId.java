//識別番号クラス
package id;

import java.util.Random;

public class RandId {
    private static int counter;
    
    private int id;

    static{
        Random rand = new Random();
        counter = rand.nextInt(10) * 100;
    }
    //コンストラクタ
    public RandId(){
        id = ++counter;
    }
    //識別番号取得
    public int getId(){
        return id;
    }
}
