package list.joon10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Integer max = null;
            Integer min = null;

            int n = Integer.valueOf(br.readLine());
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < n; i++) {
                Integer integer = Integer.valueOf(stringTokenizer.nextToken());
                if (max == null || integer > max) {
                    max = integer;
                }
                if (min == null || integer < min) {
                    min = integer;
                }
            }
            System.out.println(String.join(" ", String.valueOf(min), String.valueOf(max)));
        }

    }

}
