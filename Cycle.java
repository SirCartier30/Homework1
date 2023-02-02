/**
 * @class: Speed Light
 * @author: Daniel Omotere
 * @course: ITEC 2140-04, Spring 2023
 * @written: January 28, 2023
 * @description: This program will generate the taotal number of tricycles.
 */
public class Cycle {
    public static void main(String [] args){
        int totalBicycles = 10;
        int totalNumberOfWheels = 47;
        int totalTricycles = totalNumberOfWheels - (totalBicycles * 3);
        System.out.println("The total number of Tricycles is  " + totalTricycles);
    }
}
