package Loops.pitfall_loop;

import java.util.ArrayList;

public class Integer1 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++){
            ar.add(i);
        }
    }
    
}
