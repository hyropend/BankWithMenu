public class Main {
    public static void main(String[] args){
        ATM atm = new ATM();
        Account acc = new Account("Meyra","2807",3000);
        atm.calis(acc);
    }
}
