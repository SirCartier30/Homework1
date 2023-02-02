/**
 * @class: Circle
 * @author: Daniel Omotere
 * @course: ITEC 2140-04, Spring 2023
 * @written: January 31, 2023
 * @description: This program will print out the area and perimeter of the circle.
 */
public class Circle {
    public static void main (String [] args ){
        double radius = 9.5;
        //This is the radius of the circle.

        double area = radius * radius * Math.PI;
        //This is the formula to calculate the area.

        double perimeter =2  * radius * Math.PI;
        //This is the perimeter of the circle.

        System.out.println(" The area of the circle is " + area);
        System.out.println(" The perimeter of the circle is " + perimeter);

    }
}
