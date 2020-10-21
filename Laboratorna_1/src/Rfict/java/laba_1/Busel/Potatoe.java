package Rfict.java.laba_1.Busel;

public class Potatoe extends Food {
    private String type;
    public Potatoe(String type) {              //конструктор
        super("Potatoe");
        this.type=type;
    }
    public void consume() {
        System.out.println(this +"has eatten");
    }
    public String getType() { return type; }
    public void setType() { this.type=type; }
    public String toString() { return super.name +"  Type of '"+ type.toUpperCase() +"'  ";}
    public int calculateCalories(){
    if(type.equals("boild")){return 86;}
    if(type.equals("fri")){return 105;}
    if(type.equals("fried")){return 100;}
    else return 0;
    }
    public int compare(Potatoe arg1,Potatoe arg2, Potatoe arg3){
    if(type.equals("boild")){return 1;}
    if(type.equals("fried")){return -1;}
    else return 0; }

    @Override
    public int compare(Food x, Food y, Food z) {
        return 0;
    }
}

