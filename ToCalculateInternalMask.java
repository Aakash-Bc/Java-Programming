import java.util.Scanner;

public class ToCalculateInternalMask {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int subjects = 5;
        double totalMarks = 0;
        boolean hasFailed = false;

        System.out.println("Enter the marks for each subject (out of 100):");

        System.out.print("JAVA: ");
        double java = sc.nextDouble();
        if (java < 40) hasFailed = true;
        totalMarks += java;

        System.out.print("C: ");
        double c = sc.nextDouble();
        if (c < 40) hasFailed = true;
        totalMarks += c;

        System.out.print("Math: ");
        double math = sc.nextDouble();
        if (math < 40) hasFailed = true;
        totalMarks += math;

        System.out.print("DSA: ");
        double dsa = sc.nextDouble();
        if (dsa < 40) hasFailed = true;
        totalMarks += dsa;

        System.out.print("DBMS: ");
        double dbms = sc.nextDouble();
        if (dbms < 40) hasFailed = true;
        totalMarks += dbms;

        double percentage = (totalMarks / (subjects * 100)) * 100;

        System.out.println("\nTotal Marks: " + totalMarks + " out of " + (subjects * 100));
        System.out.println("Percentage: " + percentage + "%");

        if (hasFailed || percentage < 80)
        {
            System.out.println("Status: Failed");
            if (hasFailed) System.out.println("Reason: Scored less than 40 in one or more subjects.");
            if (percentage < 80) System.out.println("Reason: Overall percentage is less than 80%.");
        }
        else
        {
            System.out.println("Status: Passed");
        }

        sc.close();
    }
}
