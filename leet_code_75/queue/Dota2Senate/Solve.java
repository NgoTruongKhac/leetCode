package leet_code_75.queue.Dota2Senate;

import java.util.LinkedList;
import java.util.Queue;

public class Solve {
    public static String predictPartyVictory(String senate) {

        int n = senate.length();

        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.add(i);
            } else {
                dire.add(i);
            }
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {

            int rIndex = radiant.poll();
            int dIndex = dire.poll();

            if (rIndex < dIndex) {
                radiant.add(rIndex + n);
            } else {
                dire.add(dIndex + n);
            }

        }

        return radiant.isEmpty() ? "Dire" : "Radiant";

    }

    public static void main(String[] args) {
        String senate = "";

        System.out.println(predictPartyVictory(senate));
    }

}
