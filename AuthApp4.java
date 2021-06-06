
public class AuthApp4 {


	public static void main(String[] args) {
		
		String[][] users = {
				{"jminie","1111"},
				{"jinhuck","2222"},
				{"youbin","3333"}
		};
		String inputId = args[0];
		String inputpass = args[1];

		
		boolean isLogined = false;
		for(int i=0; i<users.length; i++) {
			String[] current = users[i];
			if(current[0].equals(inputId) && current[1].equals(inputpass)) {
				isLogined = true;
				break;
			}
		}
		
		System.out.println("Hi");
		if(isLogined == true) {
			System.out.println("Master!");
		}
		else {
			System.out.println("Who are you?");
		}
	
	}

}
