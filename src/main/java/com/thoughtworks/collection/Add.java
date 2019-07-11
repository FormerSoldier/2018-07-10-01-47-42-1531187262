package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int start = leftBorder < rightBorder ? leftBorder : rightBorder;
        int end = leftBorder < rightBorder ? rightBorder : leftBorder;
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(i % 2 == 0)
                sum += i;
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        /*Iterator<Integer> iterator = arrayList.listIterator();
        int temp = 0;
        int sum = 0;
        while(iterator.hasNext()){
            temp = iterator.next();
            if(temp % 2 == 1)
                sum += temp*3+2;
        }
        return sum;*/

        //return arrayList.stream().mapToInt((item) -> item * 3 + 2).sum();
        return arrayList.stream().map(item -> item * 3 + 2).reduce(0, (a,b) -> a+b);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        /*List<Integer> list = new ArrayList<>(arrayList.size());
        Iterator<Integer> iterator = arrayList.listIterator();
        int temp = 0;
        while(iterator.hasNext()){
            temp = iterator.next();
            if(temp % 2 != 0)
                list.add(temp*3+2);
            else
                list.add(temp);
        }
        return list;*/
        return arrayList.stream().map((item) ->
                item %2 == 0 ? item : item *3 + 2).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
       /*return arrayList.stream().filter(item -> item % 2 == 1 )
               .map(item -> item * 3 + 5).reduce(0,(a,b) -> a+b);*/
       return arrayList.stream().filter(item -> item %2 ==1).mapToInt(item -> item *3 +5).sum();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        /*return arrayList.stream().filter(item -> item % 2 == 0)
                .mapToInt(item -> item).sum() /
                arrayList.stream().filter(item -> item % 2 == 0).count();*/
        return arrayList.stream().filter(item -> item % 2 == 0).mapToDouble(item -> item)
                .average().getAsDouble();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
