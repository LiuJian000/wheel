

/**
 * ClassName: CachePool
 * Description:
 * date: 2022/4/20 15:09
 *
 * @author liujian
 * @apiNote
 * @since JDK 1.8
 */


public class CachePool {
  public static void main(String[] args) {

      Integer x = new Integer(123);
      Integer y = new Integer(123);
      System.out.println(x == y);    // false
      Integer z = Integer.valueOf(123);
      Integer k = Integer.valueOf(123);
      System.out.println(z == k);   // true

      byte b = 'd';
      String s = "大加号";
    System.out.println( s.getBytes());


  }
}
