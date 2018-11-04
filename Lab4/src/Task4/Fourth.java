package Task4;

public class Fourth implements Runnable {
    int speed1 ;
    String side;
    boolean go =false;
    Fourth(boolean go){

        this.go = go;
    }
    @Override
    public void move() {
        if(go){
            System.out.println("Can move wiht speed :"+speed1+" side:"+side);
        }
        else{
            System.out.println("Can't move!");
        }
    }

    @Override
    public String changeSide(String dir) {
        side = dir;
        return side;
    }

    @Override
    public void setSpeed(int speed) {
        speed1+=speed;
    }
}
interface Moveable{
    void move();
    String changeSide(String dir);
}

interface Runnable extends Moveable{
    void setSpeed(int speed);
}
