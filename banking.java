import java.util.Scanner;
public class banking {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        //LOGIN
        String username = "shubham";
        System.out.print("Enter your username : ");
        String un = sc.nextLine();

        if (un.equals(username)){

        int password = 12345;
        System.out.print("Enter the password : ");
        int pass = sc.nextInt();

        if(pass == password){

        boolean isRunning = true;
        double balance = 10000;

        while (isRunning) {
        System.out.println("-> BANKING PROGRAM <-");
        System.out.println("----------------------");
        System.out.println("1. for check BALANCE");
        System.out.println("2. for DEPOSIT");
        System.out.println("3. for WITHDRAWL");
        System.out.println("4. for EXIT");
        System.out.println("---------------------");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();

        //CHOSSING LOGIC
        
        switch(choice){
            case 1 -> showBalance(balance);
            case 2 -> balance += deposit();
            case 3 -> balance -= withdrawl(balance);
            case 4 -> isRunning = false;
            default -> System.out.println("INVALID CHOICE");
        }
    }
        }
        else{
            System.out.println("you have entered a wrong password.");
        }
        }
        
        else {
            System.out.println(" you have entered a wrong username.");
        }


    
        }
        //SHOW BALANCE------------
         static void showBalance(double balance){
            System.out.println("your balance is: " + balance);
        }
        
        //DEPOIST------------------
        static double deposit(){
            double amount ;
            System.out.print("Enter the amount you want to deposit : ");
            amount = sc.nextDouble();

            if(amount < 0){
                System.out.println("please enter valid amount.");
                return 0;
            }
            else{
                return amount;
            }
        }
          
        //WITHDRAWL----------------
        static double withdrawl(double balance){
            double amount;
            System.out.print("Enter the amount you want to withdrawl : ");  
            amount = sc.nextDouble();

            if(amount > balance){
                System.out.println("insufficient balance");
                return 0;
            }
            else if(amount < 0){
                System.out.println("please enter valid amount.");
                return 0;
            }
            else{
                return amount;
            }
        }
}
