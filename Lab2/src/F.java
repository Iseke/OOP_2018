import java.util.*;

class EnglishNumbers{

    private static final String[] numNames={
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"

    };
    private static final String[] tensNumbers={
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };
    public  String resInt(int n){
        String res="";
        String vse = "";
        int v=n/1000;
        if(v>=20 && v<=99){
            res= tensNumbers[v/10]+" "+numNames[v%10]+" thousands";
        }
        else if(v>=1 && v<=19){
            res= numNames[v]+" thousands";
        }
         if(v==0){
            res = "";
        }
        int h = (n%1000)/100;
        int t = (n%1000)%100;

            if(h>=1 && h<=9) {
                if(t>=20 && t<=99) {
                    vse = numNames[h] + " hundred [and]" + tensNumbers[t / 10] + " " +numNames[t%10];
                }
                else if(t>=1 && t<=19){

                    vse = numNames[h] + " hundred [and]" + numNames[t];
                }
                else if(t==0){
                    vse = numNames[h] + " hundred";
                }
            }
            else if(h==0){
                if(t>=20 && t<=99) {
                    vse = "[and] "+ tensNumbers[t / 10] + " " +numNames[t%10];
                }
                else if(t>=1 && t<=19){
                    if(t>=1 && t<=9){
                        vse =  numNames[t];
                    }
                    else{
                        vse =  numNames[t];
                    }
                }
                else if(t==0){
                    vse = "";
                }

            }

        return res+" "+vse;
    }
}
public class F {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        if(n==0){
            System.out.println("zero");
            return;
        }
        EnglishNumbers en = new EnglishNumbers();
        System.out.println(en.resInt(n));
    }

}
