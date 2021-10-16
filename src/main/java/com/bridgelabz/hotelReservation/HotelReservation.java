package com.bridgelabz.hotelReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {

    public static void main(String[] args) {
        ArrayList <Hotel> hotels = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to hotel reservation");
        System.out.println("Enter the number of hotels");
                int num =  scanner.nextInt();
                scanner.nextLine();
                for(int i =0; i<num; i++){
                    System.out.println("Enter the name of hotel");
                    String name = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Enter the rate of hotel");
                    int rate = scanner.nextInt();
                    hotels.add(new Hotel(name,rate));
                    scanner.nextLine();
                }



    }



}
