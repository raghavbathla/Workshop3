package com.bridgelabz.hotelReservation;


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
            System.out.println("Enter 1 for add hotels or 2 for display or  3 for cheapest hotel or  4 for Best rated hotel or  5 for loyal customer price or  6 for exit");
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
                    System.out.println("Enter the week days rate of hotel for loyal customer");
                    int lWeekRate = scanner.nextInt();
                    System.out.println("Enter the weekend days rate of hotel for loyal customer");
                    int lWeekEnd = scanner.nextInt();
                    hotels.add(new Hotel(name, weekRate,weekEnd,ratings,lWeekRate,lWeekEnd));
                    scanner.nextLine();
                    break;
                case 2:
                    for (Hotel hotel : hotels) {
                        System.out.println("Hotel list");
                        System.out.println("name:-" + hotel.getName() + " " + "Week days Rate:-" + hotel.getWeekDayRates() + " " + "Weekend Rate:-" + hotel.getWeekEndRates());
                    }
                    break;
                case 3:
                   hotelOps.cheapestHotel(hotels);
                    System.out.println("Cheapest hotel name:-" + hotelOps.hotelName + " " + "Cheapest Price :-" + hotelOps.cheapestPrice + " " + "Ratings :-" + hotelOps.ratings);
                    break;

                case 4:
                    hotelOps.bestRated(hotels);
                    System.out.println("Best Rated hotel name:-" + hotelOps.hotelName + " " + " Price :-" + hotelOps.cheapestPrice + " " + "Ratings :-" + hotelOps.ratings);
                    break;
                case 5:
                    hotelOps.cheapestHotelForLoyalCustomer(hotels);
                    System.out.println("Cheapest hotel name for loyal Customer:-" + hotelOps.hotelName + " " + " Price :-" + hotelOps.cheapestPrice + " " + "Ratings :-" + hotelOps.ratings);
                    break;
                case 6:
                    operation = false;
                    break;



            }
        }




    }


}
