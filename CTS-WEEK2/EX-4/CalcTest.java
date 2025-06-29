package ex4;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {

    private Calculator calculator;

    // Setup method: runs before each test
    @Before
    public void setUp() {
        calculator = new Calculator(); // Arrange
        System.out.println("Before each test - Calculator initialized");
    }

    //Teardown method: runs after each test
    @After
    public void tearDown() {
        calculator = null; // Clean-up
        System.out.println("After each test - Calculator cleared");
    }

    // ✅ Test 1: Testing addition
    @Test
    public void testAdd() {
        // Act
        int result = calculator.add(10, 5);
        
        // Assert
        assertEquals(15, result);
    }

    // ✅ Test 2: Testing subtraction
    @Test
    public void testSubtract() {
        // Act
        int result = calculator.subtract(10, 5);
        
        // Assert
        assertEquals(5, result);
    }
}
