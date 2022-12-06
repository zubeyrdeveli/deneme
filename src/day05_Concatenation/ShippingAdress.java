package day05_Concatenation;

public class ShippingAdress {

    public static void main(String[] args) {
        /*
        String name = "Zubeyr Develi";
        String buildingNumber = "A-120/9";
        String city = "Kahramanmaras";

         */

        String name = "Zubeyr Develi", buildingNumber = "A-120/9", streetName = "Inonu Caddesi",  town= "Pazarcik", city = "Kahramanmaras",
                state = "Turkey", zipCode= "46700";

        /*
        System.out.println(name + "\n" + streetName + "\n" + buildingNumber + "\n" + town + "\n" + city + "," + state + " " + zipCode);
         */

        String address = name + "\n" + streetName + "\n" + buildingNumber + "\n" + town + "\n" + city + "," + state + " " + zipCode;

        System.out.println(address);


    }




}
