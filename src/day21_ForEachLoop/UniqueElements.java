package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String [] words = {"Java", "Java", "Phyton", "Mahmut", "Muhtar", "Mahmut", "Phyton", "Asiya" };



        for (String element : words) {// element : "Java", "Java", "Phyton", "Mahmut", "Muhtar", "Mahmut", "Phyton", "Asiya"
            int count = 0;
            for (String word : words) { // word : "Java", "Java", "Phyton", "Mahmut", "Muhtar", "Mahmut", "Phyton", "Asiya"
                if (element==word) {
                    count++;
                }
            }

            if (count==1) {
                System.out.println(element);
            }
        }

    }
}
