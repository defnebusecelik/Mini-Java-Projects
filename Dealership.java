import java.util.Scanner;
public class Dealership {
    public static void main(String[] args) {
        String choice, insurance, license;
        int budget, credit, value, price;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Welcome to the Java Dealership!");
        System.out.println("Select option: \n'a'\tto buy a car\n'b'\tto sell a car");
        choice=input.nextLine();
        
        switch(choice){
            case "a":
                System.out.println("You chose option "+choice);
                System.out.println("What is your budget?");
                budget=input.nextInt();
                if(budget>=10000){
                    System.out.println("Great!A Nissan Altima is available.");
                    System.out.println("Do you have insurance?(yes/no)");
                    insurance=input.next();
                    System.out.println("Do you have a license?(yes/no)");
                    license=input.next();
                    System.out.println("What is your credit score?");
                    credit=input.nextInt();
                    if(insurance.equals("yes") && license.equals("yes") && credit>=660){
                        System.out.println("Sold!");
                    }
                    else{
                        System.out.println("We're sorry!You aren't eligible.");
                    }
                }
                else{
                    System.out.println("We don't sell cars under $10000, sorry!");
                }
                break;
            case "b":
                System.out.println("You chose option "+ choice);
                System.out.println("What is your car valued at?");
                value=input.nextInt();
                System.out.println("What is your selling price?");
                price=input.nextInt();
                if(value>price && price<30000){
                    System.out.println("We will buy your car!");
                }
                else{
                    System.out.println("Sorry,we're not interested!");
                }
                break;
            default:
                System.out.println("invalid option");
        }
        input.close();
    }
}
