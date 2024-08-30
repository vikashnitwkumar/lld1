package assiglld1.lld.Generics;

public class Car implements Comparable<Car>{
    private int speed;
    private int power;
    public Car(int speed, int power){
        this.speed = speed;
        this.power = power;
    }

    @Override
    public String toString() {
        return "[S=" + this.speed + ", P=" + this.power + "]";
    }


    @Override
    public int compareTo(Car o) {
//        if(this.speed == o.speed) return  0;
        return this.speed - o.speed;
    }
}