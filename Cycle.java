/**
 * @class: Cycle
 * @author: Daniel Omotere
 * @course: ITEC 2140-04, Spring 2023
 * @written: January 31, 2023
 * @description: This program will generate the total number of tricycles.
 */
public class Cycle {
    public static void main(String [] args){
        int totalBicycles = 10;
        //Total number of bicycles.

        int totalNumberOfWheels = 47;
        //Total number of wheels.

        int totalTricycles = totalNumberOfWheels - (totalBicycles * 3);
        //This is the formula to find the total number of tricycles.

        System.out.println("The total number of Tricycles is  " + totalTricycles);
    }
}
