package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String memStat = sc.nextLine().toLowerCase();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if(memStat.equals("regular")){
            if(age < 18) System.out.println("Price: $50.00");
            else if (age >= 18 && age < 64) System.out.println("Price: $100.00");
            else if (age >= 64) System.out.println("Price: $75.00");
            else System.out.println("Invalid age.");
        } else if (memStat.equals("vip")) {
            if(age < 18) System.out.println("Price: $75.00");
            else if (age >= 18 && age < 64) System.out.println("Price: $150.00");
            else if (age >= 64) System.out.println("Price: $112.50");
            else System.out.println("Invalid age.");
        } else if (memStat.equals("premium")) {
            if(age < 18) System.out.println("Price: $100.00");
            else if (age >= 18 && age < 64) System.out.println("Price: $200.00");
            else if (age >= 64) System.out.println("Price: $150.00");
            else System.out.println("Invalid age.");
        } else System.out.println("Invalid membership status entered.");

    }
}