package Task3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.text.ParseException;

class Person implements Cloneable{
    private String name;

    public Person(){
        name = "";
    }

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean equals(Person pr){

        if(this.name.equals(pr.name))return true;
        return false;
    }

    public String toString(){
        return this.name;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}

class Employee extends Person implements Comparable,Cloneable{

    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee(){
        super();
        salary = 0;
        hireDate = null;
        insuranceNumber = "";
    }

    public double getSalary(){
        return this.salary;
    }

    public Employee(String name, double salary, Date hireDate, String insuranceNumber){
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public boolean equals(Employee emp){
        if(super.equals(emp) && this.salary == emp.salary && this.hireDate.equals(emp.hireDate) && this.insuranceNumber.equals(emp.insuranceNumber))return true;
        return false;
    }

    public String toString(){
        return super.toString() + " " + this.salary + " " + this.hireDate + " " + this.insuranceNumber;
    }


    @Override
    public int compareTo(Object o) {
        Employee emp = (Employee)o;
        if(this.salary > emp.salary){
            return 1;
        }
        else if(this.salary < emp.salary){
            return -1;
        }
        else return 0;
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        return (Employee)super.clone();
    }
}

class Manager extends Employee implements Comparable,Cloneable{
    private Vector<Employee> vemp = new Vector<Employee>();
    private double bonus;

    public Manager(){

        super();
        bonus = 0;
        vemp = null;
    }

    public Manager(String name, double salary, Date hireDate, String insuranceNumber,double bonus){
        super(name,salary,hireDate,insuranceNumber);
        this.bonus = bonus;
    }

    public void addEmployee(Employee e){
        vemp.addElement(e);
    }

    public boolean equals(Manager m){
        if(super.equals(m) &&  this.bonus == m.bonus )return true;
        return false;
    }

    public String toString(){
        String s = "";

        for(int i=0;i<vemp.size();++i){
            s += vemp.get(i).getName() + " ";
        }
        return super.toString() + " " + s + " " + this.bonus;
    }

    public int compareTo(Object obj){
        Manager mg = (Manager)obj;
        if(this.getSalary() > mg.getSalary()){
            return 1;
        }
        else if(this.getSalary() == mg.getSalary()){
            if(this.bonus > mg.bonus){
                return 1;
            }
            else if(this.bonus < mg.bonus){
                return -1;
            }
            else return 0;
        }
        else return -1;
    }

    @Override
    protected Manager clone() throws CloneNotSupportedException {
        return (Manager)super.clone();
    }
}

public class Third {
    public static void main(String args[]) throws ParseException {
        Person p1 = new Person("Islam");
        Person p2 = new Person("Dauren");

        System.out.println(p1.equals(p2));
        System.out.println(p1.toString());
        System.out.println(p2.toString() + "\n");

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date first = date.parse("1999-07-18");
        Date second =  date.parse("2001-09-22");

        Employee e1 = new Employee("Temirbek",500.258,first,"expired");
        Employee e2 = new Employee("Kunshiraq",500.259,second,"expired");

        System.out.println(e1.equals(e2));
        System.out.println(e1.toString());
        System.out.println(e2.toString() + "\n");

        Date third = date.parse("2003-02-14");
        Date fourth = date.parse("2004-12-13");

        Manager m1 = new Manager("Dasha",500.257,third,"not expired",50.2);
        Manager m2 = new Manager("Dasha",500.257,fourth,"not expired",232.5);
        m1.addEmployee(e1);
        m2.addEmployee(e2);

        System.out.println(m1.equals(m2));
        System.out.println(m1.toString());
        System.out.println(m2.toString() + "\n");

    }
}

