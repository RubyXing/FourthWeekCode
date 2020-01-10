package com;/*
 * @author Xingqilin
 *
 */


import java.util.HashMap;
import java.util.Map;

public class Mycltest {
    public void start() {
        hashtest();
    }

    private void hashtest() {
        HashMap<Integer, String> hs = new HashMap<>();
        hs.put(1, "aaa");
        hs.put(1, "bbb");
        hs.put(3, "ccc");
        hs.put(4, "ddd");
        hs.put(5, "eee");
        hs.forEach((key, value) -> {
            System.out.print(key + " ");
            System.out.println(value);
        });


    }
}
