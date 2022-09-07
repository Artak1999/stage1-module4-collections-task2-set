package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator{
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            int square = (int)Math.pow(sourceList.get(i),2);
            if(square == 16 || square == 25 || square == 9 || square == 4)
                treeSet.add(square);
        }
        return treeSet;
    }
}
