/*
package com.techit.date231024;

public class TvSystem {
    public static void main(String[] args) {
        //표준Tv전();

        System.out.println("== 표준Tv 리모콘 들여온 후 ==");

        // 표준Tv 리모콘을 저장할 수 있는 변수를 만든다.
        표준Tv a표준Tv;

        // a표준Tv 변수에 샤오미Tv 객체를 연결한다.
        // 중요 : 다른말로 a샤오미Tv 변수안에 있던 샤오미Tv 리코몬을 표준Tv 리모콘화 해서 a표준Tv변수에 넣는다.
        a표준Tv = a샤오미Tv;
        a표준Tv.켜기();
        // 출력 : 샤오미TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 샤오미TV 꺼집니다.

        // a표준Tv 변수에 삼성Tv 객체를 연결한다.
        a표준Tv = a삼성Tv;
        a표준Tv.켜기();
        // 출력 : 삼성TV 켜집니다.
        a표준Tv.끄기();
        // 출력 : 삼성TV 꺼집니다.

        // a표준Tv 변수에 LGTv 객체를 연결한다.
        a표준Tv = aLGTv;
        a표준Tv.켜기();
        // 출력 : LGTV 켜집니다.
        a표준Tv.끄기();
        // 출력 : LGTV 꺼집니다.

        // LGTV만의 고유 기능을 표준Tv 리모콘을 이용해서 호출하기 => 불가능
        // (LGTv) => a표준Tv 변수에 있던 표준Tv 리모콘이 LGTv리모콘화 해서 `aLGTv2` 변수에 들어간다.
        LGTv aLGTv2 = (LGTv) a표준Tv;
        aLGTv2.게임모드전환();
    }

    */
/*static void 표준Tv전() {
        System.out.println("== 표준Tv 리모콘 들여오기 전 ==");

        샤오미Tv a샤오미Tv = new 샤오미Tv("샤오미");
        삼성Tv a삼성Tv = new 삼성Tv("삼성");
        LGTv aLGTv = new LGTv("LG");

        a샤오미Tv.켜기();
        // 출력 => 샤오미Tv 켜집니다.
        a샤오미Tv.끄기();
        // 출력 => 샤오미Tv 꺼집니다.
        a샤오미Tv.vr켜기();
        // 출력 => 샤오미Tv vr켜기!

        a삼성Tv.켜기();
        // 출력 => 삼성Tv 켜집니다.
        a삼성Tv.끄기();
        // 출력 => 삼성Tv 꺼집니다.
        a삼성Tv.ar켜기();
        // 출력 => 삼성Tv ar켜기!

        aLGTv.켜기();
        // 출력 => LGTv 켜집니다.
        aLGTv.끄기();
        // 출력 => LGTv 꺼집니다.
        aLGTv.게임모드전환();
        // 출력 => LGTv 게임모드전환!
    }*//*

}

class 표준Tv {
    String tvName;
    boolean isOn;

    */
/*표준Tv(String tvName) {
        this.tvName = tvName;
    }*//*


    void naming(String tvName) {
        this.tvName = tvName;
    }

    void 켜기() {
        isOn = true;
        print();
    }

    void 끄기() {
        isOn = false;
        print();
    }

    void print() {
        String str = "꺼집니다.";

        if(isOn) str = "켜집니다.";

        System.out.println(tvName + "Tv " + str);
    }

    void printGameMode(String mode) {
        String str = "켜기!";

        if(tvName.equals("LG")){
            mode = "게임";
            str = "모드전환!";
        }

        System.out.println(tvName + "Tv " + mode + str);
    }
}

class 샤오미Tv extends 표준Tv {

    샤오미Tv(String tvName) {
        super(tvName);
    }

    void vr켜기() {
        printGameMode("vr");
    }
}

class 삼성Tv extends 표준Tv {

    삼성Tv(String tvName) {
        super(tvName);
    }

    void ar켜기() {
        printGameMode("ar");
    }
}

class LGTv extends 표준Tv {

    LGTv(String tvName) {
        super(tvName);
    }

    void 게임모드전환() {
        printGameMode("game");
    }
}
*/
