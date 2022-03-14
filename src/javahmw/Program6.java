
/*Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).*/
package javahmw;

import java.util.Scanner;

public class Program6 {
    private static Scanner sc;

    public static void main(String[] args) {
  /*      Scanner io = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        double radius = io.nextDouble();
        System.out.println("Area is = " + (Math.PI * radius * radius));*/

        double radius, area;
        sc = new Scanner(System.in);

        System.out.println("\n Please Enter the radius of a circle: ");
        radius = sc.nextDouble();

        area = Math.PI * radius * radius;
        System.out.println("\n Area of a Circle = " + area);
    }
}

