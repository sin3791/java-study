package oopProgram;

public class MoneyCountOOP {
	calendarOOP oop = new calendarOOP();
	public static MoneyCountOOP obj;
	
	
	protected MoneyCountOOP() {
		
	}
	
	//싱글톤 객체 생성방법
	public static MoneyCountOOP getInstance() {
		obj = new MoneyCountOOP();
		return obj;
	}
	
	public int input() {
		return oop.inData("금액을 입력하세요.?");
	}
	
	public void moneyStart(int cash) {
		 
		int danwi = 50000; // 처음 시작할 화폐 단위
		int value = 5;     // 다음 화폐 단위를 구하기 위한 값

		while (cash > 0) { // 금액이 0원이 될 때까지

		    int cnt = cash / danwi; // 현재 화폐의 개수

		    // 현재 화폐로 바꿀 수 있는 경우
		    if (cnt > 0) {
		        System.out.println(
		                danwi + "원 = " + cnt
		                + ((danwi >= 1000) ? "장" : "개")
		        );

		        // 계산한 화폐 금액만큼 빼기
		        cash = cash - danwi * cnt;
		    }

		    // 다음으로 작은 화폐 단위 계산
		    danwi = danwi / value;

		    if (value == 5) {
		        value = 2;
		    } else {
		        value = 5;
		    }
		}
	}

}

