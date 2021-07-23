package string.joon1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            Integer testCount = Integer.valueOf(br.readLine());

            int notCount = 0;
            for (int i = 0; i < testCount; i++) {
                String s = br.readLine();
                boolean[] alpabet = new boolean[26];
                char prev = '0';
                for (char cur : s.toCharArray()) {
                    if (prev == cur) {
                        continue;
                    }

                    if (alpabet[cur - 'a']) {
                        notCount++;
                        break;
                    }

                    prev = cur;
                    alpabet[cur - 'a'] = true;
                }
            }
            System.out.println(testCount - notCount);
        }

    }
}
