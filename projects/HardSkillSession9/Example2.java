package HardSkillSession9;

public class Example2 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		
		if(x != 1 && y++ == 3) {
			System.out.println("A!");
		}
		else {
			System.out.println("B!");
		}
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
	
}
