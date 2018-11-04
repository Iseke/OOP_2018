import java.util.Arrays;
import java.util.Vector;

public class Lab3E {
//    public static void printInformation(Person1 p) {
//        p.getName();
//    }

    public static void main(String args[]) {
        Student1 st = new Student1("Islam");
        Employee1 emp = new Employee1("Madi");

        Vector<Person1> per = new Vector<Person1>();
        per.add(st);
        per.add(emp);
        for(int i=0;i<per.size();i++){
           per.get(i).getName();
        }


    }
}
 class Person1 {
    String name;

    public Person1() {
        this.name = "null";
    }

    public Person1(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("Person Name: " + this.name);
        return this.name;
    }
}

 class Employee1 extends Person1 {
    public Employee1() {
        super();
    }

    public Employee1(String name) {
        super(name);
    }

    public String getName() {
        System.out.println("Employee Name: " + super.name);
        return super.name;
    }
}
 class Student1 extends Person1{

    public Student1() {
        super();
    }

    public Student1(String name) {
        super(name);
    }

    public String getName() {
        System.out.println("Student Name: " + super.name);
        return super.name;
    }
}