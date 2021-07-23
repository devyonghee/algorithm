package list.joon4344;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();

        for (int i = 0; i < testCount; i++) {
            int studentsCount = sc.nextInt();
            int[] scores = new int[studentsCount];
            int sum = 0;

            for (int j = 0; j < studentsCount; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j];
            }

            double average = (double) sum / (double) studentsCount;
            int overCount = 0;
            for (int score : scores) {
                if (score > average) {
                    overCount++;
                }
            }

            System.out.println(BigDecimal.valueOf((double) overCount / (double) studentsCount).multiply(BigDecimal.valueOf(100)).setScale(3, RoundingMode.HALF_UP) + "%");
        }
    }
}
