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
        int apples=0;
        int cheese =0;
        int potatoe =0;
        boolean caculate=false;
        for(String i:args)              //бурум значения с того странного окошка
        {
            String[] parts = i.split("/");
            if(parts[0].equals("Apple"))
            {
                breakfast[counter]=new Apple(parts[1].toUpperCase());
                apples++;
               // breakfast[counter].consume();

            }
            if(parts[0].equals("Cheese"))
            {
                breakfast[counter]=new Cheese();
                cheese++;
                //breakfast[counter].consume();
            }
            if(parts[0].equals("Potatoe"))
            {
                breakfast[counter]=new Potatoe(parts[1].toUpperCase());
                potatoe++;
              //  breakfast[counter].consume();
            }
            if(parts[0].equals("-calories")){caculate =true;}
            counter++;
        }
        System.out.println(caculate);
        Arrays.sort(breakfast,new FoodComparator());
        for(int i=0;i<20;i++)
        {
            if(breakfast[i]!=null) {
                breakfast[i].consume();
                if(caculate) {
                    calories += breakfast[i].calculateCalories();
                }
            }
        }
        System.out.println("Calories of breakfast is: " + calories);
        System.out.println(apples+" Apples");
        System.out.println(cheese+" Cheese");
        System.out.println(potatoe+" Potatoes");
    }
}
