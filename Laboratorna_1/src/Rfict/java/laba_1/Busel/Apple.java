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
}

