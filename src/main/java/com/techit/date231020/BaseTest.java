package com.techit.date231020;

public class BaseTest {
    public static void main(String[] args) {
        multipleSum();
        fibonacci();
        primeFactor();
        palindrome();
        minDivNum();
    }

    // 100000 보다 작은 자연수 중 3, 5배수 모두 더하기
    static void multipleSum() {
        System.out.println("100000 보다 작은 자연수 중 3, 5배수 모두 더하기");

        long sum = 0;

        for(int i = 1; i < 100000; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    // 피보나치 수열 짝수의 합
    static void fibonacci() {
        System.out.println("피보나치");

        int x1 = 1;
        int x2 = 2;

        long sum = 0;

        while(x2 <= 50000000) {
            if(x2 % 2 == 0) sum += x2;

            int temp = x2;
            x2 = x1 + x2;
            x1 = temp;
        }

        System.out.println(sum);
    }

    // 소인수
    static void primeFactor() {
        System.out.println("소인수");

        long num = 1600851475143L;
        int i = 2;

        while(i < num) {
            if(num % i == 0) num /= i;
            else i++;
        }

        System.out.println(num);
    }

    // 대칭수
    static void palindrome() {
        System.out.println("대칭수");

        long max = 0;

        // while ver
        /*long i = 1;

        while(i < 10000) {
            long j = 1;
            while(j < 10000) {
                long rs = i * j;

                if(isPalindrome(rs)) {
                    if(rs > max) {
                        max = rs;
                    }
                }
                j++;
            }

            i++;
        }*/

        // for ver
        for(long i = 1; i < 10000; i++) {
            for(long j = 1; j < 10000; j++) {
                long rs = i * j;

                if(isPalindrome(rs)) {
                    if(rs > max) max = rs;
                }
            }
        }

        System.out.println(max);
    }

    static boolean isPalindrome(long num) {
        String str = String.valueOf(num);

        int i = 0; // 시작점
        int j = str.length() - 1; // 마지막 점

        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    // 1~23까지 어떤 수로도 나누어 떨어지는 가장 작은 수
    static void minDivNum() {
        System.out.println("어떤 수로도 나누어 떨어지는 가장 작은 수");

        long num = 1;
        int i = 1;

        while(true) {
            if(isAnswer(num)) {
                System.out.println(num);
                return;
            }

            num++;
        }
    }

    static boolean isAnswer(long num) {
        for(int i = 1; i <= 23; i++) {
            if(num % i != 0) return false;
        }

        return true;
    }
}
