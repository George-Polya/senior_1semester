package problem1_templateMethod;
/*
2016112158 김희수
 */
public abstract class CaffeineBeverage {
    abstract void prepareRecipe();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
