package JavaConcepts;
/*
we can also cast between reference types ( objects ),but this requires special attention
, we have to inheritance

object / referenceType , Interfaces , classes ...

Primitive :  int / float

new keyword
 */


import org.bson.io.BsonOutput;

class Animal
{
   void sound()
   {
       System.out.println("animal sound ");
   }

   void display(){
       System.out.println("I am in display method");
   }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}
public class ReferenceTypesDemo {

    public static void main(String[] args) {

        // WebDriver driver = new ChromeDriver();

    Animal animal=  new Dog();// Upcasting : automatically done
//        animal.sound();
//        animal.display();

        Dog dog = (Dog) animal;// DownCasting
        Dog dog1 = (Dog) new Animal();

        dog.display();
    }
}
