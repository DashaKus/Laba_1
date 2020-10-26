package Rfict.java.laba_1.Busel;
import java.util.Comparator;

public class FoodComparator implements Comparator<Food> {
    public int compare(Food obj_1, Food obj_2) {
        if(obj_1==null)return -1;
        if(obj_2==null)return 1;
        if (obj_1 instanceof Apple && obj_2 instanceof Apple) {
            return ((Apple) obj_1).getSize().compareTo(((Apple) obj_2).getSize());
        }

        if (obj_1 instanceof Potatoe && obj_2 instanceof Potatoe) {
            return ((Potatoe) obj_1).getType().compareTo(((Potatoe) obj_2).getType());
        }
        return obj_1.getName().compareTo(obj_2.getName());
    }
}
