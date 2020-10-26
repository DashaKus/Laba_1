package Rfict.java.laba_1.Busel;

public class Cheese extends Food {
    public Cheese() {
        super("Cheese");
    }
    public void consume() {
        System.out.println(super.name + " has eaten");
    }
    public int calculateCalories()
    {
        return 400;
    };

}

