package Rfict.java.laba_1.Busel;

public class Apple  extends Food {
    private String size;
    public Apple(String size) {
        super("Apple");
        this.size = size;
    }
    public void consume() {
        System.out.println(this + " has eaten");
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String toString() {
        return super.name + " size of '" + size.toUpperCase() + "'";
    }
    public int calculateCalories(){
        if (size.equals("small")) {return 40;}
        if (size.equals("middle")) {return 55;}
        if (size.equals("big")) {return 65;}
        else return 0;
    }

    public int compare(Apple args0,Apple args1,Apple args2) {
        if (size.equals("small")) {return -1;}
        if (size.equals("big")) {return 1;}
        else return 0;
    }

    @Override
    public int compare(Food x, Food y, Food z) {
        return 0;
    }
}

