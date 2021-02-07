//is-Aの関係とインスタンスへの参照

class TimeAccount2Tester2 {
    //どちらの預金残高が多いか
    static int compBalance(Account2 a, Account2 b){
        if(a.getBalance() > b.getBalance()) //aの方が多い
            return 1;
        else if(a.getBalance() < b.getBalance()) //bの方が多い
            return -1;
        return 0; //aとbは同じ
    }
    
    public static void main(String[]args){
        Account2 tarou = new Account2("山田太郎", "12345", 1000);
        TimeAccount2 hanako = new TimeAccount2("山田花子", "56789", 200, 500);

        switch(compBalance(tarou, hanako)){
            case 0: System.out.println("二人の預金残高は同じ。"); break;
            case 1: System.out.println("太郎君の預金残高が多い。"); break;
            case -1: System.out.println("花子ちゃんの預金残高が多い。"); break;
        }
    }
}
