import java.sql.Time;
class Timee{
    int hour;
    int minute;
    int second;
    Timee(int hour,int minute,int second){
        this.hour = hour;
        this.minute= minute;
        this.second = second;
    }
    public void add(Timee a){
        hour += a.hour;
        minute += a.minute;
        second += a.second;
        if(second>60){
            if(second/60>0){
                minute+=second/60;
            }
            second = second%60;
        }
        if(minute >60){
            if(minute/60>0){
                hour+=minute/60;
            }
            minute = minute%60;
        }
        if(hour >24){
            hour = hour%24;
        }

    }
    public void toStandart(){
        String s="";
        String tm="";
        if(hour>=10){

            if(hour>=10&&hour<12){
                s="'"+hour;
               tm = "AM";
            }
            else if(hour>=12){
                tm="PM";
                if(hour%12>=10){
                    s="'"+hour%12;
                }
                else if(hour%12<10){
                    s="'0"+hour%12;
                }

            }
        }
        else if(hour<10){
            tm="AM";
            s="'0"+hour;
        }
        if(minute>=10){
            s=s+":"+minute;
        }
        else if(minute<10){
            s=s+":0"+minute;
        }
        if(second>=10){
            s=s+":"+second+"' "+tm;
        }
        else if(second<10){
            s=s+":0"+second+"' "+tm;
        }
        System.out.println(s);
    }
    public void toUniversal(){
        String s="";
        if(hour>=10){
            s="'"+hour;
        }
        else if(hour<10){
            s="'0"+hour;
        }
        if(minute>=10){
            s=s+":"+minute;
        }
        else if(minute<10){
            s=s+":0"+minute;
        }
        if(second>=10){
            s=s+":"+second+"'";
        }
        else if(second<10){
            s=s+":0"+second+"'";
        }
        System.out.println(s);
    }
}
public class D {

    public static void main(String[] args){
        Timee time = new Timee(5,45,37);
        Timee time2 = new Timee(23,23,39);
        time.add(time2);
        time.toUniversal();
        time.toStandart();
    }
}
