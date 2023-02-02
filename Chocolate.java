/**
 * @class: Chocolate
 * @author: Daniel Omotere
 * @course: ITEC 2140-04, Spring 2023
 * @written: January 28, 2023
 * @description: This program will generate number of bags needed
 */
public class Chocolate {
    public static void main(String [] args){
        int currentBags = 9;
        int currentChocolates = currentBags * 2;
        int desiredChocolates = currentBags * 3;
        int neededBags = (desiredChocolates - currentChocolates) / 3;
        System.out.println("Number of bags needed: " + neededBags);

    }
}
