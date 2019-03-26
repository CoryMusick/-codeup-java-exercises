//Create a class called "RestaurantDish" (you should not include quotes)
//
//        Include an integer property called "costInCents"
//        Include a string property called "nameOfDish"
//        Include a boolean property called "wouldRecommend"
//        Include a method called "eat"
//        this method will print out "Nom nom nom!"
//
//
//        -- SHORT ASSIGNMENT #2 (part 2) --
//        Refactor your RestaurantDish and RestaurantTest classes...
//        1) Change your public properties in your RestaurantDish class to private
//  2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to do this quickly)
//          3) Refactor code used in RestaurantTest to set and print these property values...
//          ...to use your getters and setters
//          4) Add a constructor method to RestaurantDish that will assign property...
//          ...values based on arguments passed into the constructor

public class RestaurantDish {

    private  int costInCents;
    private  String nameOfDish;
    private boolean wouldRecommend;


    public RestaurantDish(String dishName, int cost, boolean recommended){
        this.nameOfDish = dishName;
        this.costInCents = cost;
        this.wouldRecommend = recommended;
    }
    public void setDishName(String nameOfDish){
        this.nameOfDish = nameOfDish;
    }
    public String getDishName(){
        return nameOfDish;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public void eat(){
        System.out.println("Nom Nom Nom");
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }
}
