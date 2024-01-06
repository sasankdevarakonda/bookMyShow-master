package com.junitBookMyShow.bookMyShow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Time;
import java.util.Date;

public class ticketProcessingTest {
    @Test
    public void generateTicketA(){
        ticketProcessing ticketProcess=new ticketProcessing();
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'A',"OG",5,1);
        ticketProcessing tck=new ticketProcessing();
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(150,ticket.getRow());
     }
    @Test
    public void generateTicketB(){
        ticketProcessing ticketProcess=new ticketProcessing();
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'B',"OG",5,1);
        ticketProcessing tck=new ticketProcessing();
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(150,ticket.getRow());
    }
    @Test
    public void generateTicketZ(){
        ticketProcessing ticketProcess=new ticketProcessing();
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'Z',"OG",5,1);
        ticketProcessing tck=new ticketProcessing();
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(100,ticket.getRow());
    }
    @Test
    public void generateTicketY(){
        ticketProcessing ticketProcess=new ticketProcessing();
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'Y',"OG",5,1);
        ticketProcessing tck=new ticketProcessing();
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(100,ticket.getRow());
    }
}
