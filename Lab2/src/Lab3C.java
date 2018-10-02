import java.util.Vector;

public class Lab3C {
    public static  void main(String[] args){

        Employee employee = new Employee("Islam",5000,2,"777isa07");
        Employee employee1 = new Employee("Temirbek",4500,1,"13tima144");
        System.out.println(employee.toString());
        System.out.println(employee1.toString());

        System.out.println(employee.equals(employee1));

        Manager manager = new Manager(50,"Isa",3500,2,"iseke18");
        manager.AddEmployee(employee);
        manager.AddEmployee(employee1);
        System.out.println(manager.toString());
        Manager manager1 = new Manager(50,"Iasdfasa",3500,2,"iseke18");
        manager1.AddEmployee(employee1);
        manager1.AddEmployee(employee);
        System.out.println(manager1.toString());
        System.out.println(manager1.equals(manager));
    }


}
class Person
{
    private String name;
    Person(){
        name="";
    }
    Person(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }
    public String toString(){
        return name;
    }
    public boolean equals(Person pers){
        if(this.name.equals(pers.name))return true;
        return false;
    }

}
class Employee extends Person
{
    private double salary;
    private int yearofwork;
    private String insuranceNumber;
    Employee()
    {
        super();
        salary = 0.f;
        yearofwork = 0;
        insuranceNumber = "";
    }
    Employee(String name,double salary,int yearOfwork,String insuranceNumber)
    {
        super(name);
        this.salary = salary;
        this.yearofwork = yearOfwork;
        this.insuranceNumber = insuranceNumber;
    }
    public boolean equals(Employee employee){
        if(super.equals(employee)&& this.salary==employee.salary && this.yearofwork==employee.yearofwork && this.insuranceNumber==employee.insuranceNumber)return true;
        return false;
    }
    public String toString(){
        return "Name: "+super.toString()+" Salary: "+this.salary+" YearOfWork: "+ this.yearofwork+" InsuranceNUmber: "+this.insuranceNumber;
    }
}
class Manager extends  Employee
{
    public Vector<Employee> employeeVector = new Vector<Employee>();
    private double bonus;
    static int team;
    Manager(){
        super();
        bonus =0;

        employeeVector = null;

    }

    Manager(int bonus,String name,double salary,int yearOfwork,String insuranceNumber)
    {

        super(name,salary,yearOfwork,insuranceNumber);
        this.team++;
        this.bonus = bonus;

    }

    public void AddEmployee(Employee empl)
    {
        employeeVector.add(empl);
        this.bonus +=bonus;
    }
    public String toString(){
        String s="";
        for(int i=0;i<employeeVector.size();i++){
            s+="\n"+employeeVector.get(i).toString();

        }
        return "Team: "+team+" Bonus :"+bonus+"\n"+super.toString()+""+s;
    }
    public boolean equals(Manager m){
        if(super.equals(m) &&  this.bonus == m.bonus )return true;
        return false;
    }
}