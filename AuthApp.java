
public class AuthApp {

	public static void main(String[] args) {
		
		String id = "jminie";
		String inputid = args[0];
		
		String pass = "1234";
		String inputpass = args[1];
		
		System.out.println("Hi");
		
		//id도 맞고 pass도 맞다면 Master
//		if(inputid.equals(id)) {
//			if(inputpass.equals(pass)) {
//				System.out.println("Master!");
//		} else {
//			System.out.println("Wrong password!");
//			}
//		} else {
//			System.out.println("But who are you?");
//		}
		
			if(inputid.equals(id) && inputpass.equals(pass)) {
				System.out.println("Master!");
		} else {
			System.out.println("But who are you?");
		}

 
	}

}
