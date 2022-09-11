import java.util.Scanner;
public class Javapedia {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("-------------JAVAPEDIA--------------");
        System.out.println("How many historical figures will you register? ");
        int people=input.nextInt();
        String database[][]= new String[people][3];
        
        input.nextLine();
        for(int i=0; i<database.length; i++){
            System.out.print("\n");
            System.out.print("Figure "+(i+1)+": ");
            System.out.print("\n\tName: ");
            database[i][0]=input.nextLine();
            System.out.print("\n\tDate of birth: ");
            database[i][1]=input.nextLine();
            System.out.print("\n\tOccupation: ");
            database[i][2]=input.nextLine();
        }
        
        System.out.println("These are the values you stored: ");
        print2D(database);
        
        System.out.println("Who do you want information on?: ");
        String name=input.nextLine();
        for(int i=0 ; i<database.length; i++){
            if(database[i][0].equals(name)){
                System.out.println("\tName: "+database[i][0]);
                System.out.println("\tDate of birth: "+database[i][1]);
                System.out.println("\tOccupation: "+database[i][2]);
            }
        }
    }
    
    public static void print2D(String[][] array){
        for(int i=0; i<array.length; i++){
            System.out.println("\nFigure "+(i+1)+": ");
            for(int j=0; j<array[i].length; j++){
                System.out.print("\t* "+array[i][j]+"\n");
            }
        }
    }
}
