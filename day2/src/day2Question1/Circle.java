package day2Question1;
	public class Circle {
		private static double PI= 3.14;
		private double radius;
		private String color = "red";

		public Circle(double radius) {
			this.radius=radius;
		}
		public double getRadius() {
			return this.radius;
		}
		public double getArea() {
			return PI*radius*radius;
		}
			public static void main(String[] args) {
				Circle c = new Circle(10);
				System.out.println("Radius of Circle :"+c.getRadius());
				System.out.println("Area of Circle :"+c.getArea());
			}
	}
