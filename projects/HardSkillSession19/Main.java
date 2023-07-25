package HardSkillSession19;

public class Main {
	public static void main(String[] args) {
		Shape shape = new Shape(1, 2);
		var area = shape.area();
		var perimeter = shape.perimeter();
		System.out.println("Area : " + area + " perimetir : " + perimeter);
		
		Shape shapeRectangle = new Rectangle(2, 2);
		Shape shapeCircle = new Circle(3, 3);
		
		double perimeter1 = shapeRectangle.perimeter();
		double perimeter2 = shapeCircle.perimeter();
		
		System.out.println("Perimeter rectangle : " + perimeter1 + " Perimeter circle " + perimeter2);
		
		printPerimeter(shape);
	}

	
	public static void printPerimeter(Shape shape) {
		double perimeter = shape.perimeter();
		System.out.println(" Shape perimeter " + perimeter);
	}
}
