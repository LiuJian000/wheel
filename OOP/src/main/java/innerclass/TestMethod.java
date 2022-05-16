package innerclass;

/**
 * ClassName: TestMethid
 * Description:
 * date: 2022/4/20 17:12
 *
 * @author liujian
 * @apiNote
 * @since JDK 1.8
 */
public class TestMethod extends BaseClass {

    static int a;

    public TestMethod() {
        super();
        System.out.println("constructor of exec");
    }

    static {
        String a1="12";
        String a2="22";
        a=Integer.parseInt(a1)+Integer.parseInt(a2);
        System.out.println("chilren static block");
    }

    public static void main(String[] args) {
        System.out.println(TestMethod.a);
        TestMethod.a=45;
        new TestMethod();
        System.out.println(TestMethod.a);
        new TestMethod();
        System.out.println(TestMethod.a);
    }

}

class BaseClass{

    static int a;

    static {
        String a1="10";
        String a2="20";
        a=Integer.parseInt(a1)+Integer.parseInt(a2);
        System.out.println("baseClass static block");
        System.out.println(a);
    }

    public BaseClass(){
        System.out.println("Base class constructor of exec");
        System.out.println(BaseClass.a);
        BaseClass.a=300;
        System.out.println(BaseClass.a);
    }
}