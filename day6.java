import java.util.*;

public class day6 {
   /*  String name,Sname,a,title,author;
    int b,roll;
    char grade;
    double price;
    String accHolder;
    int accNum;
    double accBal;*/
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
       // day6 obj=new day6("hhjgjh");
       // day6 obj1=new day6("lkjkj",98);
        //day6 sObj=new day6("Ramya", 156,'A');
        //day6 bObj=new day6("Java Programming","James Gosling",30.5);
        //day6 bObj1=new day6(bObj);
        //obj.show();
       // obj1.show1();
      // sObj.Stushow();
      /*System.out.println("Original Book Details:");
        bObj.bookshow();
        System.out.println("");
        System.out.println("Copied Book Details:");
        bObj1.bookshow();*/
       /* day6 bankObj=new day6("Sharmila",123, 5000);
        bankObj.show();
        System.out.println("if u want to deposit enter 1, withdrawl 2, display details 3");
        int i=sc.nextInt();
        if (i==1){
            System.out.println("Enter the amount to deposit");
            double dep=sc.nextDouble();
            bankObj.deposit(dep);
        }else if (i==2) {
            System.out.println("Enter the amount to withdrawl");
            double wit=sc.nextDouble();
           bankObj.withdrawl(wit);
        }else{
            bankObj.show();
        }*/ 
        Teacher obj=new Teacher();
        obj.speak();
        obj.teaach();
        
    }
  /*  public void deposit(double deposit){
     accBal+=deposit;
     System.out.println("Updated Balance:"+accBal);
   }
   public void withdrawl(double withdrawl){
    if(withdrawl>accBal){
        System.out.println("Insufficient balance");
    }else{
        accBal-=withdrawl;
        System.out.println("Updated Balance:"+accBal);
    }
   }*/
   /*  public day6(String nam){
      name=nam;
    }
    void show(){
        System.out.println(name);
    }*/
   /* day6(String a,int b){
        this.a=a;
        this.b=b;
    }
    void show1(){
        System.out.println(a+" "+b);
    }*/ 
   /*  day6(String Sname,int roll,char grade){
        this.Sname=Sname;
        this.roll=roll;
        this.grade=grade;
    }
    void Stushow(){
        System.out.println("Student Details:");
        System.out.println("Name:"+ Sname );
        System.out.println("Roll Number:"+ roll );
        System.out.println("Grade:"+ grade );
    }*/
  /* public day6(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void bookshow(){
        System.out.println("Title:"+ title );
        System.out.println("Author:"+ author);
        System.out.println("Price:"+price );
    }
    day6(day6 other){
        this.title=other.title;
        this.author=other.author;
        this.price=other.price;
    }*/ 
    /*day6(String accHolder,int accNum,double accBal){
        this.accHolder=accHolder;
        this.accNum=accNum;
        this.accBal=accBal;
    }
    void show(){
        System.out.println("Account Holder:"+accHolder);
        System.out.println("Account Number:"+accNum);
        System.out.println("Balance:"+ accBal);
    }*/
   
}
class Student{
    void speak(){
        System.out.println("yes students are public");
    }
   }
   class Teacher extends Student{
    void teaach(){
        System.out.println("teacher speaks ");
    }
}


