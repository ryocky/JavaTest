class TimeAccount2 extends Account2 {
    private long timeBalance;

    TimeAccount2(String name, String no, long balance, long timeBalance){
        super(name, no, balance);
        this.timeBalance = timeBalance;
    }

    long getTimeBalance(){
        return timeBalance;
    }

    void cancel(){
        deposit(timeBalance);
        timeBalance = 0;
    }
}
//is-Aの関係とインスタンスへの参照
class TimeAccount2Tester{
    public static void main(String[]args){
        Account2 tarou = new Account2("山田太郎", "12345", 1000);
        TimeAccount2 hanako = new TimeAccount2("山田花子", "67890", 200, 500);

        Account2 x;
        x = tarou; //自分自身の型のインスタンス参照可
        x = hanako; //下位クラス型のインスタンス参照可

        System.out.println("xの預金残高:" + x.getBalance());

        TimeAccount2 y;
        //y = tarou; //上位クラス型のインスタンス参照不可
        y = hanako; //自分自身の型のインスタンス参照可

        System.out.println("yの預金残高:" + y.getBalance());
        System.out.println("yの定期預金残高" + y.getTimeBalance());
    }
}

