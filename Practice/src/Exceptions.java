
public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		System.out.println("This is for showing out of bounds exception.");
		try {
			System.out.println("Trying to access 6th element" + " " + a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index");
		}
		
	}

}
