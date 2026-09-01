package Inheritance;

public abstract class AbstractTest extends Student{

    public AbstractTest() {
    }

    // 일반 메서드: 구현부가 있음
    public int add(int a, int b) {
        return a + b;
    }

    // 추상 메서드: 구현부가 없음
    public abstract int minus(int a, int b);

    public abstract int divide(int a, int b);
}