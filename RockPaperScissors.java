import java.util.Scanner;
public class RockPaperScissors{
    public static void main(String[] args) {
        String ready, choice;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Let's play Rock Paper Scissors Game!");
        System.out.println("When I say shoot, choose : rock, paper,scissors");
        System.out.println("Are you ready? (please write yes)");
        ready=input.nextLine();
        if(ready.equals("yes")){
            System.out.println("\nGreat!");
            System.out.println("rock, paper,scissors, SHOOT!: ");
            choice=input.nextLine();
            String computer=computerChoice();
            System.out.println("You chose: \t"+choice+"\nComputer chose: \t"+computer);
            String result=result(choice,computer);
            System.out.println(result);
        }
        else{
            System.out.println("Ok,some another time pls");
        }
    }
    
    public static String computerChoice(){
        double number=Math.random()*3;
        int integer=(int)number;
        switch(integer){
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default:return "";
        }
    }
    
    public static String result(String you, String computer){
        String result="";
        if(you.equals("rock") && computer.equals("scissors")){
            result="You WIN!";
        }
        else if(you.equals("rock") && computer.equals("paper")){
            result="You LOSE!";
        }
        else if(you.equals("paper") && computer.equals("rock")){
            result="You WIN!";
        }
        else if(you.equals("paper") && computer.equals("scissors")){
            result="You LOSE!";
        }
        else if(you.equals("scissors") && computer.equals("rock")){
            result="You LOSE!";
        }
        else if(you.equals("scissors") && computer.equals("paper")){
            result="You WIN!";
        }
        else{
            result="It's a tie!";
        }
        
        return result;
    }
}
