package InnerClass;

public class OuterClass {

    int num = 1234;
    String name = "홍길동";
    String addr = "서울시 종로";

    public void print() {
        System.out.println("번호=" + num);
        System.out.println("이름=" + name);
    }
    
    public void CreateInner() {
    	//외부 클래스에서 메소드내에서 현재 클래스의 내부 클래스 사용하기
    	InnerClass test = new InnerClass();
    	test.output();
    }

    class InnerClass {
        int num = 2222;
        String name = "이순신";
        String tel = "010-6612-3313";

        InnerClass() {
        }

        public void output() {
            System.out.println("name= " + name);
            System.out.println("tel= " + tel);
            
            print();
        }
    }

    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.print();

        OuterClass.InnerClass ic = oc.new InnerClass();
        ic.output();
        
        InnerClass ic2 = new OuterClass().new InnerClass();
        ic2.output();
        
    }
}