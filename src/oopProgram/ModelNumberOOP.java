package oopProgram;

import java.util.Random;

public class ModelNumberOOP {
	Random ran = new Random();
	int cnt[];
	public ModelNumberOOP() {
		
	}
	
	
	//난수 생성(min~max)
	public int[] createRandom(int min, int max, int count) {
		int node[] = new int[count];
		for (int i = 0; i < node.length; i++) {
			node[i] = ran.nextInt(max-min+1) + min; 
		}
		return node;
	}
	
	//숫자와 발생년도
	public void nodeCount(int node[]) {
		cnt = new int[101];
		for (int n : node) {
			cnt[n]++;
		}
	}
	//최빈수 구하기 출력
	public void nodeSelect() {
		int nodeNum= 1;
		for(int i=2; i<cnt.length; i++) {
			if (cnt[nodeNum] <= cnt[i]) {
				nodeNum = i;
			}
		}
		System.out.println("최빈수="+ nodeNum);
	}
	
	public void modelStart() {
		//난수생성
		int node[] = createRandom(1, 100, 1000);
		// 갯수 구하기
		nodeCount(node);
		
		//최빈수 구하기 출력
		nodeSelect();

	}
	public static void main(String[] args) {
//		new ModelNumberOOP().modelStart();
		
//		ModelNumberOOP oop = new ModelNumberOOP();
//		oop.modelStart();
	}
}

