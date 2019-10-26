package chapter6.item39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {
    public static void main(String[] args) throws ClassNotFoundException {
        int testCount = 0;
        int passedCount=0;

        Class<?> testClass = Class.forName("chapter6.item39.SampleTest");
        for(Method method : testClass.getDeclaredMethods()){
            if(method.isAnnotationPresent(Test.class)){
                testCount++;
                try {
                    method.invoke(null);
                    passedCount++;
                } catch (InvocationTargetException wrappedException) {
                    Throwable cause = wrappedException.getCause();
                    System.out.println(method + "실패: "+ cause);
                }catch (Exception e) {
                    System.out.println("잘못 사용한 @Test: "+method);
                }
            }
        }
        System.out.printf("성공 : %d, 실패: %d%n", passedCount, testCount-passedCount);

    }
}
