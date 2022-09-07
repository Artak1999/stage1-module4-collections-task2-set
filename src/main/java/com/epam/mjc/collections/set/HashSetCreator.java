package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            hashSet.add(sourceList.get(i));
            if(sourceList.get(i) % 2 == 0) {
                int number = sourceList.get(i) / 2;
                hashSet.add(number);
                while(number != 1) {
                    number /= 2;
                    hashSet.add(number);
                }
            }
            else
                hashSet.add(sourceList.get(i) * 2);
        }
        return hashSet;
    }
}
