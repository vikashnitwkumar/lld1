package lld.accessmodifiers;

public class Rectangle  extends Point{
    // write the code of Rectangle class here
    Point topLeft;
    Point bottomRight;

    public Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY){
        
        
        this.topLeft = new Point(topLeftX, topLeftY);
        this.bottomRight = new Point(bottomRightX, bottomRightY);
    }
    public Rectangle(Point topLeft, Point bottomRight){
         this.topLeft = new Point(topLeft);
        this.bottomRight = new Point(bottomRight);
    }
   public Rectangle(Rectangle temp){
        this.topLeft = new Point(temp.topLeft);
        this.bottomRight = new Point(temp.bottomRight);
    }

}