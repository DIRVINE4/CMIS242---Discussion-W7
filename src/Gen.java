package com.company;

import java.util.ArrayList;

public class Gen {

    public static void main(String[] args)
    {
        String word1, word2, word3, word4, word5;

        ArrayList<String> arrayList = new ArrayList();

        arrayList.add(249.22); //The generic class saves time by catching errors!
        arrayList.add("Work?");
        arrayList.add(0.284373839282983198238712398723); //The generic class saves time by catching errors!
        arrayList.add("Does");
        arrayList.add("This");

        word1 = (String) arrayList.get(3);
        word2 = (String) arrayList.get(4);
        word3 = (String) arrayList.get(1);
        word4 = (String) arrayList.get(0);
        word5 = (String) arrayList.get(2);

        System.out.println(word1 + word2 + word3 + word4 + word5);
    }
}
