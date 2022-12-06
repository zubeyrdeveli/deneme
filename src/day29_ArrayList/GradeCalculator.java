package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100,47,60,55,99,0,70,80,88,65,59,85,55,90,75,50));

        ArrayList<Integer> gradeA = new ArrayList<>(scores);
        gradeA.removeIf(p-> p<90);
        System.out.println("gradeA = " + gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>(scores);
        gradeB.removeIf(p-> p<80 || p>=90);
        System.out.println("gradeB = " + gradeB);

        ArrayList<Integer> gradeC = new ArrayList<>(scores);
        gradeC.removeIf(p-> p<70 || p>=80);
        System.out.println("gradeC = " + gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>(scores);
        gradeD.removeIf(p-> p<60 || p>=70);
        System.out.println("gradeD = " + gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>(scores);
        gradeF.removeIf(p-> p>70);
        System.out.println("gradeF = " + gradeF);

        System.out.println("Total Numbers " + "\n" + "Grade A = "
                +gradeA.size()+ "\n" + "Grade B = "
                +gradeB.size()+ "\n" +"Grade C = "
                +gradeC.size()+ "\n" + "Grade D = "
                +gradeD.size()+ "\n" + "Grade F = " +gradeF.size());

    }

}
