import java.util.Scanner;
class Reap{
    public String arr(int[] a){
        int[] b={a.length*2};
        String s="";
       for(int i=0;i<a.length;i++){
          s+=a[i]+" "+ a[i]+" ";
       }

        return s;
    }
}
public class E {
    public static void main(String[] args){

        int[] a = {1,2,3};
        Reap rp = new Reap();
        System.out.println(rp.arr(a));
    }
}
