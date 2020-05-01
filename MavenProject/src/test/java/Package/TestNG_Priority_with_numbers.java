package Package;

import org.testng.annotations.Test;

public class TestNG_Priority_with_numbers
{


    @Test(priority=3)
    public void a_test()
    {
        System.out.println("aTest");
    }

   //---------------------  
    
    @Test(priority=2)
    public void c_test()
    {       
        System.out.println("cTest");   
    }

    //----------------------
    
    @Test(priority=-1)
    public void b_test()
    {       
        System.out.println("bTest");   
    }

}