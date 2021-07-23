package list.joon8958;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            int score = 0;
            int currentScore = 1;

            String[] corrects = sc.next().split("");
            for (String correct : corrects) {
                if (!correct.equals("O")) {
                    currentScore = 1;
                    continue;
                }
                score += currentScore;
                currentScore++;
            }
            System.out.println(score);
        }
    }
}
