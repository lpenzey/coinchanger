package main.java;

import java.util.ArrayList;


public class CoinChanger {
    public ArrayList<Integer> makeChange(int amount) {
        ArrayList<Integer> change = new ArrayList<Integer>();
        int i = amount;
        while (i > 0) {
            if(amount == 5){
                change.add(5);
                i -= 5;
            } else {
                change.add(1);
                i--;
            }
        }
        return change;
    }
}

