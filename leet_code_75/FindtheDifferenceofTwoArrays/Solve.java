package leet_code_75.FindtheDifferenceofTwoArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solve {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> distince1 = new ArrayList<>();
        List<Integer> distince2 = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int n : nums1) {
            set1.add(n);
        }

        for (int n : nums2) {
            set2.add(n);
        }

        for (int n : set1) {
            if (!set2.contains(n)) {

                distince1.add(n);
            }

        }

        for (int n : set2) {
            if (!set1.contains(n)) {
                distince2.add(n);
            }
        }

        answer.add(distince1);
        answer.add(distince2);

        return answer;

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 3 };
        int[] nums2 = { 1, 1, 2, 2 };

        System.out.println(findDifference(nums1, nums2));
    }

}