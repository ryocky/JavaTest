//銀行口座クラスのテストversion2

class Account2{
    private String name; //口座名義
    private String no;  //口座番号
    private long balance;  //預金残高

    //コンストラクタ
    Account2(String n, String num, long z){
        name = n;
        no = num;
        balance = z;
    }
    
    //口座名義を調べる
    String getName(){
        return name;
    }

    //口座番号を調べる
    String getNo(){
        return no;
    }

    //預金残高を調べる
    long getBalance(){
        return balance;
    }

    //k円預ける
    void deposit(long k){
        balance += k;
    }

    //k円おろす
    void withdraw(long k){
        balance -= k;
    }
}
public class AccountTester2 {
    public static void main(String[] args){
        Account2 first = new Account2("山田太郎", "12345", 1000);
        Account2 second = new Account2("山田花子", "67891", 200);

        first.withdraw(200); 
        second.deposit(100);

        System.out.println("■山田太郎の口座");
        System.out.println("  口座名義:" + first.getName());
        System.out.println("  口座番号:" + first.getNo());
        System.out.println("  預金残高:" + first.getBalance());

        System.out.println("■山田花子の口座");
        System.out.println("  口座名義:" + second.getName());
        System.out.println("  口座番号:" + second.getNo());
        System.out.println("  預金残高:" + second.getBalance());
    }
}
