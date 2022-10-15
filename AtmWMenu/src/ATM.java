import java.util.Scanner;

public class ATM {
    public void calis(Account account){

        int heart=3;
        Login login = new Login();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Bank");

        while(true){

            if(login.login(account)){
                System.out.println("Welcome "+ account.getNick());
                break;
            }
            else{
                System.out.println("Nick and Passaword don't match...");
                heart--;
            }
            if(heart==0){
                System.out.println("The system shut down...\n Please try again later...");
                return;
            }
        }
        String menu= "1- Show your money\n"
                    +"2- Add money\n"
                    +"3- Take money\n"
                    +"4- Quit\n";
        System.out.println(menu);
        String choice = scan.nextLine();

        while(true){
            if(choice=="1"){
                System.out.println("Your current money: "+account.getBalance());
            }
            if(choice=="2"){
                System.out.println("How much money do you want to add: ");
                int money=scan.nextInt();
                account.addMoney(money);
            }
            if(choice=="3"){
                System.out.println("How much money do you want to take: ");
                int money=scan.nextInt();
                account.takeMoney(money);
            }
            if(choice=="4"){
                break;
            }
            else{
                System.out.println("Somethinh went wrong :(");
            }
        }

    }
}
