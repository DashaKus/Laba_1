package Rfict.java.laba_1.Busel;

import java.util.Arrays;

public class Mainclass<args> {
    public static void main(String[] args) throws Exception{
        Potatoe one=new Potatoe("fri");
        System.out.println();
      //  one.consume();
        Food[] breakfast=new Food[20];
        int counter=0;
        int calories=0;
        boolean caculate=false;
        for(String i:args)              //бурум значения с того странного окошка
        {
            String[] parts = i.split("/");
            if(parts[0].equals("Apple"))
            {
                breakfast[counter]=new Apple(parts[1].toUpperCase());
                breakfast[counter].consume();
            }
            if(parts[0].equals("Cheese"))
            {
                breakfast[counter]=new Cheese();
                breakfast[counter].consume();
            }
            if(parts[0].equals("Potatoe"))
            {
                breakfast[counter]=new Potatoe(parts[1].toUpperCase());
                breakfast[counter].consume();
            }
            if(parts[0].equals("-calories")){caculate =true;}
            counter++;
        }
        Arrays.sort(breakfast,new FoodComparator());
        if(caculate =true)
        {
        for(Food j:breakfast) {
            if(j!=null) {
                calories += j.calculateCalories();
                j.consume();
            }
            else break;
        }
         }
        System.out.println("aaaaaa");
        System.out.println("Calories of breakfast is: " + calories);

    }
}
