import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		
		System.out.println((A + B) % C );
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println((A % C * B % C) % C);
		

	}

}
