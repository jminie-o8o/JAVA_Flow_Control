
public class AuthApp2 {

	public static void main(String[] args) {
		
		String id = "jminie";
		String inputid = args[0];
		
		String pass1 = "1234";
		String pass2 = "4321";
		String inputpass = args[1];

		
		
		System.out.println("Hi");
		
		boolean isRightpass = (inputpass.equals(pass1) || inputpass.equals(pass2));
		
			if(inputid.equals(id) && isRightpass  ) {
				System.out.println("Master!");
		} else {
			System.out.println("But who are you?");
		}

 
	}

}
