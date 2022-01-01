package com.company;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculationTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("before class");
    }
    @AfterClass
    public static void tearDon() {
        System.out.println("finished");
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("before");
    }

    @Test
    public void testFindMax(){
        System.out.println("test case find max");
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
        assertEquals(-2,Calculation.findMax(new int[]{-12,-3,-4,-2}));
    }
    @Test
    public void testCube(){
        System.out.println("test case cube");
        assertEquals(27,Calculation.cube(3));
    }
    @Test
    public void testReverseWord(){
        System.out.println("test case reverse word");
        assertEquals("mad",Calculation.reverseWord("dam"));
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("after");
    }

    }


