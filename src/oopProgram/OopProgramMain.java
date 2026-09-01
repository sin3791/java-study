package oopProgram;

import java.util.Scanner;

public class OopProgramMain {

	Scanner scan = new Scanner(System.in);
	public OopProgramMain() {
		
	}
	
	public void start() {
		//기능구현
		
		
		do {
			System.out.println("[메뉴] => 1. 달력, 2. 다이아몬드, 3. 화폐계산하기, 4. 최빈수, 5. 로또번호생성하기, 6. 종료?");
			int menu = scan.nextInt();
			
			// if, switch문
			switch(menu) {
			case 1: 
				calendarOOP oop = new calendarOOP();
				oop.calendarStart();
				break;
				
			case 2:
				new DiamondOOP();
				break;
				
			case 3:
//				MoneyCountOOP moneyOop = new MoneyCountOOP();
				
				MoneyCountOOP moneyOop = MoneyCountOOP.getInstance();
				int cash = moneyOop.input();
				moneyOop.moneyStart(cash);
				break;
				
			case 4:
				new ModelNumberOOP().modelStart();
				break;
				
			case 5:
				new LottoOOP().lottoStart();
				break;
			
			case 6:
//				break;
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;
			default :
				System.out.println("메뉴를 잘못선택하였습니다.");
			}
		} while (true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OopProgramMain().start();
		
	}

}
