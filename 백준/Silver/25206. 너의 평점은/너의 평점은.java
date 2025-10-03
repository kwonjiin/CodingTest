import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalScore = 0.0;
        double totalCredit = 0.0;

        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            double credit = sc.nextDouble();
            String grade = sc.next();

            if (grade.equals("P")) continue;

            double score = 0.0;
            if (grade.equals("A+")) score = 4.5;
            else if (grade.equals("A0")) score = 4.0;
            else if (grade.equals("B+")) score = 3.5;
            else if (grade.equals("B0")) score = 3.0;
            else if (grade.equals("C+")) score = 2.5;
            else if (grade.equals("C0")) score = 2.0;
            else if (grade.equals("D+")) score = 1.5;
            else if (grade.equals("D0")) score = 1.0;
            else if (grade.equals("F")) score = 0.0;

            totalScore += credit * score;
            totalCredit += credit;
        }

        System.out.printf("%.6f\n", totalScore / totalCredit);
    }
}
