package TestNG;

import org.testng.annotations.Test;

public class SEcondTestNG {

    @Test(priority = 1)
    public void one()
    {
        System.out.println("this is first class");
    }
    @Test
    public void two()
    {
        System.out.println("this is second class");
    }
    @Test
    public void three()
    {
        System.out.println("this is third class");
    }
}
