package clone;

/**
 * ClassName: p2.CloneExample
 * Description:
 * date: 2022/4/20 15:59
 *
 * @author liujian
 * @apiNote
 * @since JDK 1.8
 */
public class CloneExample {
    private int a;
    protected int b;
    protected int c;


    protected void speak() {
        System.out.println("ssss");
    }

    @Override
    protected CloneExample clone() throws CloneNotSupportedException {
        return (CloneExample)super.clone();
    }
}
class Test3{
  public static void main(String[] args) {
      CloneExample e1 = new CloneExample();
      try {
          e1.speak();
          int b = e1.b;
          CloneExample e2 = e1.clone();
      } catch (CloneNotSupportedException e) {
          e.printStackTrace();
      }

  }
}