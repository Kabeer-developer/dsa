class Student{
     String name;
    int age;

    Student(){
        name = "Guest";
        age = 0;
    }

    void display(){
        System.out.println(name+" "+age);
    }
}
public class DefaultConstructor {


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
