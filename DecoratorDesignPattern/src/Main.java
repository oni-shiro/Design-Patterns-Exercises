import SystemFiles.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please tell the quantity...." );
        int quant = sc.nextInt();
        PizzaInterface myFirstPizza = new ExtraPepporini(new ExtraCheeze(new AmericanPizza()));
        System.out.println(myFirstPizza.getPizzaPrice());
        System.out.println("total comes out to be - " + quant*myFirstPizza.getPizzaPrice());
    }

}