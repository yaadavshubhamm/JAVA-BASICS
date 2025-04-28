import java.util.Random;
import java.util.Scanner;

public class diceRoller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int total = 0;
        System.out.print("Enter the no of dice: ");
        int noDice = sc.nextInt();


        if(noDice > 0){
            for(int i = 0; i < noDice; i++){
                int roll = random.nextInt(1, 7);
                rolledDice(roll);//argument
                System.out.println("you rolled : " + roll);
                total += roll;
            }
            System.out.println("your total is : " +total);
        }
        else{
            System.out.println("the dice number is 0.");
        }
    }                      //parameter
    static void rolledDice (int roll){
        String dice1 = """
                -------
               |       |
               |   ●   |
               |       |
                -------
                """;
        String dice2 = """
                -------
               | ●     |
               |       |
               |     ● |
                -------
                """;
        String dice3 = """
                -------
               | ●     |
               |   ●   |
               |     ● |
                -------
                """;
        String dice4 = """
                -------
               | ●   ● |
               |       |
               | ●   ● |
                -------
                """;
        String dice5 = """
                -------
               | ●   ● |
               |   ●   |
               | ●   ● |
                -------
                """;
        String dice6 = """
                -------
               | ●   ● |
               | ●   ● |
               | ●   ● |
                -------
                """;
            
        
                
        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("invalid roll");
        }
    }
    
}
