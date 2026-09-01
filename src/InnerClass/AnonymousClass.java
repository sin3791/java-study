package InnerClass;

public class AnonymousClass {

    public AnonymousClass() {
    }

    public void start() {
        Employee employee = new Employee() {

            void salPrint() {
//                System.out.println(getSal());
            }

            @Override
            public String toString() {
                String txt = "사원번호==>" + getEmpNo();
                txt += "\n사원명==>" + getEmpName();
//                txt += "\n직급==>" + getPosition();
                return txt;
            }
        };

        System.out.println(employee);
    }

    public static void main(String[] args) {
        new AnonymousClass().start();
    }
}