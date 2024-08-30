package assiglld1.lld.abstractInterface;

public interface I extends I1, I2 {
    static void doer(){
        System.out.println("inside I doer");
    }
}