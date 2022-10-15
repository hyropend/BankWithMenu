public class Account {
    private String nick;
    private String passaword;
    private int balance;

    public Account(String nick,String passaword,int balance){
        this.nick=nick;
        this.passaword=passaword;
        this.balance=balance;
    }

    public void addMoney(int money){
        balance+=money;
        System.out.println("New balance is: "+balance);
    }
    public void takeMoney(int money){
        if(money>balance){
            System.out.println("You can't taka that amouth of money");
        }
        else{
            balance=-money;
            System.out.println("New balance is: "+balance);
        }
    }
    public void setNick(String nick){
        this.nick=nick;
    }
    public String getNick(){
        return nick;
    }
    public void setPassaword(String passaword){
        this.passaword=passaword;
    }
    public String getPassaword(){
        return passaword;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public int getBalance(){
        return balance;
    }
}
