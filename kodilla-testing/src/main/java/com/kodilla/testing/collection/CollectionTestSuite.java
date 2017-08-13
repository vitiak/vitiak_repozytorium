package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.lang.*;
import java.util.*;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        OddNumbersExterminator Exterminator = new OddNumbersExterminator();
        ArrayList<Integer> listaPusta = new ArrayList<Integer>();
        //Given
        ArrayList<Integer> listaPustaExterminate = Exterminator.exterminate(listaPusta);
        //when
        Assert.assertTrue(listaPustaExterminate.size()==0);
    }
    @Test
    public void testOddNumbersExterminatorNotEmptyList() {
        OddNumbersExterminator Exterminator = new OddNumbersExterminator();
        ArrayList<Integer> listaNiePusta = Exterminator.createArrayList5El(2,5,8,9,3);
        ArrayList<Integer> listaNiePustaSpr = Exterminator.createArrayList2El(2,8);
        //Given
        ArrayList<Integer> listaNiePustaExterminate = Exterminator.exterminate(listaNiePusta);
        //when
        Assert.assertEquals(listaNiePustaExterminate, listaNiePustaSpr);
    }

}
