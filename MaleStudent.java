/**
 * @class: MaleStudents
 * @author: Daniel Omotere
 * @course: ITEC 2140-04, Spring 2023
 * @written: January 31, 2023
 * @description: This program will generate the total number of male students in the middle school.
 */
public class MaleStudent {
public static void main(String [] args){
    int totalStudents = 389;
    //Total number of students at the middle school.

    int femaleStudents =175;
    //Total number of females at the middle school.

    int maleStudents = totalStudents - femaleStudents;
    // This is the formula to find the total number of male students.

    System.out.println("There are a total of " + maleStudents + " male students in the middle school.");
    }
}