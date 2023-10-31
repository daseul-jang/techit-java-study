package com.techit.date231023;

public class Question3 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

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

class 전사 {
    String lastName;
    String lastWeaponName;

    void 공격(String name, String weaponName) {
        System.out.println(name + "(이)가 " + weaponName + "(으)로 공격합니다.");

        lastName = name;
        lastWeaponName = weaponName;
    }

    void 재공격() {
        공격(lastName, lastWeaponName);
    }
}
