package com.junitBookMyShow.bookMyShow;

import java.sql.Time;
import java.util.Date;

public class ShowOutputs {
    private Date day;
    private Time time;
    private char row;
    private String movie;
    private int seatNo;
    private int noOfSeats;
    private int amount;
   // private char value;


    public ShowOutputs(Date day, Time time, char row, String movie, int seatNo, int noOfSeats,int amount) {
        this.day = day;
        this.time = time;
        this.row = row;
        this.movie = movie;
        this.seatNo = seatNo;
        this.noOfSeats = noOfSeats;
        this.amount=amount;
       // this.value=value;
       // this.price=price;

    }

    public Date getDay() {
        return day;
    }

    public Time getTime() {
        return time;
    }

    public char getRow() {
        return row;
    }

    public String getMovie() {
        return movie;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public int getAmount() {
        return amount;
    }

   // public char getValue(){
       // return value;
    //}


    @Override
    public String toString() {
        return "Movie Ticket{" +
                "day=" + day +
                ", time=" + time +
                ", row=" + row +
                ", movie='" + movie + '\'' +
                ", seatNo=" + seatNo +
                ", noOfSeats=" + noOfSeats +


                '}';
    }
}
