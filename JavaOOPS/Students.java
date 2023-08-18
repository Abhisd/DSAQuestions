package JavaOOPS;

public class Students {
    public static void main(String[] args) {
        Student s1=new Student(101);
        s1.print();
        Student s2=new Student(150, "xyz");
        s2.print();
    }
}
class Student{
    String name;
    int roll;

    Student(int num){
        roll=num;
        name="abc";
    }

    Student(int n,String s){
        roll=n;
        name=s;
    }

    public void print(){
        System.out.println(name+" "+roll);
    }

}