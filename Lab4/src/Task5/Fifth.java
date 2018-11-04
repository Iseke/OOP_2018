package Task5;
class MinMax{
    static class Results{
        public int max;
        public int min;
        public Results(int min,int max){
            this.min = min;
            this.max = max;
        }

        public String toString(){
            return this.max +" " +this.min + "";
        }
    }
    public static Results minMax(int values[]){
        int mx = -1000000;
        int mn = 1000000;
        for(int i = 0;i< values.length;++i){
            if(values[i] > mx){
                mx = values[i];
            }
            if(values[i] < mn){
                mn = values[i];
            }
        }
        Results r =  new Results(mx,mn);
        return r;
    }
}

public class Fifth {
    public static void main(String args[]){
        int values[] = {0,8,-3,20};
        MinMax m = new MinMax();
        System.out.println(m.minMax(values).toString());
    }
}
