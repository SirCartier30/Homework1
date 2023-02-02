/**
 * @class: Chocolate
 * @author: Daniel Omotere
 * @course: ITEC 2140-04, Spring 2023
 * @written: January 31, 2023
 * @description: This program will generate number of bags needed to have 3 chocolate bars in each bag.
 */
public class Chocolate {
    public static void main(String [] args){
        int currentBags = 9;
        //The current bags of chocolate there is.

        int currentChocolates = currentBags * 2;
        int desiredChocolates = currentBags * 3;
        int neededBags = (desiredChocolates - currentChocolates) / 3;
        //This is the formula to find the number of bags you will need to add three chocolate.

        System.out.println("Number of bags needed: " + neededBags);

    }
}
