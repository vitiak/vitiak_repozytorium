package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.lang.*;
import java.util.*;

class Operations {
    public ArrayList<Integer> createArrayList5El(int int1, int int2, int int3, int int4, int int5) {
        ArrayList<Integer> lista5El = new ArrayList<Integer>();
        lista5El.add(int1);
        lista5El.add(int2);
        lista5El.add(int3);
        lista5El.add(int4);
        lista5El.add(int5);
        return lista5El;
    }


    public ArrayList<Integer> createArrayList2El(int int1, int int2) {
        ArrayList<Integer> lista2El = new ArrayList<Integer>();
        lista2El.add(int1);
        lista2El.add(int2);
        return lista2El;
    }
}

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
        for (Integer listaParz: listaPustaExterminate) {
            System.out.println("Lista pusta zawiera " + listaParz);
        }
    }
    @Test
    public void testOddNumbersExterminatorNotEmptyList() {
        OddNumbersExterminator Exterminator = new OddNumbersExterminator();
        Operations Operate = new Operations();

        ArrayList<Integer> listaNiePusta = Operate.createArrayList5El(2,1,8,9,7);
        ArrayList<Integer> listaNiePustaSpr = Operate.createArrayList2El(2,8);
        //Given
        ArrayList<Integer> listaNiePustaExterminate = Exterminator.exterminate(listaNiePusta);
        //when
        Assert.assertEquals(listaNiePustaExterminate, listaNiePustaSpr);
        for (Integer listaParz: listaNiePustaExterminate) {
            System.out.println("Lista niepusta zawiera " + listaParz);
        }

    }

}
