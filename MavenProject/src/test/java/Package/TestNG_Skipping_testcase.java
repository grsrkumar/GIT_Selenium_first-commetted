package Package;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG_Skipping_testcase
{


    @Test()
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
      throw new SkipException("skipped");
    }

}