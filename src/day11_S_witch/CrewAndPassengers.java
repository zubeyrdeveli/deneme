package day11_S_witch;

public class CrewAndPassengers {

        public static void main(String[] args) {

            int number = 100;
            boolean validNumber =  number == 50 || number ==75 || number ==100;


            String result = (validNumber) ?
                     (number == 50) ? "20 crew, 30 passengers"
                    : (number == 75) ? "25 crew, 50 passengers"
                    :"30 crew, 70 passengers"
                    : "invalid number";

            System.out.println(result);

    }
}