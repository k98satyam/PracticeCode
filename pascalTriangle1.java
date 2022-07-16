// https://leetcode.com/problems/pascals-triangle/

import java.util.*;

public class pascalTriangle1 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> interList = new ArrayList<Integer>();

        interList.add(1);
        list.add(0, interList);
        if (numRows == 1) {
            return list;
        } 

        interList = new ArrayList<Integer>();
        interList.add(1);
        interList.add(1);
        list.add(1, interList);
        if (numRows == 2) {
            return list;
        }

        int i = 2;// count for rows
        int j = 0;// count for columns

        while (i < numRows) {
            interList = new ArrayList<Integer>();
            j = 1;
            interList.add(1);

            while (j < i) {
                interList.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                j++;
            }

            interList.add(1);
            i++;
            list.add(interList);
        }

        return list;
    }
}
