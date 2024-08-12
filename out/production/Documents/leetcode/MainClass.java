import java.util.ArrayList;
import java.util.Collections;

//Student class implementing Comparable interface

class SuperClass
{
    void methodOfSuperClass() throws IOException
    {
        System.out.println("Super class method is throwing checked exception");
    }
}

class SubClass extends SuperClass
{
    @Override
    void methodOfSuperClass()throws IOException
    {
        System.out.println("Can be Overrided with same checked exception");
    }
}
public class MainClass
{
    public static void main(String[] args)
    {
       SubClass subClass = new SubClass();
       subClass.methodOfSuperClass();
    }
}