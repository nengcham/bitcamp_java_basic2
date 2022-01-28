package com.example.demo.controller;

import com.example.demo.domain.BmiDTO;
import com.example.demo.service.BmiService;
import com.example.demo.service.CalcService;
import com.example.demo.domain.CalcDTO;
import com.example.demo.domain.GoogleDTO;
import com.example.demo.service.GoogleService;
import com.example.demo.domain.GradeDTO;
import com.example.demo.service.GradeService;
import com.example.demo.domain.LoginDTO;
import com.example.demo.service.LoginService;

import java.util.Scanner;
/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController
 * author     : choigeonil
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE         AUTHOR        NOTE
 * ================================
 * 2022-01-27   choigeonil    최초 생성
 * 2022-01-28                 DTO, Service, Controller 구분
 */
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiDTO bmi = new BmiDTO();
        CalcDTO calc = new CalcDTO();
        GradeDTO grade = new GradeDTO();
        GoogleDTO google = new GoogleDTO();
        LoginDTO login = new LoginDTO();
        BmiService bmiService = new BmiService();
        CalcService calcService = new CalcService();
        GradeService gradeService = new GradeService();
        GoogleService googleService = new GoogleService();
        LoginService loginService = new LoginService();
        while(true){
            System.out.println("메뉴 선택\n" + "1.BMI, 2.CALC, 3.GRADE, 4.GOOGLE, 5.LOGIN, 0.EXIT");
            String res = "";
            switch (scanner.next()){
                case "0" :
                    System.out.println("EXIT"); return;
                case "1" :
                    System.out.println(BmiDTO.BMI_TITLE + "\n이름, 키(m), 몸무게(kg)");
                    bmi.setName(scanner.next());
                    bmi.setHeight(scanner.nextDouble());
                    bmi.setWeight(scanner.nextDouble());
                    res = bmiService.execute(bmi);
                    break;
                case "2" :
                    System.out.println(CalcDTO.CALC_TITLE + "\n숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = calcService.execute(calc);
                    break;
                case "3" :
                    System.out.println(GradeDTO.GRADE_TITLE + "\n이름, 국어, 영어, 수학");
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = gradeService.execute(grade);
                    break;
                case "4" :
                    System.out.println(GoogleDTO.GOOGLE_TITLE + "\n검색할 키워드를 입력해 주세요.");
                    google.setSearch(scanner.next());
                    res = googleService.execute(google);
                    break;
                case "5" :
                    System.out.println(LoginDTO.LOGIN_TITLE + "\n아이디, 비밀번호, 이름");
                    login.setName(scanner.next());
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    res = loginService.execute(login);
                    break;
                default: res = "WRONG";
                    break;
            }
            System.out.println(res);
        }
    }
}
