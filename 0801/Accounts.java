//二人分の銀行口座データを扱うプログラム

public class Accounts {
    public static void main(String[] args){
        String firstAccountName = "山田太郎";
        String firstAccountNo = "12345";
        long firstAccountBalance = 1000;

        String secondAccountName = "山田花子";
        String secondAccountNo = "67891";
        long secondAccountBalance = 200;

        firstAccountBalance -= 200;
        secondAccountBalance += 100;

        System.out.println("■山田太郎の口座");
        System.out.println("  口座名義:" + firstAccountName);
        System.out.println("  口座番号:" + firstAccountNo);
        System.out.println("  預金残高:" + firstAccountBalance);

        System.out.println("■山田花子の口座");
        System.out.println("  口座名義:" + secondAccountName);
        System.out.println("  口座番号:" + secondAccountNo);
        System.out.println("  預金残高:" + secondAccountBalance);
    }
}
