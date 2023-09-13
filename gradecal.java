import java.util.Scanner;

public class gradecal {
    public static void main(String[] args) {
        input();
    }
     static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number obtained in math:");
        int math = sc.nextInt();
        System.out.println("Enter number obtained in English:");
        int eng = sc.nextInt();
        System.out.println("Enter number obtained in Socail-Science:");
        int Socail = sc.nextInt();
        System.out.println("Enter number of Science:");
        int sci = sc.nextInt();
        System.out.println("Enter number of Geographi:");
        int geo = sc.nextInt();
        calculate(math, eng, Socail, sci, geo);

    }

    static void calculate(int math, int eng, int sos, int sci, int geo) {
        int avg = 0;
        System.out.println("Your total number of all subject is: 500");
        System.out.println("And your Each subject total mark's is: 100");
        if (math > 100 || eng > 100 || sos > 100 || sci > 100 || geo > 100) {
            System.out.println("You entered something wrong in obtained subject number");
        } else {
            avg = (math + eng + sos + sci + geo) / 5;
            System.out.println("Your avarage is: " + " " + avg);
        }
        grade(avg);
    }

    static void grade(int avg) {
        String achive = "";
        if (avg > 33||avg==33) {
            achive = "C";
            System.out.println("Congratulations you achive "+ achive+" "+"grade");
            System.out.println("You need to be batter.");
        } 
        else {
            achive = "A";
            System.out.println("Congratulation you obtained:"+ achive+" "+"grade");
        }
        if (avg > 45||avg==45) {
            achive = "B";
            System.out.println("Congratulation you obtained:"+ achive+" "+"grade");
        } 
    }
}
