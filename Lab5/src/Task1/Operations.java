package Task1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Operations {
    int minscore = 10000;
    int maxscore=-10000;
    int count =0;
    int sum=0;
    public int[]  Do(){
        int res[] = {1,2,3};
        try{
            FileReader f_in = new FileReader("scores.txt");
            BufferedReader br = new BufferedReader(f_in);
            String line  = br.readLine();

            while(line!=null){
                count++;
                String[] array = line.split(" ");
                if(maxscore < Integer.parseInt(array[2])) {
                    maxscore = Integer.parseInt(array[2]);
                } else if(minscore > Integer.parseInt(array[2])) {
                    minscore = Integer.parseInt(array[2]);
                }
                sum+=Integer.parseInt(array[2]);
                line=br.readLine();
            }
            br.close();
            res[0] = maxscore;
            res[1] = minscore;
            res[2]=sum/count;
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    String Sort(int best,int cur){
        String res="";
        if(best-10<=cur){
            res="\"A\"";
        }
        else if(best-20<=cur){
            res="\"B\"";
        }
        else if(best-30<=cur){
            res="\"C\"";
        }
        else if(best-40<=cur){
            res="\"D\"";
        }
        else res = "\"F\"";


        return res;
    }
}
