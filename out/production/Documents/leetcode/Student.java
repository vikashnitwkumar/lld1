
class Student implements Comparable<Student>
{
    static{
        a = 60;
    }
    static int a;
    int id;

    String name;

    int percentage;

    public Student(int id, String name, int percentage)
    {
        this.id = id;

        this.name = name;

        this.percentage = percentage;
    }

    @Override
    public int compareTo(Student s)
    {
        return this.id - s.id;     //Sorts the objects in ascending order

        // return s.id - this.id;    //Sorts the objects in descending order
    }

    @Override
    public String toString()
    {
        return "{ID : "+id+", Name : "+name+", Percentage : "+percentage+"}";
    }
}