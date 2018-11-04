import java.awt.*;
import java.lang.*;

public class Lab3D {
    public static void main(String[] args){
        Queen queen = new Queen();
        queen.isLegalMove(1,1,8,1);
        King king = new King();
        king.isLegalMove(4,4,5,5);
        Knight knight = new Knight();
        knight.isLegalMove(1,1,3,2);
        Bishop bishop = new Bishop();
        bishop.isLegalMove(1,1,5,5);
        Rook rook = new Rook();
        rook.isLegalMove(1,1,2,1);
    }
}
abstract class Peace
{

    public abstract void isLegalMove(int x,int y,int x1,int y1);

}
class Rook extends Peace  //Ladiya
{
    int x,y,x1,y1;
    public Point locationX;

    Rook(){
        x=0;
        y=0;
        x1=0;
        y1=0;
    }
    Rook(int Fx,int Fy,int Sx,int Sy){
        this.x = Fx;
        this.y = Fy;
        this.y1 = Sy;
        this.x1 = Sx;
    }
    @Override
    public void isLegalMove(int x,int y,int x1,int y1) {

        if(x==x1 || y==y1){
            System.out.println("Rook can move");
        }
        else System.out.println("Rook can't move");
    }
}
class King extends Peace
{

    int x,y,x1,y1;
    King(){
        x=0;
        y=0;
        x1=0;
        y1=0;
    }
    King(int Fx,int Fy,int Sx,int Sy){
        this.x = Fx;
        this.y = Fy;
        this.y1 = Sy;
        this.x1 = Sx;
    }
    @Override
    public void isLegalMove(int x,int y,int x1,int y1) {
        int a=Math.abs(x-x1);
        int b=Math.abs(y-y1);
        if((a==1 || a==0 ) && (b==0 || b==1)){
            System.out.println("King can move");
        }
        else System.out.println("King can't move");

    }
}
class Queen extends Peace //Ferz
{
    int x,y,x1,y1;
    Queen(){
        x=0;
        y=0;
        x1=0;
        y1=0;
    }
    Queen(int Fx,int Fy,int Sx,int Sy){
        this.x = Fx;
        this.y = Fy;
        this.y1 = Sy;
        this.x1 = Sx;
    }
    @Override
    public void isLegalMove(int x, int y, int x1, int y1) {
        if(Math.abs(x-x1)==Math.abs(y-y1) || (x==x1 || y==y1)){
            System.out.println("Queen can move");
        }
        else System.out.println("Queen can't move");
    }
}
class Bishop extends Peace  //Slon
{
    int x,y,x1,y1;
    Bishop(){
        x=0;
        y=0;
        x1=0;
        y1=0;
    }
    Bishop(int Fx,int Fy,int Sx,int Sy){
        this.x = Fx;
        this.y = Fy;
        this.y1 = Sy;
        this.x1 = Sx;
    }
    @Override
    public void isLegalMove(int x,int y,int x1,int y1) {
        if(Math.abs(x-x1)==Math.abs(y-y1)){
            System.out.println("Bishop can move");
        }
        else System.out.println("Bishop can't move");
    }
}
class Knight extends Peace  //Kon'
{
    int x,y,x1,y1;
    Knight(){
        x=0;
        y=0;
        x1=0;
        y1=0;
    }
    Knight(int Fx,int Fy,int Sx,int Sy){
        this.x = Fx;
        this.y = Fy;
        this.y1 = Sy;
        this.x1 = Sx;
    }
    @Override
    public void isLegalMove(int x,int y,int x1,int y1) {
        int a=Math.abs(x-x1);
        int b=Math.abs(y-y1);
        if((a==1 && b==2 ) || (b==1 && a==2)){
            System.out.println("Knight can move");
        }
        else System.out.println("Knight can't move");
    }
}
