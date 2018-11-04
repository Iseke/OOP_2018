package Task2Package;
class DiscountRate{

    public static double serviceDiscountPremium= 0.2;
    public static double serviceDiscountGold = 0.15;
    public static double serviceDiscountSilver = 0.1;
    public static double productDiscountPremium = 0.1;
    public static double productDiscountGold = 0.1;
    public static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String s){
        double i =0.0;
        if(s.equals("Premium")){
            i= serviceDiscountPremium;
        }
        if(s.equals("Gold")){
            i= serviceDiscountGold;
        }
        if(s.equals("Silver")){
            i= serviceDiscountSilver;
        }
        return  i;
    }
    public static double getProductDiscountRate(String s){
        return 0.1;
    }
}
class Print{
    public static void main(String[] args){
        String name = "Islam";
        String memberType = "Premium";
        String date = "13.10.2018";

        Customer customer = new Customer(name);
        customer.setMember(true);
        customer.setMemberType(memberType);
        customer.getMemberType();
        Visit visit = new Visit(name,date);
//        visit.setProductExpense(1000);
//        visit.setServiceExpense(500);
        System.out.println(visit.getServiceExpense());
       // System.out.println(visit.toString());
    }
}
public class Customer {
    private String  name;
    boolean member =false;
    private String memberType;
    Customer(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public boolean isMember(){
        return member;
    }
    public void setMember(boolean mem){
        if(mem){
            member=true;
        }else member=false;
    }
    public String getMemberType(){
        System.out.println(memberType);
        return memberType;
    }
    public void setMemberType(String st){
        memberType = st;
    }
    public String toString(){
        return name+" "+member+" "+memberType+"";
    }

}
class Visit{
    Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;
    Visit(String name,String date){
        customer = new Customer(name);
        this.date = date;
    }
    public String getName(){
        return customer.getName();
    }
    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }
    public double getServiceExpense(){
        double sum = 0.0;
        if(customer.isMember()){
            sum += DiscountRate.getServiceDiscountRate(customer.getMemberType());
        }
        //System.out.println(sum);
        return serviceExpense-serviceExpense*sum;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }
    public double getProductExpense(){
        double sum=0.0;
        if(customer.isMember()){
            sum += DiscountRate.getProductDiscountRate(customer.getMemberType());
        }
       // System.out.println(productExpense*sum+"   "+sum);
        return productExpense-productExpense*sum;
    }


    public double getTotalExpense(){
        return getProductExpense()+getServiceExpense();
    }
    public String toString(){
        return getName()+" "+getTotalExpense()+" "+date;
    }
}



