package co.grandcircus;

public class Circle {

	double radius;

	public Circle(double rad) {

		radius = rad;

	}

	public double getCircumference() {

		return 2 * Math.PI * radius;
	}

	public double getArea() {

		return Math.PI * radius * radius;
	}

	private static String formatNumber(double x) {
		return String.format("%.2f \n", x);

	}

	public String getFormattedCircumference() {
		return "Circumference: " + formatNumber(getCircumference());
	}

	public String getFormattedArea() {
		return "Area: " + formatNumber(getArea());
	}

}
