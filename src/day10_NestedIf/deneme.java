package day10_NestedIf;

public class deneme {

    public static void main(String[] args) {
        int s=110;

        String result = (s>=0) && (s<=100)? (s >= 90)? "Excellent": (s >= 80)? "Great": (s >= 70)? "Good" : (s >= 60)? "Passed"
                :"Failed"   :"invalid score";

        System.out.println("result= " + result);
    }
}
