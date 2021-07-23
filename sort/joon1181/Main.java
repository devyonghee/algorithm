package sort.joon1181;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> strings = new HashSet<>();
        for (int i = 0; i < n; i++) {
            strings.add(br.readLine());
        }

        String[] newStrings = strings.toArray(new String[]{});
        StringComparator comparator = new StringComparator();
        Arrays.sort(newStrings, comparator);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String string : newStrings) {
            bw.write(string + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static class StringComparator implements Comparator<String> {

        @Override
        public int compare(String a, String b) {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            return a.compareTo(b);
        }
    }
}
