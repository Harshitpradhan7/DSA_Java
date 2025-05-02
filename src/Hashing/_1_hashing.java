package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class _1_hashing {
    public static void main(String[] args) {

        HashSet <Integer> hashSet = new HashSet<>();
        HashMap <Integer,Integer> hashMap1=  new HashMap<>();
        HashMap <Integer,Integer> hashMap2=  new HashMap<>();

        hashMap1.put(1,2);
        hashMap2.put(2,3);
        hashMap2.put(3,4);

        hashMap1.putAll(hashMap2);
        System.out.println(hashMap1.values());
        System.out.println(hashMap1.keySet());
    }
}
