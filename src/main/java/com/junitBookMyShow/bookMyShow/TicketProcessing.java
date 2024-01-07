package com.junitBookMyShow.bookMyShow;

public class TicketProcessing {
    TicketBooking ticketBooking;

    public ShowOutputs movieTicket(ShowInputs inputs){

        char value = inputs.getRow();
        //int price =0;
        //ShowOutputs output=new ShowOutputs(inputs.getDay(),inputs.getTime(), inputs.getRow(),inputs.getMovie(),inputs.getSeatNo(),inputs.getNoOfSeats(),Ammount);
        ShowOutputs outputs = ticketBooking.getTicket(inputs.getDay(),inputs.getTime(), inputs.getRow(),inputs.getMovie(),inputs.getSeatNo(),inputs.getNoOfSeats(), inputs.getMobileNo());
        return outputs;
    }

    public void setTicketBooking(TicketBooking ticketBooking) {
        this.ticketBooking = ticketBooking;
    }
}
