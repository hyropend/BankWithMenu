import java.util.Scanner;

public class Login {
    public boolean login(Account account){
        Scanner scan = new Scanner(System.in);
        String nickName;
        String password;

        System.out.println("Nick name: ");
        nickName=scan.nextLine();
        System.out.println("Password: ");
        password=scan.nextLine();

        if(account.getNick().equals(nickName)&&account.getPassaword().equals(password)){
            return true;
        }
        else{
            return false;
        }

    }
}
