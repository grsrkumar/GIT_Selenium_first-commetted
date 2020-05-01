package Package;

import org.testng.annotations.Test;

public class TestNG_InvocationCount 
{


    @Test(invocationCount=2)
    public void test1()
    {
        System.out.println("Test1");
    }

   //---------------------  
    
    @Test(invocationCount=2)
    public void test2()
    {       
        System.out.println("Test2");   
    }

    //----------------------
    
    @Test
    public void test3()
    {       
        System.out.println("Test3");   
    }

}