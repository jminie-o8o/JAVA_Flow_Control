
public class LoopArrayApp {

	public static void main(String[] args) {
		
		String[] users = new String[3];
		users[0] = "jminie";
		users[1] = "jinhuck";
		users[2] = "youbin";
		
		for(int i=0; i<users.length; i++) {
			System.out.println("<li>"+users[i]+"</li>");
		}


	}

}
