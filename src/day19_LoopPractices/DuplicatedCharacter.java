package day19_LoopPractices;

public class DuplicatedCharacter {

    public static void main(String[] args) {

        String str= "Yasar";
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count=0;

            for (int j = 0; j < str.length(); j++) {
                char eachch = str.charAt(j);
                if(ch==eachch){
                    count++;
                }
            }
            if(count==2){
                result+=ch;
                break;
            }
        }
        System.out.println(result);


    }
}
