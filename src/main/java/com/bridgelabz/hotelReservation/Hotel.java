package com.bridgelabz.hotelReservation;

public class Hotel {
    private String name;
    private  int weekDayRates;
    private  int weekEndRates;


    public Hotel(String name, int weekDayRates, int weekEndRates) {
        this.name = name;

        this.weekDayRates = weekDayRates;
        this.weekEndRates = weekEndRates;
    }
    public int getWeekDayRates() {
        return weekDayRates;
    }





    public void setWeekDayRates(int weekDayRates) {
        this.weekDayRates = weekDayRates;
    }

    public int getWeekEndRates() {
        return weekEndRates;
    }

    public void setWeekEndRates(int weekEndRates) {
        this.weekEndRates = weekEndRates;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
