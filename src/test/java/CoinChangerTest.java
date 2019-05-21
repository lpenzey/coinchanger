package main.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;


public class CoinChangerTest {

    @Test
    public void oneReturnsOnePenny() {
        CoinChanger myCoinChanger = new CoinChanger();
        ArrayList<Integer> change = new ArrayList<Integer>();
        change.add(1);

        assertEquals(change, myCoinChanger.makeChange(1));
    }

    @Test
    public void twoReturnsTwoPennies() {
        CoinChanger myCoinChanger = new CoinChanger();
        ArrayList<Integer> change = new ArrayList<Integer>();
        change.add(1);
        change.add(1);

        assertEquals(change, myCoinChanger.makeChange(2));
    }

    @Test
    public void fiveReturnsOneNickel() {
        CoinChanger myCoinChanger = new CoinChanger();
        ArrayList<Integer> change = new ArrayList<Integer>();
        change.add(5);


        assertEquals(change, myCoinChanger.makeChange(5));
    }

    @Test
    public void sixReturnsOneNickelAndOnePenny() {
        CoinChanger myCoinChanger = new CoinChanger();
        ArrayList<Integer> change = new ArrayList<Integer>();
        change.add(5);
        change.add(1);


        assertEquals(change, myCoinChanger.makeChange(6));
    }
}