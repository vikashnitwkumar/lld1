package assiglld1.lld.Generics;

import java.awt.*;
import java.util.ArrayList;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        // complete the code here
        if(obj.getClass() == this.getClass() ){
            Point other  = (Point) obj;
            if(other.x == this.x && other.y == this.y){
                return true;
            }
        }
            return false;
    }

    @Override
    public int hashCode() {
        // complete the code here
        return 0;
    }
}
