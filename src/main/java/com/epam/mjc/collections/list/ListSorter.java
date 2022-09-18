package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}


class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        if (value(a) > value(b)) {
            return 1;
        } else if (value(a) < value(b)) {
            return -1;
        } else {
            if (Integer.parseInt(a) > Integer.parseInt(b)) {
                return 1;
            } else return -1;
        }
    }

    public int value(String s) {
        int element = Integer.parseInt(s);
        return element * element * 5 - 3;
    }


}


