/**
 * @class: Speed Light
 * @author: Daniel Omotere
 * @course: ITEC 2140-04, Spring 2023
 * @written: January 31, 2023
 * @description: This program will generate the distance of a lightning strike based on the time elapsed when heard.
 */
public class SpeedLight1 {
    public static void main(String[] args) {

        int SPEED_OF_SOUND = 340;
        //This is the speed of sound which is approximately 340/s.

        int timeElapsed = 5;
        //This is the time the sound was heard in seconds.

        int distance = SPEED_OF_SOUND * timeElapsed;
        //This is the formula to calculate the distance.

        System.out.println("Speed of Sound: " + SPEED_OF_SOUND);
        System.out.println("Time Elapsed: " + timeElapsed);
        System.out.println("Distance: " + SPEED_OF_SOUND * timeElapsed);


    }
}
