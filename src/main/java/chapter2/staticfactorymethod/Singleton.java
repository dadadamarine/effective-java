package chapter2.staticfactorymethod;

import chapter2.builder.NutritionFacts;

public class Singleton {

    private static class LazyHolder{
        private static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){ // 정적
        return LazyHolder.INSTANCE;

    }
}
