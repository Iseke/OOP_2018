import java.io.Serializable;

public class Instructor implements Serializable {
    private String name,surname,department,email;
    public Instructor(){
        name="no name";
        surname="no surname";
        department="no department";
        email = "no email";
    }
    public Instructor(String name,String surname,String department,String email){
        this.name = name;
        this.surname=surname;
        this.department=department;
        this.email=email;
    }
    public void setDepartment(String department) { this.department = department; }
    public void setEmail(String email) { this.email = email; }
    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }

    public String getDepartment() { return department; }
    public String getEmail() { return email; }
    public String getName() { return name; }
    public String getSurname() { return surname; }

    public boolean equals(Object obj){
        if(obj==null)return false;
        if(this==obj)return true;
        if(!(obj instanceof Instructor))return false;
        Instructor inst = (Instructor)obj;
        if(this.email.equals(inst.email) && this.department.equals(inst.department) && this.surname.equals(inst.email) && this.name.equals(inst.name))return true;
        else return false;
    }
    public String toString(){
        return "Instructor: Name:" + this.name + "  Surname:" + this.surname + "  Department:" + this.department + "  email:"+this.email;
    }
}
