import java.util.Scanner;
class Reap{
    public int[] arr(int[] a){
        int[] b = new int[a.length*2];

        for(int i=0;i<a.length;i++){
            b[i*2] = a[i];
            b[i*2+1]=a[i];

        }


        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        return b;
    }

}
public class E {
    public static void main(String[] args){

        int[] a = {1,2,3};
        Reap rp = new Reap();
        System.out.println(rp.arr(a));
    }
}
