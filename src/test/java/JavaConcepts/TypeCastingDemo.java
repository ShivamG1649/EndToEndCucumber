/*
Type casting in java refers to the process of converting
one data type to another.
this is useful when we need to assign a value of one type to a variable of another
type.

float is of larger type

int is smaller compare to float

Implicit type casting ( Widening) , This is automatically performed by java
when a smaller type is assigned to a larger type.

int to float
..............................................


2) Explicit type casting :

Explicit type casting , or narrowing , is when you manually convert a larger data type
to a smaller one. Thi is necessary the larger type might contain value tht can not be fit into the
smaller one.
Data loss


 */


package JavaConcepts;

public class TypeCastingDemo
{

     // double is larger than int ( widening)

    public static void main(String[] args) {
        int a = 100; /// int is smaller
        double b = a;
        System.out.println(b);
    }



}
