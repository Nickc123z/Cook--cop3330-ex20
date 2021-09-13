/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Nick Cook
 */




import java.util.Scanner;



public class E20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int amount = 0;
        double total = 0.0;
        double tax = 0.0;

        System.out.print("What is order amount? ");
        amount = scan.nextInt();

        System.out.print("What state do you live in? ");
        String st = scan.next();

        if(st.equals("Wisconsin")){
            System.out.print("What country do you live in? ");
            String cty = scan.next();
            if(cty.equals("Eau Claire")){
                tax = (amount*5.005)/100;
                total = tax + amount;
            }
            else if(cty.equals("Dunn")){
                tax = (amount*5.004)/100;
                total = tax + amount;
            }
            else{
                System.out.println("Please enter correct country");
            }
        }
        else if(st.equals("Illinois")){
            tax = (amount*8)/100;
            total = tax + amount;
        }
        else{
            tax = 0.0;
            total = amount;
        }
        System.out.println("The tax is  $"+String.format("%.2f",tax));
        System.out.println("The total is  $"+String.format("%.2f",total));
    }
}


