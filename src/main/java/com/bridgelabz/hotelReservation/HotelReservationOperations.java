package com.bridgelabz.hotelReservation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationOperations {
    public String hotelName;
    public long cheapestPrice;
    public int ratings;


    public void cheapestHotel(ArrayList<Hotel> hotel) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the checkIn date");
        System.out.println("Enter the date");
        int d = scanner.nextInt();
        System.out.println("Enter the month");
        int m = scanner.nextInt();
        System.out.println("Enter the year");
        int y = scanner.nextInt();
        LocalDate checkIn = LocalDate.of(y, m, d);


        System.out.println("Enter the checkOut date");
        System.out.println("Enter the date");
        int dco = scanner.nextInt();
        System.out.println("Enter the month");
        int mo = scanner.nextInt();
        System.out.println("Enter the year");
        int yo = scanner.nextInt();
        LocalDate checkOut = LocalDate.of(yo, mo, dco);
        final int startW = checkIn.getDayOfWeek().getValue();
        final int endW = checkOut.getDayOfWeek().getValue();
        long numDays = ChronoUnit.DAYS.between(checkIn, checkOut);
        long weekDays = numDays - 2 * (numDays / 7);

        if (numDays % 7 != 0) { //deal with the rest days
            if (startW == 7) {
                weekDays -= 1;
            } else if (endW == 7) {  //they can't both be Sunday, otherwise rest would be zero
                weekDays -= 1;
            } else if (endW < startW) { //another weekend is included
                weekDays -= 2;
            }
        }
        long weekends = numDays - weekDays;
        int index = 0;
        int cheapestRate = hotel.get(0).getWeekDayRates() + hotel.get(0).getWeekEndRates();

        for (int i = 0; i < hotel.size(); i++) {
            if (hotel.get(i).getWeekEndRates() + hotel.get(i).getWeekDayRates() < cheapestRate) {
                cheapestRate = hotel.get(i).getWeekDayRates() + hotel.get(i).getWeekEndRates();
                index = i;
            } else if (hotel.get(i).getWeekEndRates() + hotel.get(i).getWeekDayRates() == cheapestRate) {
                if (hotel.get(i).getRatings() > hotel.get(index).getRatings()) {
                    cheapestRate = hotel.get(i).getWeekDayRates() + hotel.get(i).getWeekEndRates();
                    index = i;
                }
            }
        }


        hotelName = hotel.get(index).getName();
        cheapestPrice = hotel.get(index).getWeekDayRates() * weekDays + hotel.get(index).getWeekEndRates() * weekends;
        ratings = hotel.get(index).getRatings();
    }

    public void cheapestHotelForLoyalCustomer(ArrayList<Hotel> hotel) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the checkIn date");
        System.out.println("Enter the date");
        int d = scanner.nextInt();
        System.out.println("Enter the month");
        int m = scanner.nextInt();
        System.out.println("Enter the year");
        int y = scanner.nextInt();
        LocalDate checkIn = LocalDate.of(y, m, d);


        System.out.println("Enter the checkOut date");
        System.out.println("Enter the date");
        int dco = scanner.nextInt();
        System.out.println("Enter the month");
        int mo = scanner.nextInt();
        System.out.println("Enter the year");
        int yo = scanner.nextInt();
        LocalDate checkOut = LocalDate.of(yo, mo, dco);
        final int startW = checkIn.getDayOfWeek().getValue();
        final int endW = checkOut.getDayOfWeek().getValue();
        long numDays = ChronoUnit.DAYS.between(checkIn, checkOut);
        long weekDays = numDays - 2 * (numDays / 7);

        if (numDays % 7 != 0) { //deal with the rest days
            if (startW == 7) {
                weekDays -= 1;
            } else if (endW == 7) {  //they can't both be Sunday, otherwise rest would be zero
                weekDays -= 1;
            } else if (endW < startW) { //another weekend is included
                weekDays -= 2;
            }
        }
        long weekends = numDays - weekDays;
        int index = 0;
        int cheapestRate = hotel.get(0).getLoyalCustomerWeekDays() + hotel.get(0).getLoyalCustomerWeekEndDays();

        for (int i = 0; i < hotel.size(); i++) {
            if (hotel.get(i).getLoyalCustomerWeekDays() + hotel.get(i).getLoyalCustomerWeekEndDays() < cheapestRate) {
                cheapestRate = hotel.get(i).getLoyalCustomerWeekDays() + hotel.get(i).getLoyalCustomerWeekEndDays();
                index = i;
            }
else if (hotel.get(i).getLoyalCustomerWeekDays() + hotel.get(i).getLoyalCustomerWeekEndDays() == cheapestRate) {
                    if (hotel.get(i).getRatings() > hotel.get(index).getRatings()) {
                        cheapestRate = hotel.get(i).getLoyalCustomerWeekDays() + hotel.get(i).getLoyalCustomerWeekEndDays();
                        index = i;
                    }
            }
        }


        hotelName = hotel.get(index).getName();
        cheapestPrice = hotel.get(index).getLoyalCustomerWeekDays()* weekDays + hotel.get(index).getLoyalCustomerWeekEndDays() * weekends;
        ratings = hotel.get(index).getRatings();
    }



    public void bestRated(ArrayList<Hotel> hotel) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the checkIn date");
        System.out.println("Enter the date");
        int d = scanner.nextInt();
        System.out.println("Enter the month");
        int m = scanner.nextInt();
        System.out.println("Enter the year");
        int y = scanner.nextInt();
        LocalDate checkIn = LocalDate.of(y, m, d);


        System.out.println("Enter the checkOut date");
        System.out.println("Enter the date");
        int dco = scanner.nextInt();
        System.out.println("Enter the month");
        int mo = scanner.nextInt();
        System.out.println("Enter the year");
        int yo = scanner.nextInt();
        LocalDate checkOut = LocalDate.of(yo, mo, dco);
        final int startW = checkIn.getDayOfWeek().getValue();
        final int endW = checkOut.getDayOfWeek().getValue();
        long numDays = ChronoUnit.DAYS.between(checkIn, checkOut);
        long weekDays = numDays - 2 * (numDays / 7);

        if (numDays % 7 != 0) { //deal with the rest days
            if (startW == 7) {
                weekDays -= 1;
            } else if (endW == 7) {  //they can't both be Sunday, otherwise rest would be zero
                weekDays -= 1;
            } else if (endW < startW) { //another weekend is included
                weekDays -= 2;
            }
        }
        long weekends = numDays - weekDays;
        int index = 0;
        int bestRaitng = hotel.get(0).getRatings();

        for (int i = 0; i < hotel.size(); i++) {
            if (hotel.get(i).getRatings() > bestRaitng) {
                bestRaitng = hotel.get(i).getRatings();
                index = i;
            }

        }
        hotelName = hotel.get(index).getName();
        cheapestPrice = hotel.get(index).getWeekDayRates() * weekDays + hotel.get(index).getWeekEndRates() * weekends;
        ratings = hotel.get(index).getRatings();
    }
}
