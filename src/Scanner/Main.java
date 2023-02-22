package Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        while(myScanner.hasNext()){
            String line = myScanner.next();
            System.out.println("Given name: " + line);
//            myScanner.close();
        }
    }
}
