import java.util.Scanner;

class Data {
    private double max,sum, avg;
    private int  cnt;
    Data(){
        max = 0f;
        avg = 0f;
        sum = 0;
        cnt = 0;
    }
    public void addValue(int value){
        if(value > max) max = value;

        cnt++;
        sum += value;
        avg = sum / cnt;
    }
    public double getAverage(){
        if(cnt == 0) return 0;

        return avg;
    }
    public double getMaximum(){
        return max;
    }

}

class Analyzer {
    Analyzer(){}

    Scanner scan = new Scanner(System.in);
    Data myData = new Data();
    String input;

    public void show(){
        while(true){
            System.out.print("Enter number(Press 'Q' or 'q' to quite): ");
            input = scan.nextLine();
            if(input.charAt(0) == 'Q' || input.charAt(0) == 'q') break;
            else {
                myData.addValue(Integer.parseInt(input));
            }

        }
        System.out.println("Average = " + myData.getAverage());
        System.out.println("Maximum = " + myData.getMaximum());

    }

}

public class C {
    public static void main(String args[]){
        Analyzer analyzer = new Analyzer();
        analyzer.show();
    }
}