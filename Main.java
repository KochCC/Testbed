//"Inspired" by Monty Python's Search for the Holy Grail movie, Bridge of Death scene
import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner inputword = new Scanner(System.in);

System.out.println("YOU HAVE OPENED UP THE BRIDGE...I mean...PROGRAM OF DEATH! \n");
System.out.println("What is your name?");
String userName = inputword.nextLine();

System.out.println("\nWhat is your quest?");
String thisisthequest = inputword.nextLine();

System.out.println("\nWhat is the capital of Assyria?");
String oneofafewcities = inputword.nextLine();

System.out.println("\nWhat is the airspeed of the unlaiden European swallow in meters per second?");
Double europeanswallows = inputword.nextDouble();  //I am not sure how to do a test to see if a number was typed yet

System.out.println("\nWhat is the airspeed of the unlaiden African swallow in meters per second?");
Double africanswallows = inputword.nextDouble();  //I am not sure how to do a test to see if a number was typed yet

System.out.println("\n\n\n\n\n\nSir " + userName + ", trying to " + thisisthequest + ",");
System.out.println("Who does not realize " + oneofafewcities + " is the wrong way to spell the capitol of Assyria,");
System.out.println("who assumes " + europeanswallows + "is the airspeed of the unlaiden European swallow,");
System.out.println("and that the unlaiden airspeed of the African swallow is" + africanswallows + ",");
System.out.println("has the program's fullest permission to do the thing!");

}
}