//public class TestCode3 {
//
//}
//
//class FoodFactory {
//    private static FoodFactory instance = new FoodFactory();
//    // private static List<String> cuisines = new ArrayList<String>();
//    private FoodFactory() {}
//
//    public static FoodFactory getFactory() {
//        return instance;
//    }
//
//    public void registerCuisine(String cuisineKey, Cuisine cuisine) {
//        // cuisines.add(cuisineKey);
//    }
//
//    public Cuisine getCuisine(String cuisineKey) {
//        switch(cuisineKey) {
//            case "Chinese":
//                return new Chinese();
//            case "Italian":
//                return new Italian();
//            case "Japanese":
//                return new Japanese();
//            case "Mexican":
//                return new Mexican();
//            default:
//                return null;
//        }
//    }
//
//    public Cuisine serveCuisine(String cuisineKey, String dish) throws UnservableCuisineRequestException{
//        if (null != getCuisine(cuisineKey)) {
//            return getCuisine(cuisineKey).serveFood(dish);
//        } else {
//            throw new UnservableCuisineRequestException(String.format("Unservable cuisine %s for dish %s", cuisineKey, dish));
//        }
//    }
//
//
//}
//
//class Chinese extends Cuisine {
//    private String dish;
//
//    public Cuisine serveFood(String dish) {
//        this.dish = dish;
//        return this;
//    }
//
//    public String getDish() {
//        return this.dish;
//    }
//}
//
//class Italian extends Cuisine {
//    private String dish;
//
//    public Cuisine serveFood(String dish) {
//        this.dish = dish;
//        return this;
//    }
//
//    public String getDish() {
//        return this.dish;
//    }
//}
//
//class Japanese extends Cuisine {
//    private String dish;
//
//    public Cuisine serveFood(String dish) {
//        this.dish = dish;
//        return this;
//    }
//
//    public String getDish() {
//        return this.dish;
//    }
//}
//
//class Mexican extends Cuisine {
//    private String dish;
//
//    public Cuisine serveFood(String dish) {
//        this.dish = dish;
//        return this;
//    }
//
//    public String getDish() {
//        return this.dish;
//    }
//}
