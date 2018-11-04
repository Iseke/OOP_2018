package Task1Package;

public class Sequence {
    private String field;
    public Sequence(){};
    public void setField(String s){
        this.field = s;
    }
    public String getField(){
        return this.field;
    }
    public boolean isPalinfrome(){
        String s1="",s2="";
        for(int i=field.length();i>0;i--){
            s1+=field.charAt(i)+"";
        }
        if(field.equals(s1))return true;
        else return false;

    }
    public void isSubString(String s){
        if(this.field.contains(s)){
            System.out.println("YES");
        }
        else System.out.println("No");
    }
}
class First{
    public static void main(String[] args){
        Sequence sequence = new Sequence();
        sequence.setField("Islam");
        Sequence s = new Sequence();
        s.setField("Isl");
        sequence.isSubString(s.getField());
        System.out.println(sequence.isPalinfrome());
    }
}