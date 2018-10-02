public class Lab3B {
    public static  void main(String[] args){
        Cylinder cylinder = new Cylinder(4,7);
        Sphere sphere = new Sphere(4);
        cylinder.axial_section();
        cylinder.surface();
        cylinder.volume();
        sphere.axial_section();
        sphere.surface();
        sphere.volume();
    }
}
abstract class Def
{
    public abstract void volume();
    public abstract void surface();
    public abstract void axial_section();
}

class Cylinder extends Def
{
    int r,h;
    final static double PI = 3.14159;

    Cylinder(int radius,int height)
    {
        this.r = radius;
        this.h = height;

    }
    @Override
    public void volume() {
        double d = PI*r*r*h;
        System.out.println("Volume of the Cylinder : "+d);
    }

    @Override
    public void surface() {
        System.out.println("Surface of the Cylinder : "+2*PI*h*(h+r));
    }

    @Override
    public void axial_section() {
        System.out.println("Axial Section of Cylinder : "+2*r*h);
    }
}
class Sphere extends Def
{
    int r;
    final static double PI = 3.14159;

    Sphere(int radius)
    {
        this.r = radius;


    }
    @Override
    public void volume() {

        System.out.println("Volume of the Sphere : "+((4/3)*PI*Math.pow(r,3)));
    }

    @Override
    public void surface() {
        System.out.println("Surface of the Sphere : "+(4*PI*r*r));
    }

    @Override
    public void axial_section() {
        System.out.println("Axial Section of Sphere : "+PI*r*r);
    }
}
class Cube extends Def{
    @Override
    public void volume() {

    }

    @Override
    public void surface() {

    }

    @Override
    public void axial_section() {

    }
}