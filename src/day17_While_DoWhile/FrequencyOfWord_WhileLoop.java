package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Phyton Java Phyton";

        int frequency = 0;

        while (str.contains("Java")){

            str = str.replaceFirst("Java","");
            frequency++;

        }
        System.out.println("frequency = " + frequency);
        System.out.println("-------------------------");


        String sentence = "cat cat dog cat gog cat bok cat CAT Cat dog";
        sentence=sentence.toLowerCase();
        int frequency1= 0;

        while (sentence.contains("cat")){

            sentence=sentence.replaceFirst("cat","");
            frequency1++;
        } System.out.println("frequency1 = " + frequency1);

        System.out.println("------------------------------");

        String s="java java phyton phyton java phyton java java phyton Phyton PHYTON JaVa JAVa ";
        s=s.toLowerCase();

        int countJava = 0;
        int countPhyton = 0;

        while (s.contains("java") || s.equals("phyton")){

            if (s.contains("java")){

                s=s.replaceFirst("java", "");
                countJava++;
            }
            if (s.contains("phyton")){

                s=s.replaceFirst("phyton","");
                countPhyton++;
            }


        }
        System.out.println("countJava = " + countJava);
        System.out.println("countPhyton = " + countPhyton);

    }
}
