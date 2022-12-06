package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {

        char[] chars = {'A', 'A', 'B', 'B', 'B', 'C', 'D', 'D', 'E', 'E', 'F', 'E', 'G'};

        for (int i = 0; i < chars.length; i++) {

            char ch1 = chars[i];
            int frequency = 0;

            for (int j = 0; j < chars.length; j++) {

                char ch2 = chars[j];

                if (ch2 == ch1) {
                    frequency++;
                }

            }

            if (frequency == 2) {
                System.out.println(ch1);

            }
        }
    }
}
