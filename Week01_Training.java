import java.util.Scanner;
public class Week01_Training {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int x;
		
		System.out.println("16 ~ 32 사이의 정수를 입력하세요 : ");
		x = s.nextInt();
		
		if(x>16 && x < 32)
		{
			System.out.println( Integer.toBinaryString(x));
			System.out.println( Integer.toBinaryString(~x));
			
		}
			
		else 
		{
				System.out.println("다시 입력해 주세요.");
			}
	}

}

