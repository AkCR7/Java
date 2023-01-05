import java.util.*;

public class ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int income = sc.nextInt();
		if(income>5000) 
			System.out.println("Your income is greater than 5000\n");
		else if(income<5000 && income>3000) 
			System.out.println("Your income is greater than 3000 but less than 5000\n");
		else if(income<3000 && income>1000)
			System.out.println("Your income is greater than 1000 but less than 3000\n");
		else
			System.out.println("Your income is less than 1000\n");
		}
}
