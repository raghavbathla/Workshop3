package com.bridgelabz.hotelReservation;

public class Hotel {
    private String name;
    private  int weekDayRates;
    private  int weekEndRates;
    private int ratings;
private int loyalCustomerWeekDays;
private int loyalCustomerWeekEndDays;
    public Hotel(String name, int weekDayRates, int weekEndRates, int ratings, int loyalCustomerWeekDays,int loyalCustomerWeekEndDays) {
        this.name = name;
        this.ratings = ratings;
        this.loyalCustomerWeekDays = loyalCustomerWeekDays;
        this.loyalCustomerWeekEndDays = loyalCustomerWeekDays;
        this.weekDayRates = weekDayRates;
        this.weekEndRates = weekEndRates;
    }
    public int getWeekDayRates() {
        return weekDayRates;
    }

    public int getLoyalCustomerWeekDays() {
        return loyalCustomerWeekDays;
    }

    public void setLoyalCustomerWeekDays(int loyalCustomerWeekDays) {
        this.loyalCustomerWeekDays = loyalCustomerWeekDays;
    }

    public int getLoyalCustomerWeekEndDays() {
        return loyalCustomerWeekEndDays;
    }

    public void setLoyalCustomerWeekEndDays(int loyalCustomerWeekEndDays) {
        this.loyalCustomerWeekEndDays = loyalCustomerWeekEndDays;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
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
