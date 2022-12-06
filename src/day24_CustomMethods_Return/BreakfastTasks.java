package day24_CustomMethods_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("Zubeyr", "Develi");
        System.out.println("------------------------------------");
       domain("zubeyir.develi@hotmail.com");
        System.out.println("-------------------------------------------");

        String [] emails = {"ahmet@hotmail.com","ersin@gmail.com", "kazim@cydeo.com", "yeter@yahoo.com"};

        for (String each : emails) {
            domain(each);
        }
        System.out.println("-------------------------------");

        nameOfTheMonth(5);

        System.out.println("-------------------------------------------");

        nameOfTheDay(4);
        System.out.println("----------------------");

        howManyDaysInTheMonth(11);

    }

    public static void initials (String firstName, String lastName) {

        System.out.println("initial : "+ firstName.charAt(0)  + "." + lastName.charAt(0));


    }

    public static void domain (String email) {

        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

    public static void nameOfTheMonth (int number) {

        String name = "";

        if (number>0 && number<=12) {

            name= (number==1)? "January" :(number==2)? "Feb" :(number==3)? "March" :(number==4)? "April"
                    :(number==5)? "May" :(number==6)? "June" :(number==7)? "July"
                    :(number==8)? "August" :(number==9)? "Sep" :(number==10)? "Octo" :(number==11)? "November" : "December";

        }else {
            System.out.println( name= "invalid entry");
        }

        System.out.println("Month name = " + name);

    }

    public static void nameOfTheDay (int number) {

        String name ="";

        if (number>0 && number<=7) {

            name = number==1 ? "Monday" : number==2 ? "Tuesday" : number==3 ? "Wed" : number ==4 ? "Thursday"
                    : number==5 ? "Friday" : number==6 ? "Saturday" : "Sunday";

        }else {

            name="invalid entry";
        }

        System.out.println("Name of the day= " + name);
    }

    public static void howManyDaysInTheMonth (int number) {

        String result = "";
        if (number>0 && number<=12) {

            result = number==2 ? "28 Days" : number == 4 || number ==6 || number==9 || number ==11 ? "30 days"
                    : "31 Days";

        } else {
            result = "invalid entry";
        }
        System.out.println("result = " + result);

    }


}
