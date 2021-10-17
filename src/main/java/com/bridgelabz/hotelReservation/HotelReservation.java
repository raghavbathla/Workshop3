package com.bridgelabz.hotelReservation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {
    static String hotelName;
    static long cheapestPrice;

    static void cheapestHotel(ArrayList<Hotel> hotel) {
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
        long numDays = ChronoUnit.DAYS.between(checkIn, checkOut);
        int index = 0;
        int cheapestRate = hotel.get(0).getRates();
        for (int i = 0; i < hotel.size(); i++) {
            if (hotel.get(i).getRates() < cheapestRate) {
                cheapestRate = hotel.get(i).getRates();
                index = i;
            }
        }
        System.out.println(index+"index");
        hotelName = hotel.get(index).getName();
        cheapestPrice = hotel.get(index).getRates() * numDays;

    }

    public static void main(String[] args) {
        boolean operation = true;
        ArrayList<Hotel> hotels = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to hotel reservation");


        while (operation) {
            System.out.println("Enter 1 for add hotels or 2 for display or  3 for cheapest hotel or  4 for exit");
            int add = scanner.nextInt();
            switch (add) {
                case 1:
                    System.out.println("Enter the name of hotel");
                    String name = scanner.next();
                    System.out.println("Enter the rate of hotel");
                    int rate = scanner.nextInt();
                    hotels.add(new Hotel(name, rate));
                    scanner.nextLine();
                    break;
                case 2:
                    for (int i = 0; i < hotels.size(); i++) {
                        System.out.println("Hotel list");
                        System.out.println("name:-" + hotels.get(i).getName() + " " + "Rate:-" + hotels.get(i).getRates());
                    }
                    break;
                case 3:
                    cheapestHotel(hotels);
                    System.out.println("Cheapest hotel name:-" + hotelName + " " + "Cheapest Price :-" + cheapestPrice);
                    break;
                case 4:
                    operation = false;
                    break;

            }
        }




    }


}
