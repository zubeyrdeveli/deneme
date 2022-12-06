package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String po, ba ,sm;

    public ArrayList<Tester> testerList = new ArrayList<>();
    public ArrayList<Developer> developsList = new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String po, String ba, String sm, int daysOfSprint) {
        this.po = po;
        this.ba = ba;
        this.sm = sm;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester){testerList.add(tester);}
    public void addTesters (Tester [] testers){testerList.addAll(Arrays.asList(testers));}
    public void addDeveloper(Developer developer){developsList.add(developer);}
    public void addDevelopers(Developer [] developers){developsList.addAll(Arrays.asList(developers));}
    public void removeTester(int employeeID){testerList.removeIf(p-> p.employeeID==employeeID);}
    public void removeDeveloper(int employeeID){developsList.removeIf(p-> p.employeeID==employeeID);}

    public String toString() {
        return "ScrumTeam{" +
                "po='" + po + '\'' +
                ", ba='" + ba + '\'' +
                ", sm='" + sm + '\'' +
                ", total number of testers = " + testerList.size() +
                ", total number of developers = " + developsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }


}
