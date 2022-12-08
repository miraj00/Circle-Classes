import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		
		System.out.println("Static Example---");
		Circle c = new Circle(5);
			
		System.out.println("Circumference : " + c.getCircumference());
		System.out.println("Area : " + c.getArea());
		
		System.out.println("Formatted Circumference = " + c.getFormattedCircumference());
		System.out.println("Formatted Area = " + c.getFormattedArea());
		
		
		
		System.out.println("\n\n");
		System.out.println("Now Your Turn---");
		System.out.print(" Please enter a number for radius : ");
		Scanner sc = new Scanner(System.in);
		
	     double num = sc.nextDouble();
		
		Circle c2 = new Circle(num);
		
		System.out.println("Circumference : " + c2.getCircumference());
		System.out.println("Area : " + c2.getArea());
		
		System.out.println("Formatted Circumference = " + c2.getFormattedCircumference());
		System.out.println("Formatted Area = " + c2.getFormattedArea());
		
		
		
	}

}







/*
 * CIRCLE CLASS EXERCISE
Classes
Task: Calculate a circle’s circumference and area.

What will the application do?
Prompt the user to enter a radius.
Display an error if the user enters invalid data.
When the user enters valid data, calculate the area and circumference of the circle and rounds to the nearest 2 decimal places.
Ask if the user wants to continue.
When the user quits, display a “goodbye” message that also indicates the number of circles the user built.

Build Specifications
Create a class named Circle to store the data about this circle. This class should contain these constructors and methods:
public Circle(double radius)
public double getCircumference()
public double getArea()
private static String formatNumber(double x) 
public String getFormattedCircumference()
public String getFormattedArea()
For the value of pi, use the PI constant of the java.lang.Math class.
Create a class named CircleApp that gets the user input, creates a Circle object, and displays the circumference and area.

Hints:
Don’t mess up the formulas for circumference or area of a circle!
Do not include variables for the Area or the Circumference in your class. Those are calculated properties. 
You need to implement the formatNumber() method first. This method will format numbers to the nearest 2 decimal places. Then you can call this method inside getFormattedCircumference by sending the calculated Circumference. The calculated Circumference is done by calling the getCircumference.

 */





