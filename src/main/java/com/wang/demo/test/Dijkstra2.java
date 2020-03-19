package com.wang.demo.test;


import java.util.HashMap;
import java.util.Map;

/**
 * 迪杰斯特算法:
 * 首先根据起始点，标记起点到其他点的距离(比如A)
 * 然后从这些所有距离中选出最短距离，然后将该点加入到已加入顶点中: (A----> B)
 * 然后从B点出发，计算B点(AB + BK)距离，这里有个误区，容易绕，起始比如AB在此之前肯定是最短距离
 * 的，因为之前的节点最短距离都随便遍历次数已经被更新到最短，肯定是因为这个点的加入
 * 导致剩余的点出现了最短路径:
 */
public class Dijkstra2 {


    //原博地址:  https://www.jianshu.com/p/ff6db00ad866


    public static final int M = 10000; // 代表正无穷(其实相当于已经一个很大值了)


    public static void main(String[] args) {
        // 二维数组每一行分别是 A、B、C、D、E 各点到其余点的距离,
        // A -> A 距离为0, 常量M 为正无穷
        Map<Integer, Object> param= new HashMap<>();
        param.put(0, "A");
        param.put(1, "B");
        param.put(2, "C");
        param.put(3, "D");
        param.put(4, "E");

        int[][] weight1 = {
                {0, 4, M, 2, M},
                {4, 0, 4, 1, M},
                {M, 4, 0, 1, 3},
                {2, 1, 1, 0, 7},
                {M, M, 3, 7, 0}
        };

        int start = 0;

        int[] shortPath = dijkstra(weight1, start);

        for (int i = 0; i < shortPath.length; i++)
            System.out.println("从" + param.get(start) + "出发到" + param.get(i) + "的最短距离为：" + shortPath[i]);
    }


    /**
     * @param weight 权重:
     * @param start  开始顶点:
     * @return
     */
    public static int[] dijkstra(int[][] weight, int start) {
        int pointCount = weight.length; //顶点个数:
        int[] distanceData = new int[pointCount]; //从start点到其他点的最短距离
        boolean[] isCalculator = new boolean[pointCount]; //从顶点到某点的最短距离是否已经算出:
        String[] pathStr = new String[pointCount];//最短路径:
        //首先顶点到自身的最短距肯定是0了
        distanceData[start] = 0;
        isCalculator[start] = true;

        //当前路径记录:
        for (int i = 0; i < pointCount; i++) {
            pathStr[i] = start + "--->" + i;
        }


        //每个遍历周期内寻找出最短当前未加入的最短路径:(由于初始节点到自己的最短距离已经算出了，因此需要length -1 次)
        for (int i = 0; i < pointCount - 1; i++) {
            int flag = -1; //当前游标，记录当前未加入已寻最小值集合的最小值下标:
            int max_value = Integer.MAX_VALUE - 8;
            for (int j = 0; j < pointCount; j++) {
                if (weight[start][j] < max_value && isCalculator[j] == false) {
                    flag = j;
                    max_value = weight[start][j];
                }
            }
            //已寻找到该轮的最小值;
            distanceData[flag] = weight[start][flag];
            isCalculator[flag] = true;


            //然后将该找到的顶点作为中间节点,从 weight[start][flag] + weight[flag][k] < weight[start][k]
            //啥意思呢。即代表该节点加入是否使得已知节点的距离变短了。
            //即必然是该节点的加入，(那些未加入的)才会出现最短路径，所以一定需要中间节点:
            for (int k = 0; k < pointCount; k++) {
                if (weight[start][flag] + weight[flag][k] < weight[start][k] && isCalculator[k] == false) {
                    //如果小那么更新最短距离：也就是对应动态长度:
                    weight[start][k] = weight[start][flag] + weight[flag][k];
                    //最短路径轨迹修改:
                    pathStr[k] = pathStr[flag] + "----->" + k;
                }
            }
        }

        for (int i = 0; i < pointCount; i++) {

            System.out.println("从" + start + "出发到" + i + "的最短路径为：" + pathStr[i]);
        }
        System.out.println("=====================================");
        return distanceData;
    }
}
