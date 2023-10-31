package com.techit.date231023;

public class ExtendsStudy {
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.숨쉬다(); // 출력 : 숨쉬다.
    }
}
class 동물 {
    void 숨쉬다() {
        System.out.println("숨쉬다.");
    }
}

class 사람 extends 동물 {

}

class 고양이 {
    void 숨쉬다() {
        System.out.println("숨쉬다!!");
    }

    void 야옹() {
        System.out.println("야옹");
    }

    void 뛰어넘다() {
        System.out.println("뛰어넘다");
    }
}

class 검은고양이 extends 고양이{
    void 미래를_예지하다() {
        System.out.println("미래를_예지하다");
    }
}

class 흰고양이 extends 고양이 {
    void 목숨을_늘린다() {
        System.out.println("목숨을_늘린다");
    }
}

class 붉은고양이 extends 고양이 {
    void 빠르게_이동() {
        System.out.println("빠르게_이동");
    }
}