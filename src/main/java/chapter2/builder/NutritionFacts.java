package chapter2.builder;

public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class NutritionFactsBuilder{
        //외부 패키지에서 사용 가능하도록, 클래스 접근제어자는 default와 public중 public으로 하였음.
        private final int servingSize;
        private final int servings;

        private int calories;
        private int fat;
        private int sodium;
        private int carbohydrate;

        public NutritionFactsBuilder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public NutritionFactsBuilder calories(int calories){
            this.calories = calories;
            return this;
        }
        public NutritionFactsBuilder fat(int fat){
            this.fat = fat;
            return this;
        }
        public NutritionFactsBuilder sodium(int sodium){
            this.sodium = sodium;
            return this;
        }
        public NutritionFactsBuilder carbohydrate(int carbohydrate){
            this.carbohydrate = carbohydrate;
            return this;
        }
        public NutritionFacts build(){
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(NutritionFactsBuilder builder){
        servingSize = builder.servingSize;
        servings = builder.servings;

        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate= builder.carbohydrate;
    }

}
