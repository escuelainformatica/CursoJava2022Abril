package abril29.mayo04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) throws IOException {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    

        String name = reader.readLine();
    
        System.out.println(name);

        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println(s);

          // Using Console to input data from user
          String name2 = System.console().readLine();
 
          System.out.println("You entered string " + name2);
    }
        
        

}
