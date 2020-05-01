package Package;

import org.testng.annotations.Test;

public class TestNG_Enable_false_testcaseTest
{


    @Test(enabled=false)
    public void a_test()
    {
        System.out.println("aTest");
    }

   //---------------------  
    
    @Test()
    public void c_test()
    {       
        System.out.println("cTest");   
    }

    //----------------------
    
    @Test()
    public void b_test()
    {       
        System.out.println("bTest");   
    }

}