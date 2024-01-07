package com.junitBookMyShow.bookMyShow;

import java.sql.Time;
import java.util.Date;

public class TicketBookingOutput {
   public static void main(String[] args) {
        TicketProcessing processing = new TicketProcessing();
        TicketBooking booking=new TicketBooking();
        ShowOutputs outputs=booking.getTicket(new Date(),new Time(12),'A',"OG",32,2,200);
       // ShowInputs inputs = new ShowInputs(98960567,new Date(),new Time(18),'B',"OG",21,8);
        processing.setTicketBooking(booking);
        System.out.println(outputs);
    }

}