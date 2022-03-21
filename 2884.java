import java.util.Scanner;

public class Week03_2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int H;
		int M;
    
		H = s.nextInt();
		M = s.nextInt();
		
		if(M < 45) {
			H = H - 1;
			M = 60 - (45 - M);
		
		if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		
		else {
			System.out.println(H + " " + (M - 45));
		}
		s.close();
	}

}
