package com.techit.date231024;

public class Mission1 {
    public static void main(String[] args) {
        전사1 a전사 = new 전사1();

        a전사.공격("브라이언", "칼");
        // 브라이언(이)가 칼(으)로 공격합니다.

        a전사.재공격();
        // 브라이언(이)가 칼(으)로 공격합니다.

        a전사.공격("필립", "창");
        // 필립(이)가 창(으)로 공격합니다.

        a전사.공격("마크", "지팡이");
        // 마크(이)가 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(이)가 지팡이(으)로 공격합니다.

        a전사.재공격();
        // 마크(이)가 지팡이(으)로 공격합니다.
    }
}

class 전사1 {
    String playerName;
    String weapon;
    void 공격(String playerName, String weapon) {
        this.playerName = playerName;
        this.weapon = weapon;

        System.out.println(playerName + "(이)가 " + weapon + "(으)로 공격합니다.");
    }

    void 재공격() {
        this.공격(playerName, weapon);
    }
}