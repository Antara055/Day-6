import java.util.Scanner;
public class perfect {
 public static void main(String[] args) {
  System.out.println("Enter the number : ");
  Scanner sc = new Scanner(System.in);
  int no = sc.nextInt();
  int temp=0;
  for(int i=1;i<=no;i++)
  {
       if(no%i == 0){
         temp=temp+i;
        }
   }
   if(temp == no) {
       System.out.println(no+" is a perfect number");
   }
   else
       System.out.println(no+" is not a perfect number");
  }
}
