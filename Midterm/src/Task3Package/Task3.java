package Task3Package;

import java.util.Vector;

public class Task3 {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(4,5,"Yellow",true);
        Circle circle = new Circle(4,"Green",true);
        circle.setRadius(4);
        Square square = new Square(3,"Blue",true);
        Shape sp = (circle);

       System.out.println(sp.getPerimetr());

    }



}
abstract class Shape{
    protected String color;
    protected boolean filled;
    Shape(){}
    Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean b){
        filled = b;
    }
    abstract double getArea();
    abstract double getPerimetr();
}
class Circle extends Shape{
    private double radius;
    Circle(){super();}
    Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius(){
       // System.out.println(radius);
        return radius;

    }
    public void setRadius(double r){
        radius=r;
    }

    @Override
    double getArea() {
        double Ar=radius*radius*Math.PI;

        return Ar;
    }
    
    @Override
    double getPerimetr() {
        double P = 2*radius*Math.PI;
        return P;
    }

}
class Rectangle extends Shape{
    private double width;
    private double length;
    Rectangle(){super();}
    Rectangle(double width,double length){
        this.length=length;
        this.width = width;
    }
    Rectangle(double width,double length,String color,boolean filled){
        super(color, filled);
        this.length=length;
        this.width = width;
    }
    public double getWidth(){
        return width;
    }

    public double getLength(){
        return  length;
    }

    @Override
    double getPerimetr() {
        double P = 2*(width+length);
        return P;
    }

    @Override
    double getArea() {
        double Ar = width*length;
        return Ar;
    }
}
class Square extends Rectangle{
    private  double side;
    Square(){super();}
    Square(double side){
        this.side = side;
    }
    Square(double side , String color,boolean filled){
        super(side,side,color,filled);
        this.side=side;
    }
    public double getSide(){
        return side;

    }
    public void setWidth(double side){
        side = side;
    }
    public  void setLegth(double side){
        side = side;
    }


}
