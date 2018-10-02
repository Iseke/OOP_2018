import sun.security.x509.CertAttrSet;

import javax.swing.text.View;

class Animal{
 private int id;
    Animal(){
        this.id = 0;
    }
    Animal(int id){
        this.id = id;
    }

    public String Cout(){
        return "*"+id;
    }
    public String print()
    {
        return "#"+id;
    }
}
class Cat extends Animal{
   private String name;
   private int maxAge;
    Cat(){
        super();
        this.name = "No name";
        this.maxAge = 0;
    }
    Cat(String name,int maxAge,int id){
    super(id);
        this.name = name;
        this.maxAge = maxAge;
    }

    public String Cout(String name,int maxValue){
        return super.Cout()+" Name "+name + " maxAge"+ maxValue;
    }
    @Override
    public String print() {
        return super.print()+ "\nName: "+name+ " MaxAge: "+ maxAge;
    }
}

public class Lab3A {
    public static  void main(String[] args){

        Animal animal = new Cat();
        System.out.println(animal.print());


       Cat ct = new Cat("Boris",14,1);
       System.out.println(ct.Cout("Vasya",15));


    }
}
