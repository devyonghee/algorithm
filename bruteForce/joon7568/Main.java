package bruteForce.joon7568;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        int count = sc.nextInt();
        int[] weights = new int[count];
        int[] talls = new int[count];

        for (int i = 0; i < count; i++) {
            weights[i] = sc.nextInt();
            talls[i] = sc.nextInt();
        }

        for (int i = 0; i < count; i++) {
            int bigger = 1;
            for (int j = 0; j < count; j++) {
                if (j == i) {
                    continue;
                }
                if (weights[j] > weights[i] && talls[j] > talls[i]) {
                    bigger++;
                }
            }
            builder.append(bigger+" ");
        }

        System.out.println(builder);
    }
}
