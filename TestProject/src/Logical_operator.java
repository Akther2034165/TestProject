import java.util.Scanner;
public class Logical_operator {

	public static void main(String[] args) {
	
		char ch;
		Scanner sc = new Scanner(System.in);
		
		ch = sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println("The letter is capital");
			
		}
		else
		{
			System.out.println("The letter is small");
		}

	}

}
