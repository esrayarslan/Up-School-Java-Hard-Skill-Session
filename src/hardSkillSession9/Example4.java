package hardSkillSession9;

public class Example4 {

	public static void main(String[] args) {
		
		boolean input1 = true, input2 = false;
		
		boolean result1 = input1 = !input1;
		
		boolean result2 = input2 = input1;
		
		boolean result3 = input1 == (result1 = !input2);
		
		System.out.println(input1 + " " + input2 + " " + result2 + " " + result3);

	}

}
