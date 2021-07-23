package sort.joon10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
            people[i] = new Person(Integer.parseInt(tokenizer.nextToken()), tokenizer.nextToken());
        }

        Arrays.sort(people);

        for (Person person : people) {
            sb.append(person.age)
                    .append(' ')
                    .append(person.name)
                    .append("\n");
        }

        System.out.println(sb);
        br.close();

    }

    static class Person implements Comparable<Person> {

        public int age;
        public String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Person person) {
            return age - person.age;
        }
    }
}
