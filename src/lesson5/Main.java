package lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = StringUtils.countVowel("jakhdkwgjgdkwgkuhlikjlamjlsk kjslgfesn gs daetueiio");
        System.out.println(result);

        System.out.println(StringUtils.reversedByWords("Hello WOrld"));

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringUtils.coddingText(text);

    }
}
