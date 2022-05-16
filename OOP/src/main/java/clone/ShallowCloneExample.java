package clone;

/**
 * ClassName: ShallowCloneExample
 * Description:
 * date: 2022/4/20 16:49
 *
 * @author liujian
 * @apiNote
 * @since JDK 1.8
 */
public class ShallowCloneExample implements Cloneable {
    private int[] arr;

    public ShallowCloneExample() {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int get(int index) {
        return arr[index];
    }

    @Override
    protected ShallowCloneExample clone() throws CloneNotSupportedException {
        return (ShallowCloneExample) super.clone();
    }
}


class Test4{
  public static void main(String[] args) {
      ShallowCloneExample e1 = new ShallowCloneExample();
      ShallowCloneExample e2 = null;
      try {
          e2 = e1.clone();
      } catch (CloneNotSupportedException e) {
          e.printStackTrace();
      }
      e1.set(200, 222);
      System.out.println(e2.get(2)); // 222

  }
}