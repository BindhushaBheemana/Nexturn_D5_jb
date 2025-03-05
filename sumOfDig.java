import java.util.Scanner;
public class sumOfDig{
 public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
   System.out.println("enter number:");
       int num=sc.nextInt();
       System.out.println(sumDig(num));
 }
public static int sumDig(int num){
   if(num==0){
      return 0;
  }else{
     return (num%10)+sumDig(num/10);
  }
}
}