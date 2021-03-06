package leetcode.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: 1094. Car Pooling
 *
 * @author Baltan
 * @date 2019-06-24 10:16
 */
public class CarPooling {
    public static void main(String[] args) {
        int[][] trips1 = {{2, 1, 5}, {3, 3, 7}};
        System.out.println(carPooling(trips1, 4));

        int[][] trips2 = {{2, 1, 5}, {3, 3, 7}};
        System.out.println(carPooling(trips2, 5));

        int[][] trips3 = {{2, 1, 5}, {3, 5, 7}};
        System.out.println(carPooling(trips3, 3));

        int[][] trips4 = {{3, 2, 7}, {3, 7, 9}, {8, 3, 9}};
        System.out.println(carPooling(trips4, 11));

        int[][] trips5 = {{3, 2, 7}};
        System.out.println(carPooling(trips5, 2));
    }

    public static boolean carPooling(int[][] trips, int capacity) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int[] trip : trips) {
            for (int i = trip[1]; i < trip[2]; i++) {
                map.put(i, map.getOrDefault(i, 0) + trip[0]);

                if (map.get(i) > capacity) {
                    return false;
                }
            }
        }
        return true;
    }
}
