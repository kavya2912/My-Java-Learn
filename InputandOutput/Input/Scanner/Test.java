package Scanner;

import java.util.Scanner;

public class Test {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("You Entered String"+s);
        int x = sc.nextInt();
        System.out.println("You Entered Integer"+x);
        float f = sc.nextFloat();
        System.out.println("You Entered float" + f);
    }
    
}
