import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    static void setUpAll(){
        System.out.println("BeforeAll");
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("AfterAll");
    }

    @BeforeEach
    void setUpEach(){
        System.out.println("Before each");
    }

    @AfterEach
    void tearDownEach(){
        System.out.println("After each");
    }

    @Test
    @DisplayName(("MyMethod"))
    void add(){
        System.out.println("Add method");
        int actual = Calculator.add(2,3);
        assertEquals(5, actual, "Test failed");

    }

    @Test
    void add2(){
        System.out.println("Add2 method");
        assertThrows(IllegalArgumentException.class, () -> Calculator.add2(3,2));
    }

    @Test
    void testCase1(){
        System.out.println("Test Case 1");
        fail("Not implemented yet");
    }

    @Test
    void testCase2(){
        System.out.println("Test Case 2");
        assertTrue(Calculator.operator.equals("add"));
    }

    @Test
    void testCase3(){
        System.out.println("Test Case 3");
        assertArrayEquals(new int[] {1,2,3}, new int[]{1,2,3}, "Arrays are not the same");
    }

    @Test
    void testCase4(){
        System.out.println("Test Case 4");

        String nullString = null;
        String notNullString = "Learn";

        assertNull(nullString);
        assertNotNull(notNullString);

    }
    @Test
    void testCase5(){
        System.out.println("Test Case 5");

        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();

        assertSame(c1, c2);
        assertNotSame(c1, c3);
    }

}