/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candymachine;

import java.util.Scanner;

/**
 *
 * @author Ethan Akers 21008
 */
public class CandyMachine {
//NOTE Scanner is scn
    public static Scanner scn = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the Candy Store! How much money do you have?");
        double moneyInput = scn.nextDouble();
        double balance = moneyInput;
        
        System.out.println("You have inserted: $" + moneyInput);
        System.out.println("Here are your options: \n");
        System.out.println("A   $" + goyaCCPrice() +" "+ goyaCubanCrackers());
        System.out.println("B   $" + hersheysPrice() +" "+ hersheysBar());
        System.out.println("C   $" + plantainPrice() +" "+ plantainChips());
        System.out.println("D   $" + twixPrice() +" "+ twixBar());
        System.out.println("E   $" + mandMsPrice() +" "+ mandMs());
        System.out.println("F   $" + iceBreakersPrice() +" "+ iceBreakers());
        System.out.println("G   $" + skittlesCandyPrice() +" "+ skittlesCandy());
        String candySelection = scn.nextLine();
        if(moneyInput < 0.50){
            System.out.println("You have too low of a balance, and cannot afford anything! ");
            
        }
        
        System.out.print("Please make your selection! >");
        
        if (candySelection.equalsIgnoreCase("A")){
            balance -= goyaCCPrice();
            System.out.println("You have selected: " + goyaCubanCrackers() + "for $" + goyaCCPrice());
        }
        else if (candySelection.equalsIgnoreCase ("B")){
            balance -= hersheysPrice();
            System.out.println("You have selected: " + hersheysBar() + "for $" + hersheysPrice());
        }
        else if (candySelection.equalsIgnoreCase ("C")){
            balance -= plantainPrice();
            System.out.println("You have selected: " + plantainChips() + "for $" + plantainPrice());
        }
        else if (candySelection.equalsIgnoreCase ("D")){
            balance -= twixPrice();
            System.out.println("You have selected: " + twixBar() + "for $" + twixPrice());
        }
        else if (candySelection.equalsIgnoreCase ("E")){
            balance -= mandMsPrice();
            System.out.println("You have selected: " + mandMs() + "for $" + mandMsPrice());
        }
        else if (candySelection.equalsIgnoreCase ("F")){
            balance -= iceBreakersPrice();
            System.out.println("You have selected: " + iceBreakers() + "for $" + iceBreakersPrice());
        }
        else if (candySelection.equalsIgnoreCase ("G")){
            balance -= skittlesCandyPrice();
            System.out.println("You have selected: " + skittlesCandy() + "for $" + skittlesCandyPrice());
        }
        if(balance < goyaCCPrice() || balance < hersheysPrice() || balance < plantainPrice() || balance < twixPrice() || balance < mandMsPrice() || balance < iceBreakersPrice() || balance < skittlesCandyPrice()){
            System.out.println("Sorry, your balance is too low! Go somewhere else b r o k e b o i!!!");
        }
    }
    public static String goyaCubanCrackers(){
        return "Goya Cuban Crackers";
    }
    public static double goyaCCPrice(){
        double goyaCCPrice = 0.50;
        return goyaCCPrice;
    }
    public static String hersheysBar(){
        return "Hershey's Chocolate Bar";
        
    }
    public static double hersheysPrice(){
        double hersheysPrice = 1.00;
        return hersheysPrice;
    }
    public static String plantainChips(){
        return "Sweet Plantain Chips";
        
    }
    public static double plantainPrice(){
        double plantainPrice = 0.75;
        return plantainPrice;
    }
    public static String twixBar(){
        return "Twix Chocolate Bar";
    }
    public static double twixPrice(){
        double twixPrice = 1.50;
        return twixPrice;
    }
    public static String mandMs(){
        return "M&M's";
    }
    public static double mandMsPrice(){
        double mandMsPrice = 1.00;
        return mandMsPrice;
    }
    public static String iceBreakers(){
        return "Ice Breakers Mints";
        
    }
    public static double iceBreakersPrice(){
        double iceBreakersPrice = 0.50;
        return iceBreakersPrice;
    }
    public static String skittlesCandy(){
        return "Skittles Candy";
    }
    public static double skittlesCandyPrice(){
        double skittlesCandyPrice = 1.00;
        return skittlesCandyPrice;
    }
}
    