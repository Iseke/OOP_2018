package Task2;
interface X{
    int val=1;
    void doIt();
   // static void FFF(int k);
}
interface Y {
    int val=2;
    void Run();
}

public class Second implements Y,X{

    @Override
    public void doIt() {
        System.out.println("doIT from X");
    }

    @Override
    public void Run() {
        System.out.println("Run from Y");
    }
}
abstract class View{
   abstract void Eye();
   abstract void See();
}
class V extends View{
    @Override
    public void Eye() {
        System.out.println("Eye");
    }

    @Override
   public  void See() {
        System.out.println("See");
    }
}