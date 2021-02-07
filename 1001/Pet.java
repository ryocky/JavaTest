//ペットクラス
public class Pet {
    private String name;
    private String masterName;
    //コンストラクタ
    public Pet(String name, String masterName){
        this.name = name;
        this.masterName = masterName;
    }

    //ペット名を調べる
    public String getName(){return name;}
    //持ち主名を調べる
    public String getMasterName(){return masterName;}

    //自己紹介
    public void introduce(){
        System.out.println("■私の名前は" + name + "です。");
        System.out.println("■持ち主は" + masterName + "です。");
    }
}

class RobotPet extends Pet{
    //コンストラクタ
    public RobotPet(String name, String masterName){
        super(name, masterName); //スーパークラスのコンストラクタ
    }

    //自己紹介
    public void introduce(){
        System.out.println("◇私の名前は" + getName() + "です。");
        System.out.println("◇持ち主は" + getMasterName() + "です。");
    }

    //家事を行う
    public void work(int sw){
        switch(sw){
            case 0: System.out.println("掃除します。"); break;
            case 1: System.out.println("洗濯します。"); break;
            case 2: System.out.println("炊事します。"); break;
        }
    }
}

