package chapter6.item39;

public class SampleTest {

    @Test
    public void test1(){}

    @Test
    public static void m2(){}

    @Test
    public static void m3(){
        throw new RuntimeException("fail");
    }

}
