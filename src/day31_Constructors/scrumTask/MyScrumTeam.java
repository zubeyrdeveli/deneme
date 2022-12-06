package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Ali", 56, "QA Lead", 98000);
        Tester tester2 = new Tester("Muhtar", 44, "Senior QA", 120000);
        Tester tester3 = new Tester("Wright", 77, "Junior QA", 57000);
        Tester tester4 = new Tester("Olga", 67, "Junior QA", 57000);

        Tester [] testers= {tester1,tester2,tester3, tester4};

        Developer dev1 = new Developer("Ahmet", 546, "Java Developer", 102000);
        Developer dev2 = new Developer("Ferdi", 567, "Java Master", 135000);
        Developer dev3 = new Developer("Zeki", 562, "Developer", 89000);
        Developer dev4 = new Developer("Halil", 596, "Junior Developer", 60000);
        Developer dev5 = new Developer("Ümüs", 796, "Junior Developer", 60000);

        Developer [] developers = {dev1,dev2,dev3,dev4,dev5};

        ScrumTeam scrum = new ScrumTeam("Vedat", "Adem", "Tunç", 14);
        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println("scrum = " + scrum);

        System.out.println("---------------------------------");

        for (Tester eachTester : scrum.testerList){
            System.out.println(eachTester.name + " : "+ eachTester.salary);
        }
        System.out.println("------------------------------------------------");

        for (Developer eachDeveloper : scrum.developsList) {
            System.out.println(eachDeveloper.name + " : "+ eachDeveloper.salary);
        }

        System.out.println("-------------------------------------------------");

        scrum.removeTester(67);
        scrum.removeDeveloper(562);

        System.out.println("scrum = " + scrum);
    }
}
