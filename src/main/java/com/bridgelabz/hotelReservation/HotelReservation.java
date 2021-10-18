package com.bridgelabz.hotelReservation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {


    public static void main(String[] args) {
        HotelReservationOperations hotelOps = new HotelReservationOperations();
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
                    System.out.println("Enter the rating of hotel");
                    int ratings = scanner.nextInt();
                    System.out.println("Enter the week days rate of hotel");
                    int weekRate = scanner.nextInt();
                    System.out.println("Enter the weekend days rate of hotel");
                    int weekEnd = scanner.nextInt();
                    hotels.add(new Hotel(name, weekRate,weekEnd,ratings));
                    scanner.nextLine();
                    break;
                case 2:
                    for (int i = 0; i < hotels.size(); i++) {
                        System.out.println("Hotel list");
                        System.out.println("name:-" + hotels.get(i).getName() + " " + "Week days Rate:-" + hotels.get(i).getWeekDayRates() +" " + "Weekend Rate:-" + hotels.get(i).getWeekEndRates());
                    }
                    break;
                case 3:
                   hotelOps.cheapestHotel(hotels);
                    System.out.println("Cheapest hotel name:-" + hotelOps.hotelName + " " + "Cheapest Price :-" + hotelOps.cheapestPrice);
                    break;
                case 4:
                    operation = false;
                    break;

            }
        }




    }


}
