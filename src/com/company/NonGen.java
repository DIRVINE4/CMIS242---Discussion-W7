package com.company;

import java.util.ArrayList;

public class NonGen {

    public static void main(String[] args)
    {
        String word1, word2, word3, word4, word5;

        ArrayList arrayList = new ArrayList();

        arrayList.add(249.22); //Ooops it let me compile!
        arrayList.add("Work?");
        arrayList.add(0.284373839282983198238712398723); //Ooops it let me compile!
        arrayList.add("Does");
        arrayList.add("This");

        word1 = (String) arrayList.get(3);
        word2 = (String) arrayList.get(4);
        word3 = (String) arrayList.get(1);
        word4 = (String) arrayList.get(0);  //Doesn't catch the error, but doesn't compile.
        word5 = (String) arrayList.get(2);  //Same as above.

        System.out.println(word1 + word2 + word3 + word4 + word5);
    }
}
