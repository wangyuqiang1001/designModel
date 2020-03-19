package com.wang.demo.test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {


    public static void main(String[] args) {
        Test2 test2 = new Test2();
        int[][] a = {{1, 3}, {2, 6}, {5, 7}, {9, 11}, {13, 15}, {16, 19}, {18, 22}};
//        int[][] a = {{1, 3}};
        int[][] merge = test2.merge(a);
        for (int i = 0; i < merge.length; i++) {
            System.out.println("(" + merge[i][0] + "," + merge[i][1] + ")");
        }
    }


    /**
     * 题1
     *
     * @param intervals
     * @return
     */
    int[][] merge(int[][] intervals) {
        boolean isArrayEnd = false; //标志数组合并状态是否结束:
        int itemStart = intervals[0][0];
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (isArrayEnd)
                itemStart = intervals[i][0];
            if (i == intervals.length - 1) { //最后一条数据:
                if (isArrayEnd) { //最后一条的前一条是上一个合并的结尾,那么最后一条是单独的:
                    result.add(intervals[i]);
                } else { //最后一条也是需要合并的
                    result.add(new int[]{itemStart, intervals[i][intervals[i].length - 1]});
                }
                break;
            }
            if (intervals[i][intervals[i].length - 1] >= intervals[i + 1][0]) { //代表有交集:
                isArrayEnd = false;
                continue;
            } else {
                isArrayEnd = true;
                result.add(new int[]{itemStart, intervals[i][intervals[i].length - 1]});
            }
        }
        return result.toArray(new int[result.size()][2]);
    }

    /**
     * 题2:
     *
     * @param word
     * @param abbr
     * @return
     */
    boolean valid(String word, String abbr) {
        String[] split = abbr.split("[A-Za-z]+", -1);
        for (String str : split) {
            if (!"".equals(str)) { //分割时空字符串过滤:
                int temp = abbr.indexOf(str);
                abbr = abbr.replaceFirst(str, word.substring(temp, temp + Integer.valueOf(str)));
            }
        }
        return word.equals(abbr);
    }


    /**
     * 题三
     *
     * @param n
     * @param edges
     * @param start
     * @param end
     * @return
     */
    int minPath(int n, int[][] edges, int start, int end) {
        return 2;
    }


}
