package Task1;

public class FirstTask {

    public static void main(String[] args){
        int radius = 5;
        int side = 6;
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(4);
        cylinder.surFace(radius);
        cylinder.Volume(radius);
        Sphere sphere = new Sphere();
        sphere.surFace(radius);
        sphere.Volume(radius);
        Cube cube = new Cube();
        cube.surFace(side);
        cube.Volume(side);

    }
}
 interface Shapee{
    void Volume(int a);
    void surFace(int a);
}
abstract  class Shapes {
   abstract void Volume(int a);
   abstract void surFace(int a);
}
class Cylinder extends Shapes{
    int height;
    public void setHeight(int height){
        this.height = height;
    }
    @Override
    public void surFace(int radius ) {
        System.out.println("Surface of the Cylinder : "+(2*radius*Math.PI)*(radius+height));
    }

    @Override
    public void Volume(int radius) {
        System.out.println("Volume of the Cylinder : "+Math.PI*radius*radius*height);
    }
}
class Sphere extends Shapes{
    @Override
    public void surFace(int radius) {
        System.out.println("Surface of the Sphere : "+(4*Math.pow(radius,2)*Math.PI));
    }

    @Override
    public void Volume(int radius) {
        System.out.println("Volume of the Sphere : "+((4/3)*Math.pow(radius,3)*Math.PI));
    }
}
class Cube extends Shapes{
    @Override
    public void surFace(int side) {
        System.out.println("Surface of the Cube : "+6*side*side);
    }

    @Override
    public void Volume(int side) {
        System.out.println("Volume of the Cube : "+Math.pow(side,3));
    }
}
/*class Cylinder implements Shapee{
    int height;
    public void setHeight(int height){
        this.height = height;
    }
    @Override
    public void surFace(int radius ) {
        System.out.println("Surface of the Cylinder : "+(2*radius*Math.PI)*(radius+height));
    }

    @Override
    public void Volume(int radius) {
        System.out.println("Volume of the Cylinder : "+Math.PI*radius*radius*height);
    }
}
class Sphere implements Shapee{
    @Override
    public void surFace(int radius) {
        System.out.println("Surface of the Sphere : "+(4*Math.pow(radius,2)*Math.PI));
    }

    @Override
    public void Volume(int radius) {
        System.out.println("Volume of the Sphere : "+((4/3)*Math.pow(radius,3)*Math.PI));
    }
}
class Cube implements Shapee{
    @Override
    public void surFace(int side) {
        System.out.println("Surface of the Cube : "+6*side*side);
    }

    @Override
    public void Volume(int side) {
        System.out.println("Volume of the Cube : "+Math.pow(side,3));
    }
}*/
