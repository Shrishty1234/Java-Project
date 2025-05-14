package types.training;

import java.awt.*;
import java.util.Date;

public class DataType {


    public static void main(String[] args) {
        //Reference type

        Date now = new Date(); //instance or object creation
        System.out.println(now.getTime());
       // Point point1 = new Point();
        

        String name = "Shrishty " + " Ameera";
        System.out.println(name);
        System.out.println(name.endsWith("!!"));
        System.out.println(name.replace("Ameera","!!"));


    }

}




