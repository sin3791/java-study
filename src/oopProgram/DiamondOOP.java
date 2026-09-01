package oopProgram;

public class DiamondOOP {
	calendarOOP num = new calendarOOP();
	
	public DiamondOOP() {
		diamondStart();
	}
	
	public void diamondStart() {
		int max = num.inData("정수(1~45)");
		createDiamond(max);
	}
	
	public void createDiamond(int max) {
        char ch = 'A';

        for (int i = 1; i <= max * 2 - 1; i += 2) {
            int count = i <= max ? i : max * 2 - i;
            int space = (max - count) / 2;

            for (int j = 0; j < space; j++)
                System.out.print(" ");

            for (int j = 0; j < count; j++) {
                System.out.print(ch++);
                if (ch > 'Z') ch = 'A';
            }

            System.out.println();
        }
	}

}
