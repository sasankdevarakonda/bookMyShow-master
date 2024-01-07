package com.junitBookMyShow.bookMyShow;

import java.sql.Time;
import java.util.Date;

public class TicketBooking {
    public ShowOutputs getTicket(Date day, Time time, char row, String movie, int seatNo, int noOfSeats,int  amount){
char value=0;
        if ( value == 'A' || value == 'B' || value == 'C'){
            value=250;
        }
        if ( value == 'D' || value == 'E' || value == 'F'){
            value=150;

        }
        if ( value == 'G' || value == 'H' || value == 'I'){
            value=120;

        }
        System.out.println("Hello TicketBooking"+value);

       ShowOutputs Output = new ShowOutputs(day,time,row,movie,seatNo,noOfSeats,amount);
       return Output;
    }
}
