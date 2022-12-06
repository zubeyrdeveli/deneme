package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setInfo("USA","Apple","Developer", 100000, true, true,false,true);
        offer2.setInfo("Holland","B&P", "Test Engineer", 70000, true,false, true, false);
        offer3.setInfo("USA", "Facebook", "QA Lead", 95000, true, true, true, true);
        offer4.setInfo("Ukrain","Grain", "Senior QA", 60000, true,true, false, true);
        offer5.setInfo("Turkey","Gazi Bilişim", "Developer", 20000, false,false, false, true);
        offer6.setInfo("Germany","BMW", "Engineer", 110000, true,true, false, true);
        offer7.setInfo("Sweden","Volvo", "SDET", 100000, true,true, false, false);

        Offer [] myoffers= {offer1,offer2,offer3,offer4,offer5,offer6,offer7};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myoffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);
        System.out.println("fullTimeOffers = " + fullTimeOffers);

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myoffers));
        localOffers.removeIf(p-> !p.location.equals("Turkey"));
        System.out.println("localOffers = " + localOffers);

        ArrayList<Offer> offersWithBenefits =new ArrayList<>(Arrays.asList(myoffers));
        offersWithBenefits.removeIf(p-> !p.hasBenefit);
        System.out.println("offersWithBenefits = " + offersWithBenefits);

        ArrayList<Offer> sdetOffers =new ArrayList<>(Arrays.asList(myoffers));
        sdetOffers.removeIf(p-> !p.jobTitle.equals("SDET"));
        System.out.println("sdetOffers = " + sdetOffers);

        ArrayList<Offer> offersWith100K = new ArrayList<>(Arrays.asList(myoffers));
        offersWith100K.removeIf(p-> p.salary<100000);
        System.out.println("offersWith100K = " + offersWith100K);










    }
}
