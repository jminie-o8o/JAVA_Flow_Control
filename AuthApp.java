
public class AuthApp {

	public static void main(String[] args) {
		
		
		String id = "jminie";
		String inputId = args[0];
		
		System.out.println("Hi!");
		
		
		if(inputId.equals(id)) {
			System.out.println("Master");
		} else {
			System.out.println("But Who are you?");
		}

	}

}
