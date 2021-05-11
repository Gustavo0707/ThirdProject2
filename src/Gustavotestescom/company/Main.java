package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	boolean password = false;

 	Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("type you user");
            String user = scanner.next();

            System.out.println("type your password");
            String password2 = scanner.next();

            if(user.equalsIgnoreCase(password2)){
                password = false;
                System.out.println("user is equal the password");
            }
            else {
                password = true;
                System.out.println("user and password corrects");
            }

        }while (!password);




    }
}
