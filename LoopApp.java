
public class LoopApp {

	public static void main(String[] args) {
		
		System.out.println("---while---");
		
		int i = 0;
		while(i < 3) {
			System.out.println(2);
			System.out.println(3);
			i++;
		}
		
		System.out.println("---for---");
		
		//위에서 i를 썼기때문에 i대신 j를 써주었다.
		for(int j=0; j < 3; j++) {
			System.out.println(2);
			System.out.println(3);
		}


	}

}
