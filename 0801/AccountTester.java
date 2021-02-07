//銀行口座クラスのテスト

class Account{
    String name; //口座名義
    String no;  //口座番号
    long balance;  //預金残高
}
public class AccountTester {
    public static void main(String[] args){
        Account first = new Account();
        Account second = new Account();

        first.name = "山田太郎";
        first.no = "12345";
        first.balance = 1000;

        second.name = "山田花子";
        second.no = "67891";
        second.balance = 200;

        first.balance -= 200;
        second.balance += 100;

        System.out.println("■山田太郎の口座");
        System.out.println("  口座名義:" + first.name);
        System.out.println("  口座番号:" + first.no);
        System.out.println("  預金残高:" + first.balance);

        System.out.println("■山田花子の口座");
        System.out.println("  口座名義:" + second.name);
        System.out.println("  口座番号:" + second.no);
        System.out.println("  預金残高:" + second.balance);
    }
}
