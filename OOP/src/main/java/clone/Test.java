package clone;

/**
 * ClassName: Tese
 * Description:
 * date: 2022/4/20 16:17
 *
 * @author liujian
 * @apiNote
 * @since JDK 1.8
 */
public class Test {
  public static void main(String[] args) throws CloneNotSupportedException {
    Integer[] arr = new Integer[100];
      Change(arr);
    System.out.println(arr[0]);

    String s = "1111";
    s = "111112";
    final int x = 19999999;
    //x = 2;  // cannot assign value to final variable 'x'
    //final A y = new A();
    //y.a = 1;

  }

  public static  void Change(Integer[] arr){
      arr[0] = 1;
  }
}
