
public class Circle {
	double radius;
	
	 final double PI = 3.14; 
	
	public Circle (double radius) {
		this.radius = radius;
	}
	
	
	public double getRadius() {						// getter
		return radius;
	}

	public void setRadius(double radius) {			// setter
		this.radius = radius;
	}
	
	
	
	public double getCircumference() {
		return 2 * PI * radius ;
		
	}
	
	public double getArea() {
		return PI * radius * radius;
	}
	
	
	private static String formatNumber(double x) {
		String fN = String.format("%.2f", x);
		return fN;
	}

	
	public String getFormattedCircumference() {
		
		return formatNumber(getCircumference());

	// Initial Thoughts :	
	//	String fC = String.format("Formatted Circumference is : %.2f", getCircumference());
	//	return  fC;
	}
	
	
	public String getFormattedArea() {
	
		return formatNumber(getArea());
	
	// Initial thoughts : 	
	//	String fA = String.format("Formatted Area is : %.2f", getArea());     // .2f  will round to two decimals										
	//	return fA;
	}

}








/*  ============= Example for rounding to 3 decimals ======================
 * public static void main(String args[]){
 	double a = 123.13698;
	double roundOff = Math.round(a*100)/100;
	String.format("%.3f", roundOff);      //%.3f defines decimal precision you want
	System.out.println(roundOff);   }} 
*/
