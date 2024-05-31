import java.io.*;
import java.util.Scanner;

public class atmapplication {
    public static void main(String[] args) {
        int pin = 1234;
        int balance = 10000;

        int AddAmount = 0;
        int TakeAmount = 0;

        String name;

        Scanner sc = new Scanner(System.in);
        // we hava to take an input by an user
        System.out.println("Enter your pin number");

        int password = sc.nextInt();

        if (password == pin) {

            System.out.println("Enter your name");
            name = sc.next();
            System.out.println("Welcome " + name);
            while (true) {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to take recipt");
                System.out.println("press 5 to EXIT");

                int opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("your current balance is" + balance);
                        break;
                    case 2:
                        System.out.println("how much amount did you want to ADD to your account");
                        AddAmount = sc.nextInt();
                        System.out.println("Successfully credited");
                        balance = AddAmount + balance;
                        break;
                    case 3:
                        System.out.println("How much amount did you want to take");
                        TakeAmount = sc.nextInt();
                        if (TakeAmount > balance) {
                            System.out.println("your balance is insufficient");
                            System.out.println("try less than your available balance");
                        } else {
                            System.out.println("successfully taken");
                            balance = balance - TakeAmount;
                        }
                        break;
                    case 4:

                        System.out.println("Welcome to All in one mini ATM");
                        System.out.println("Available balance is" + balance);
                        System.out.println("Amount deposited " + AddAmount);
                        System.out.println("Amount withdraw " + TakeAmount);
                        System.out.println("Thank you");
                        break;
                    

                }
                if (opt == 5) {
                    System.out.println("Thankyou");
                    break;
                }

            }
        } else {
            System.out.println("Password is incorrect pls check password");

        }

    }
}
