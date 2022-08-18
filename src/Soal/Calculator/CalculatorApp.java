package Soal.Calculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        boolean condition = true;
        while (condition){
            Scanner scan = new Scanner(System.in);
            System.out.print("Value 1: ");
            int value1 = scan.nextInt();
            System.out.print("Value 2: ");
            int value2 = scan.nextInt();

            System.out.println("\n===========================");
            System.out.println("Please Choose Oeration:");
            System.out.println("\t1. Add Value");
            System.out.println("\t2. Sub Value");
            System.out.println("\t3. Multiple Value");
            System.out.println("\t4. Divide Value");
            System.out.println("\t5. Exit");
            System.out.print("Pilihan: ");
            int input = scan.nextInt();

            System.out.print("Hasil: ");
            switch (input) {
                case 1 -> System.out.println(Operations.addOperation(value1, value2));
                case 2 -> System.out.println(Operations.subOperation(value1, value2));
                case 3 -> System.out.println(Operations.multiplyOperation(value1, value2));
                case 4 -> System.out.println(Operations.divideOperation(value1, value2));
                case 5 -> {condition =false; System.out.println();}
                default -> System.out.println("false input");
            }
            System.out.println();
        }
    }
}
