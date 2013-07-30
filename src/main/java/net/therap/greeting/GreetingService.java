package net.therap.greeting;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: diptopol
 * Date: 7/30/13
 * Time: 3:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class GreetingService {

    private GreetingDate greetingDate;

    public GreetingService(GreetingDate greetingDate) {
        this.greetingDate = greetingDate;
    }

    public void greetinMessage() {
        Date date = greetingDate.getDate();
        int hours = date.getHours();

        if(hours>4 && hours<=12)
            System.out.println("Good Moring");
        else if(hours>12 && hours<=20)
            System.out.println("Good Afternoon");
        else System.out.println("Good Evening");


    }
}
