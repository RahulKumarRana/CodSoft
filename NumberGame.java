import java.util.Random;
import java.util.Scanner;
class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        String choice;
        Random randomNum = new Random();
        int showMe = randomNum.nextInt(100);
        input(showMe);
        System.out.println("Random number is:- " + showMe);
        do {
            System.out.println("Do you want to try again?[yes/no]");
            choice = sc.nextLine();
            if (choice.equals("yes")) {
                counter++;
                if (counter == 5) {
                    System.out.println("Sorry you reach your limite..your cant try again.");
                    break;
                } else {
                    input(showMe);
                    System.out.println("Random number is:- " + showMe);
                }
            }
        } while (choice.equals("yes"));
    }

    static void input(int showMe) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter here a number:");
        int number = sc.nextInt();
        if (number == showMe) {
            System.out.println("Congratulation your are right.");
        } else if (number > showMe) {
            int c = number - showMe;
            System.out.println("Your guess number is" + " " + c + " " + "greater then the actual random number.");
        } else if (number < showMe) {
            int b = showMe - number;
            System.out.println("Your guess number is" + " " + b + " " + "smaller then the actual random number.");
        }
    }
}