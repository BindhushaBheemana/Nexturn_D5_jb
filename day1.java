public class day1{ //operators
    public static void main(String[] args){
        System.out.println("Hello World");
        //Assignment operators
        int x=5;//assigning
        System.out.println(x+=3);
        System.out.println(x-=3);
        System.out.println(x*=3);
        System.out.println(x/=3);
        System.out.println(x%=3);
        System.out.println(x&=3);
        System.out.println(x!=3);
        System.out.println(x^=3);
        System.out.println(x>>=3);
        System.out.println(x<<=3);
        //logical
    
        System.out.println(x<5 && x<10);
        System.out.println(x<5 || x<10);
        System.out.println (!(x<5 && x<10));
    }
}

/*import java.util.*;
public class CelTemp{
    public static void main(String[]  args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(n>30){
            System.out.println("Hot");
        }
        else if(n>=20 || n<=30){
            System.out.println("Warm");
        }
        else if(n<=19.9  || n>=10){
            System.out.println("Moderate");
        }
        else{
            System.out.println("Cold");
        }
        sc.close();
    }
}*/