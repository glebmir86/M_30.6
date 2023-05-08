package ru.skillfactory.qajava;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public static int squareTwoNumbers(int number)
    {
        //допишите код
        return number * number;
    }

    public void currentTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

@BeforeClass
void beforeClass(){
    System.out.println("Before class");
    currentTime();
}

@AfterClass
void afterClass() {
    System.out.println("After class");
    currentTime();
}

    @DataProvider(name = "squareDataProvider")
    Object[][] squareDataProvider() {
        return new Object[][] {
                {2,4},
                {1,1},
                {-1,1},
                {0,0}
        };
    }

@Test(dataProvider = "squareDataProvider")
    public void testSum (int arg1, int expectedSquare){
        int result = squareTwoNumbers(arg1);
    System.out.println(result);
    assertEquals(expectedSquare, result);
}


}
