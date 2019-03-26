public class RestaurantTester {
    public static void main(String[] args) {
        RestaurantDish fish = new RestaurantDish("fish and chips", 1000, true);

        System.out.println(fish.getDishName());
        fish.setDishName("California Roll");
        System.out.println(fish.getDishName());
    }
}
