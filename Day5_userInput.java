import java.io.File;
import java.util.Scanner;

public class Day5_userInput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter int");
        int a = sc.nextInt();

        
        System.out.println("Enter short num");
        short aShort = sc.nextShort();
        
        
        System.out.println("Enter bool ");
        boolean aBool = sc.nextBoolean();
        
        
        System.out.println("int : "+a);
        System.out.println("short : "+aShort);
        System.out.println("short : "+aBool);

        sc.close();

        try {
            Scanner fileScanner = new Scanner(new File("temp.txt"));
            while(fileScanner.hasNextLine()){
                System.out.println(fileScanner.nextLine());
            }
            
        } catch (Exception e) {
            System.out.println();
        }



    }
}


/*
 * Scanner class methods 
    1) main Methods
        .nextInt() , next() , nextLine()
    2) validation methods - check and return bool
        hasNext() , hasNextLine()
    3) utility methods 
        close() , reset();
 */
