import java.util.Scanner;
public class Week03_2530 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int A;
		int B;
		int C;
		int D;
		
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		D = s.nextInt();
		
		B = B + (D / 60);
		C = C + (D % 60);
		
    B = B + (C / 60);
		C = C % 60;
    
		A = A + (B / 60);
		B = B % 60;
		
		A = A % 24;
		
		System.out.println(A + " " + B + " " + C);
		
		s.close();


	}

}
