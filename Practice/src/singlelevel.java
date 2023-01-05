class Sports{
	String name="Sport";
}

class Football extends Sports{
	String name2="Football";
}

public class singlelevel {

	public static void main(String[] args) {
		Football f2=new Football();
		System.out.println(f2.name2 +" "+ "is my favourite "+f2.name);
	}
}
