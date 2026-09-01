package api;

import java.util.Scanner;
public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i=5;
		int j;
		int count=i;
		int count1=5;
		int count2=5;
		int count3=5;
		int count4=5;
		int count5=5;

		int field[][] = new int[6][7];

		
		
		
		for (int c = 1; c <= 42; c++) {
			System.out.println("첫번째 플레이어 0~6중에 선택하세요");
			j = sc.nextInt();
			field[i][j] = 1;
			if (j == 0) {
				System.out.println("j == 0");
				System.out.println(field[i][j]+ ", " + i + ", " +j);
				count -= 1;
				if (count < 0) {
					count = 0;
					System.out.println("더 이상 0열은 입력이 안됩니다.");
				}
			}
			else if (j == 1) {
				System.out.println("j == 1");
				count1 -= 1;
				if (count1 <= 0) {
					count1 = 0;
				}
				System.out.println(field[count][j]+ ", " +count1 + ", " +j);
			
			}
			else if (j == 2) {
				System.out.println("j == 2");
				count2 -= 1;
				if (count2 <= 0) {
					count2 = 0;
				}
				System.out.println(field[count2][j]+ ", " + count2 + ", " +j);
				
			}
			else if (j == 3) {
				System.out.println("j == 3");
				count3 -= 1;
				if (count3 <= 0) {
					count3 = 0;
				}
				System.out.println(field[count3][j]+ ", " + count3 + ", " +j);
				
			}else if (j == 4) {
				System.out.println("j == 4");
				count4 -= 1;
				if (count4 <= 0) {
					count4 = 0;
				}
				System.out.println(field[count4][j]+ ", " + count4 + ", " +j);
				
			}
			else if (j == 5) {
				System.out.println("j == 5");
				count5 -= 1;
				if (count5 <= 0) {
					count5 = 0;
				}
				System.out.println(field[count5][j]+ ", " + count5 + ", " +j);
			}
		}
		
		

	}
}


