package com.junitBookMyShow.bookMyShow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TicketProcessingTest {
    @Test
    public void generateTicketA(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'A',"OG",5,1);
        TicketProcessing tck=new TicketProcessing();
        //TicketBooking booking = new TicketBooking();
        //booking.getTicket();
        ShowOutputs outputs = new ShowOutputs(new Date(),new Time(2),'A',"OG",2,2,250);
        TicketBooking booking = mock(TicketBooking.class);
        when(booking.getTicket(any(Date.class),any(Time.class),any(char.class),any(String.class),any(Integer.class),any(Integer.class),any(Integer.class))).thenReturn(outputs);
        tck.setTicketBooking(booking);
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(250,ticket.getAmount());
     }
    @Test
    public void generateTicketB(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'B',"OG",21,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs outputs = new ShowOutputs(new Date(),new Time(2),'A',"OG",2,2,250);
        TicketBooking booking = mock(TicketBooking.class);
        when(booking.getTicket(any(Date.class),any(Time.class),any(char.class),any(String.class),any(Integer.class),any(Integer.class),any(Integer.class))).thenReturn(outputs);
        tck.setTicketBooking(booking);
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(250,ticket.getAmount());
    }
    @Test
    public void generateTicketC(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'C',"OG",5,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs outputs = new ShowOutputs(new Date(),new Time(2),'A',"OG",2,2,250);
        TicketBooking booking = mock(TicketBooking.class);
        when(booking.getTicket(any(Date.class),any(Time.class),any(char.class),any(String.class),any(Integer.class),any(Integer.class),any(Integer.class))).thenReturn(outputs);
        tck.setTicketBooking(booking);
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(250,ticket.getAmount());
    }
    @Test
    public void generateTicketD(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'D',"OG",5,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs outputs = new ShowOutputs(new Date(),new Time(2),'A',"OG",2,2,150);
        TicketBooking booking = mock(TicketBooking.class);
        when(booking.getTicket(any(Date.class),any(Time.class),any(char.class),any(String.class),any(Integer.class),any(Integer.class),any(Integer.class))).thenReturn(outputs);
        tck.setTicketBooking(booking);
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(150,ticket.getAmount());
    }
    @Test
    public void generateTicketE(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'E',"OG",5,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs outputs = new ShowOutputs(new Date(),new Time(2),'A',"OG",2,2,150);
        TicketBooking booking = mock(TicketBooking.class);
        when(booking.getTicket(any(Date.class),any(Time.class),any(char.class),any(String.class),any(Integer.class),any(Integer.class),any(Integer.class))).thenReturn(outputs);
        tck.setTicketBooking(booking);
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(150,ticket.getAmount());
    }
    @Test
    public void generateTicketF(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'F',"OG",5,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs outputs = new ShowOutputs(new Date(),new Time(2),'A',"OG",2,2,150);
        TicketBooking booking = mock(TicketBooking.class);
        when(booking.getTicket(any(Date.class),any(Time.class),any(char.class),any(String.class),any(Integer.class),any(Integer.class),any(Integer.class))).thenReturn(outputs);
        tck.setTicketBooking(booking);
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(150,ticket.getAmount());
    }
    @Test
    public void generateTicketG(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'G',"OG",5,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs outputs = new ShowOutputs(new Date(),new Time(2),'A',"OG",2,2,120);
        TicketBooking booking = mock(TicketBooking.class);
        when(booking.getTicket(any(Date.class),any(Time.class),any(char.class),any(String.class),any(Integer.class),any(Integer.class),any(Integer.class))).thenReturn(outputs);
        tck.setTicketBooking(booking);
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(120,ticket.getAmount());
    }
    @Test
    public void generateTicketH(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'H',"OG",5,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs outputs = new ShowOutputs(new Date(),new Time(2),'A',"OG",2,2,120);
        TicketBooking booking = mock(TicketBooking.class);
        when(booking.getTicket(any(Date.class),any(Time.class),any(char.class),any(String.class),any(Integer.class),any(Integer.class),any(Integer.class))).thenReturn(outputs);
        tck.setTicketBooking(booking);
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(120,ticket.getAmount());
    }
    @Test
    public void generateTicketI(){
        ShowInputs inputs=new ShowInputs(987392334,new Date(),new Time(2), 'I',"OG",5,1);
        TicketProcessing tck=new TicketProcessing();
        ShowOutputs outputs = new ShowOutputs(new Date(),new Time(2),'A',"OG",2,2,120);
        TicketBooking booking = mock(TicketBooking.class);
        when(booking.getTicket(any(Date.class),any(Time.class),any(char.class),any(String.class),any(Integer.class),any(Integer.class),any(Integer.class))).thenReturn(outputs);
        tck.setTicketBooking(booking);
        ShowOutputs ticket=tck.movieTicket(inputs);
        Assertions.assertNotNull(ticket);
        Assertions.assertEquals(120,ticket.getAmount());
    }
}
