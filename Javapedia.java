import java.util.Scanner;
public class Javapedia {
    public static void main(String[] args) {
        int people;
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("-------------JAVAPEDIA--------------");
        System.out.println("How many historical figures will you register? ");
        people=input.nextInt();
        String database[][]= new String[people][3];
        
        input.nextLine();
        for(int i=0; i<database.length; i++){
            System.out.print("\n");
            System.out.print("Figure "+(i+1)+": ");
            System.out.print("\tName: ");
            database[i][0]=input.nextLine();
            System.out.print("\n\tDate of birth: ");
            database[i][1]=input.nextLine();
            System.out.print("\n\tOccupation: ");
            database[i][2]=input.nextLine();
        }
    }
}
