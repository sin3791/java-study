package oopProgram;

import java.util.Calendar;
import java.util.Scanner;

public class calendarOOP {

	Scanner sc = new Scanner(System.in);
	Calendar date;

	public calendarOOP() {
	}

	// 연도 월을 입력받는 메소드 만들기
	public int inData(String msg) {

		System.out.print(msg + "=");
		int data = sc.nextInt();
		return data;
	}

	// 연월을 이용해 Calender객체 만들기
	public void createDate(int year, int month) {
		date = Calendar.getInstance();
		date.set(year, month - 1, 1);
	}

	// 제목출력
	public void titlePrint(int year, int month) {
		System.out.println("\t\t==" + year + "년 " + month + "월==");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
	}

	// 공백출력
	public void spacePrint(int spaceCount) {
		for (int space = 1; space < spaceCount; space++) {
			System.out.print("\t");
		}
	}

	// 날짜 출력
	public void dayPrint(int week, int lastDay) {
		for (int day = 1; day <= lastDay; day++) {
			System.out.print(day + "\t");

			if ((week + day - 1) % 7 == 0)
				System.out.println();
		}
	}

	public void calendarStart() {
		int year = inData("년도입력");
		int month = inData("월 입력(1~12)");

		// 연월로 calendar 만들고 1월로 세팅하기
		createDate(year, month);

		// 1월의 요구 구하
		int week = date.get(Calendar.DAY_OF_WEEK);

		// 마지막날 (Calendar.DAY_OF_MONTH) 날짜중에 제일 큰거
		// Calendar.Day_OF_YEAR : 년도 중에 계열큰값
		int lastDay = date.getActualMaximum(Calendar.DAY_OF_MONTH);

		titlePrint(year, month);
		spacePrint(week);
		dayPrint(week, lastDay);
	}


}
