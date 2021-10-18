import java.util.Scanner;
public class fibbonacci {
 public static void main(String[] args) {
  System.out.println("Enter the range : ");
  Scanner sc = new Scanner(System.in);
  int no = sc.nextInt();
  int a = 0;
  int b = 1;
  System.out.println(a);
  System.out.println(b);

  for(int i=1;i<=no;i++)
  {
       int c = a+b;
       System.out.println(c);
       a=b;
       b=c;
  }
  }
}
