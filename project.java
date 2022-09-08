import java.util.Scanner;
public class Dealership {
    public static void main(String[] args) {
        String choice;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Welcome to the Java Dealership!");
        System.out.println("Select option: \n'a'\tto buy a car\n'b'\tto sell a car");
        choice=input.nextLine();
        
        switch(choice){
            case "a":
                System.out.println("You chose option "+choice);
                break;
            case "b":
                System.out.println("You chose option "+ choice);
                break;
            default:
                System.out.println("invalid option");
        }
        input.close();
    }
}
