package com.techit;

import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        String[] id_pw = {"meosseugi", "1234"};

        Solution solution = new Solution();
        System.out.println(solution.solution(id_pw, db));
    }
}

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";

        /*for (String[] items : db) {
            for (int i = 0; i < items.length; i++) {
                if (Objects.equals(id_pw[0], items[i]) && Objects.equals(id_pw[1], items[i + 1])) {
                    answer = "login";
                } else if (Objects.equals(id_pw[0], items[i]) && !Objects.equals(id_pw[1], items[i + 1])) {
                    answer = "wrong pw";
                }
            }
        }*/

        for (String[] strings : db) {
            if (id_pw[0].equals(strings[0])) {
                if (id_pw[1].equals(strings[1])) {
                    answer = "login";
                } else {
                    answer = "wrong pw";
                }
            } else {
                answer = "fail";
            }
        }

        return answer;
    }
}