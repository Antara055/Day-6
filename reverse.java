import java.util.Scanner;
public class reverse {
 public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter any Number: ");
		int Num = sc.nextInt();
                int rem=0;
                int rev=0;
		while(Num!=0) {
			 rem=Num%10;
                         rev=rev*10+rem;
                         Num=Num/10;
			}
		
		System.out.println("Reverse Number is" +rev);
		}
}
