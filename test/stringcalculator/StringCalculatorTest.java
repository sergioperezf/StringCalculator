/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalculator;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Sergio
 */
public class StringCalculatorTest {

  public StringCalculatorTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @Before
  public void setUp() {
  }

  @After
  public void tearDown() {
  }
//
//  /**
//   * Test of main method, of class StringCalculator.
//   */
//  @Test
//  public void testMain() {
//    System.out.println("main");
//    String[] args = null;
//    StringCalculator.main(args);
//    // TODO review the generated test code and remove the default call to fail.
//    fail("The test case is a prototype.");
//  }

  /**
   * Test of Add method, of class StringCalculator.
   */
  @Test
  public void testAdd() throws Exception {
    System.out.println("Add");
    int result = 0;
    int expResult = 0;
    
    result = StringCalculator.Add("//ss\n1ss3ss5");
    System.out.println(result);
    expResult = 9;
    assertEquals(expResult, result);
//    fail("Calculation Failed.");

    result = StringCalculator.Add("1");
    expResult = 1;
    assertEquals(expResult, result);
//    fail("Calculation Failed.");
    
    result = StringCalculator.Add("");
    expResult = 0;
    assertEquals(expResult, result);
//    fail("Calculation Failed.");
    
    result = StringCalculator.Add("3;1;5;3");
    expResult = 12;
    assertEquals(expResult, result);
//    fail("Calculation Failed.");
    
    result = StringCalculator.Add("3;1\n5;3");
    
    expResult = 12;
    assertEquals(expResult, result);
//    fail("Calculation Failed.");
    
    result = StringCalculator.Add("3;1\n;5;3");
    expResult = 0;
    assertEquals(expResult, result);
//    fail("Calculation Failed.");
    
    result = StringCalculator.Add("//oo\n-7oo1\n-5oo3");
    expResult = 0;
    assertEquals(expResult, result);
//    fail("Calculation Failed.");
    
//    String numbers = "//oo\n-7oo1\n-5oo3";

//    int result = StringCalculator.Add(numbers);
//    assertEquals(expResult, result);
    // TODO review the generated test code and remove the default call to fail.
//    fail("The test case is a prototype.");
  }
}
