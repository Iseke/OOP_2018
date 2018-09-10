import java.util.*;
class Student{
    String name;
    String id;
    int Yearoftudy;
    Student(){
        name = "Islam";
        id = "17BD777";

    }
}
public class A {
    public static void main(String[] args){

        Student student = new Student();
        student.Yearoftudy = 2;
        System.out.println(student.name+ "\n"+ student.id+"\n"+student.Yearoftudy);
    }
}
