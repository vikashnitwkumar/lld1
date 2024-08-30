package assiglld1.lld.lambda;

import java.util.Comparator;

public class TesterClass {
    //way to implement lambda expression without creating a implementing class
    SampleInterface sampleInterface = new SampleInterface() {
        @Override
        public int fun() {
            return 0;
        }
        @Override
        public int bun() {
            return 0;
        }
    };

    Comparator<Student> strundetComparator = (o1, o2)->{
        return o1.getRollNumber() - o2.getRollNumber();
    };

}
