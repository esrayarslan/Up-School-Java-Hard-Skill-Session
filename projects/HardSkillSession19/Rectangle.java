package HardSkillSession19;

public class Rectangle extends Shape {
	public Rectangle(int x, int y) {
		super(x, y);
	}

	@Override
	public double area() {
		
		return x * y;
	}

	@Override
	public double perimeter() {
		
		return 2 * (x+y);
	}

	}
	


