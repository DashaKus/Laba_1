package Rfict.java.laba_1.Busel;

public abstract class Food implements Consumable,Nutritious,Comparator{
    protected String name=null;
    public Food(String name){ this.name=name;}

    public String getName() { return name; }
    public void setName(String name) { this.name = name;}

    public String toString(String name){return name;}

    @Override
    public boolean equals(Object arg0)
    {
        if (!(arg0 instanceof Food)) return false;     //если аргументы не пренадлежат фуд
        if (name == null || ((Food)arg0).name == null) return false;
        return name.equals(((Food)arg0).name);
    }
}
