package api;

import java.util.Arrays;

public class ArraysTest {

	public ArraysTest() {
		//Arrays클래스는 배열처리하는 배열전용 클래스이다
		
		int arr[] = {50,90,4,65,98,21,75,74,85};
		
		// 								원본배열
		int copy[] = Arrays.copyOfRange(arr, 3, 7);
		
		//배열의 값을 [2,3,4,5] 형식으로 문자열을 형성하는 
		String copyStr = Arrays.toString(copy);
		System.out.println("copyStr=" + copyStr);
		
		// 배열의 점위치의 데이터를 원하는 값으로 변경하기 : fill()
		//arr 배열의 Index 3~6까지 값을 100으로 변경
		Arrays.fill(arr, 3, 7, 100);
		System.out.println("fill(arr)=" + Arrays.toString(arr));

		
		
		//배열을 오름차순으로 정렬함
		//전체 정렬 : 오름차순 정렬
		Arrays.sort(arr);
		System.out.println("arr=" + Arrays.toString(arr));
		
		int arr2[] = {60, 78, 42, 84, 15,32,25,5};
		Arrays.sort(arr2, 2,6);
	
		//32가 있는 곳의 Index구하기
		Arrays.sort(arr2);
		System.out.println("arr2= "+ Arrays.toString(arr2));

		int idx = Arrays.binarySearch(arr2, 120);
		System.out.println("idx= "+ idx);
	}
	
	
	public static void main(String[] args) {
		
		new ArraysTest();
	}

}
