package problem4_decorator;

public class NonVegFood extends FoodDecorator {
    public NonVegFood(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " With Roasted Chicken and Chicken Curry  ";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + 150.0;
    }
}
