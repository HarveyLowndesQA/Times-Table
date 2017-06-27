
public class LoopyLoop {

	public static void main(String[] args) {
		/*for(int a = 1; a < 10; a++) {
			System.out.println(a);
			if(a%2 == 0) {
				System.out.println("Even");
				if(a > 5) {
					System.out.println("-");
				} else {
					System.out.println("*");
				}
			} else {
				System.out.println("Odd");
				if(a > 5) {
					System.out.println("!");
				} else {
					System.out.println("?");
				}
			}
		}*/
		
		/*int a = 1;
		while(a < 10) {
			System.out.println(a);
			if(a%2 == 0) {
				System.out.println("Even");
				if(a > 5) {
					System.out.println("-");
				} else {
					System.out.println("*");
				}
			} else {
				System.out.println("Odd");
				if(a > 5) {
					System.out.println("!");
				} else {
					System.out.println("?");
				}
			}
			a++;
		}*/
		
		//int a = 10;
		//while(a < 2) {
		//	System.out.println("Got here.");
		//} 
		
		/*for(int i = 1; i <= 10; i++) {
			
			if(i%2 != 0) {
				for(int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			} else {
				System.out.println(i);
			}
		}*/
		
		add((float) 2.0f);
		add((double) 2.0);
		
	}
	
	public static void add(Float f) {
		System.out.println("float");
	}
	
	public static void add(Double d) {
		System.out.println("double");
	}

}
