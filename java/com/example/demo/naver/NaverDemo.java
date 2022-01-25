package com.example.demo.naver;

import java.util.Scanner;

/**
 * packageName: com.example.demo.naver
 * fileName   : NaverDemo.java
 * author     : choigeonil
 * date       : 2022-01-25
 * desc       : 네이버 앱을 실행하는 컨트롤러
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-25   choigeonil    최초 생성
 */
public class NaverDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaverApp naverApp = new NaverApp();

        System.out.println("아이디");
        String id = scanner.next();

        System.out.println("비밀번호");
        String pw = scanner.next();

        String res = naverApp.naver(id);
        System.out.println(res);

    }
}