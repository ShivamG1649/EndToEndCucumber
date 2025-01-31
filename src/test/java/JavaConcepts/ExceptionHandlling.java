package JavaConcepts;

public class ExceptionHandlling
{

    public static void main(String[] args) {

        System.out.println("line1");

       try
       {
           System.out.println("In try");
        int a = 10/0;
       }
       catch (Exception e )
       {
           System.out.println("In catch block");
       }
       finally {
           System.out.println("I am in finally block");
       }
       System.out.println("line2");


    }
}
