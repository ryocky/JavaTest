//ペットクラスの利用例

class PetTester2 {
    //pが参照するインスタンスに自己紹介させる
    static void intro(Pet p){
        p.introduce();
    }    

    public static void main(String[] args){
        Pet[] a = {
            new Pet("Tarou", "あなた"),
            new RobotPet("R2D2", "ジェダイ"),
            new Pet("T-800", "未来のあなた"),
        };

        for(Pet p : a){
            intro(p);  //pが参照するインスタンスに自己紹介させる
            System.out.println();
        }
    }
}
