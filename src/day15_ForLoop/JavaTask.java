package day15_ForLoop;

public class JavaTask {

    public static void main(String[] args) {

        String str = "Java is java in everywhere is Java";

        int frequency =0;

        for (int i = 0; i <= str.length()-4; i++) {

            String eachSub = str.substring(i,i+4);

            if (eachSub.equalsIgnoreCase("Java")){

                frequency++;
            }


        }
        System.out.println("frequency = " + frequency);

    }
}
