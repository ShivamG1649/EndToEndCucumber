package TestNGDemo;

import org.testng.annotations.Test;

public class PriprityDemo {

    @Test
    public void TC1(){
        System.out.println("In test case1");
    }
    @Test(priority = -1)
    public void TC5(){
        System.out.println("In test case1");
    }
    @Test(priority = 1)
    public void TC2(){
        System.out.println("In test case2");
    }
    @Test(priority = 2)
    public void TC3(){
        System.out.println("In test case3");
    }

    @Test
    public void AB(){
        System.out.println("In test case4");
    }

    @Test
    public void BC(){
        System.out.println("In test case4");
    }

}
