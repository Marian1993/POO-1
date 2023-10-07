package org.example.PracticaNasa;

import java.util.Scanner;

public class TractamentExcepcioInt {

    private static Scanner sc = new Scanner(System.in);

    public static int parseigAInt() {

        while (true) {
            String paraula = sc.nextLine();
            int num;
            try {

                num = Integer.parseInt(paraula);

                return num;

            } catch (NumberFormatException e) {

                System.err.println("Has de posar un número");
            }
        }
    }
}
