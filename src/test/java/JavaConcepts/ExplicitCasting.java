package JavaConcepts;

import org.bson.io.BsonOutput;

public class ExplicitCasting {

    public static void main(String[] args) {

        double x = 9.99 ; // double is larger
        int y = (int) x;// explicit casting from double to int

        System.out.println(y);



    }
}
