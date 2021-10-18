import java.util.Scanner;
public class prime {
public static void main(String[] args) {
  System.out.println("Enter the number : ");
  Scanner sc = new Scanner(System.in);
  int no = sc.nextInt();
  for(int i=2;i<=no/2;i++)
  {
     if(no%i == 0){
       System.out.println("number is not prime");
       break;
     } 
     else
       System.out.println("number is prime");
  }
}
}
