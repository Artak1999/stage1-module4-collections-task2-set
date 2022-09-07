package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new TreeSet<>();
        Iterator<String> i1 = firstSet.iterator();
        Iterator<String> i2 = secondSet.iterator();
        Iterator<String> i3 = thirdSet.iterator();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        while (i1.hasNext())
            list1.add(i1.next());
        while (i2.hasNext())
            list2.add(i2.next());
        while (i3.hasNext())
            list3.add(i3.next());
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j)))
                    set.add(list1.get(i));
            }
        }
        for (int i = 0; i < list3.size(); i++) {
            if(list3.get(i).equals("LinkedHashSet") || list3.get(i).equals("TreeSet") || list3.get(i).equals("HashSet"))
                set.add(list3.get(i));
        }
        return set;
    }
}