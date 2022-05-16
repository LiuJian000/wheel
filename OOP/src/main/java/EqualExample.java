import java.util.HashSet;

/**
 * ClassName: EqualExaple Description: date: 2022/4/20 15:46
 *
 * @author liujian
 * @apiNote
 * @since JDK 1.8
 */
public class EqualExample {
  private int x;
  private int y;
  private int z;

  public EqualExample(int x, int y, int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    EqualExample that = (EqualExample) o;

    if (x != that.x) return false;
    if (y != that.y) return false;
    return z == that.z;
  }


}

class Test2 {
      public static void main(String[] args) {
            EqualExample e1 = new EqualExample(1, 1, 1);
            EqualExample e2 = new EqualExample(1, 1, 1);
            System.out.println(e1.equals(e2)); // true
            HashSet<EqualExample> set = new HashSet<>();
            set.add(e1);
            set.add(e2);
            System.out.println(set.size()); // 2
            System.out.println(e1.hashCode());
          System.out.println(e1.toString());
            System.out.println(e2.hashCode());
          System.out.println(e2.toString());
            System.out.println(e1.getClass().hashCode());
            System.out.println(e2.getClass().hashCode());
      }
}
