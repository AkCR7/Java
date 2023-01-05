
public class NullExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String animals = null;
		try{
			if(animals.equals("lion"))
				System.out.println("Same");
			else
				System.out.println("Not equal");
		}
		catch(NullPointerException e) {
			System.out.println("Throw Null Pointer Exception");
		}
	}
}
