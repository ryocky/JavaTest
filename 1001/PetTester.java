//ペットクラスの利用例

class PetTester {
    public static void main(String[]args){
        Pet tarou = new Pet("Tarou", "あなた");
        tarou.introduce();
        System.out.println();

        RobotPet r2d2 = new RobotPet("R2D2", "ジェダイ");
        r2d2.introduce();
        System.out.println();

        Pet p  =r2d2;
        p.introduce();
    }    
}
