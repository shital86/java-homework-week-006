package javahmw;
/*Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)*/
import java.util.Scanner;
public class Program5 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Input first number: ");
            int num1 = in.nextInt();

            System.out.print("Input second number: ");
            int num2 = in.nextInt();


            System.out.println(num1 + " + " + num2 + " = " +
                    (num1 + num2));

            System.out.println(num1 + " - " + num2 + " = " +
                    (num1 - num2));

            System.out.println(num1 + " x " + num2 + " = " +
                    (num1 * num2));

            System.out.println(num1 + " / " + num2 + " = " +
                    (num1 / num2));


        }

    }

