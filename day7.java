// abstract class Trainer{
//     abstract void teach();
// }
// class Student extends Trainer{
//     void teach(){
//        System.out.println("training is going on"); 
//     }
// }
// public class day7 {
//     public static void main(String[] args) {
//    Student obj=new Student();
//       obj.teach();
      
//     }
// }
abstract class Trainer {
    abstract void teach();
}

class Student1 extends Trainer {
    void teach() {
        System.out.println("training is going on");
    }
}

public class day7 {
    public static void main(String[] args) {
        Student1 obj = new Student1();
        obj.teach();
    }
}
