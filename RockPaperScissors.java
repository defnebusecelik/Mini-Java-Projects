import java.util.Scanner;
class RockPaperScissors{
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
}
