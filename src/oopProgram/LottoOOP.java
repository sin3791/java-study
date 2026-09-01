	package oopProgram;
	
	import java.util.Random;
	import java.util.Scanner;
	
	public class LottoOOP {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		public void LottoOOP() {
			
		}
		
		// 게임수
		public void playNum(int num) {
			for (int i = 0; i < num; i++) {
				createNum(num);
				System.out.println();
			}
		}
		
		// 난수생성
		public void createNum(int count) {
			
			int node[] = new int[count];
			for (int i = 0; i < node.length; i++) {
				node[i] = rd.nextInt(45) + 1;
				
			}	
			numSort(node);
	
			for (int n : node) {
				System.out.print(n + " ");
			}
			
			
		}
		
		// 숫자 정렬  
		public void numSort(int[] num) {
			
			for (int k = 0; k < num.length - 1; k++) {
	            for (int j = 0; j < num.length - 1 - k; j++) {
	                if (num[j] > num[j + 1]) {
	                    int temp = num[j];
	                    num[j] = num[j + 1];
	                    num[j + 1] = temp;
	                }
	            }
	        }
		}
		
		
		public void lottoStart() {
			
			do {
				System.out.print("게임수를 입력하세요.");
				int num= sc.nextInt();
			
				playNum(num);
			} while(regame());
			
			
		}
		// 리게임 여부	
		public boolean regame() {
			System.out.print("다시 실행하시겠습니까? 1: 예, 2: 아니오 → ");
	
			
			int select = sc.nextInt();
			if (select != 1) {
				return select == 0;
			} else {
				return select == 1;
			}
			
		}
		

	}