import java.util.*;

class StarTriangle {
    int width;

    StarTriangle() {
        width = 6;
    }


    public String toString() {
        String s="";
        for (int i = 0; i <= width; i++) {
            for (int j = i; j > 0; j--) {
               s+="[*]";
            }
            s+="\n";
        }
        return s;
    }
}
public class b {
    public static void main(String[] args ){
        StarTriangle small = new StarTriangle();
       System.out.println(small.toString());


    }
}
