//instanceof演算子の利用例

class PetInstanceOf {
    public static void main(String[] args){
        Pet[] a = {
            new Pet("Tarou", "あなた"),
            new RobotPet("R2D2", "ジェダイ"),
            new Pet("T-800", "未来のあなた"),
        };

        for(int i = 0; i < a.length; i++){
            System.out.println("a[" + i + "]");
            if(a[i] instanceof RobotPet)
                ((RobotPet)a[i]).work(0);
            else
                a[i].introduce();
        }
    }
}
