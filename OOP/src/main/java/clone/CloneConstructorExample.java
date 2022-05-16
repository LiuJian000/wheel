package clone;

/**
 * ClassName: CloneConstructorExample
 * Description:
 * date: 2022/4/20 16:53
 *
 * @author liujian
 * @apiNote
 * @since JDK 1.8
 */
public class CloneConstructorExample {
    private int[] arr;

    public CloneConstructorExample() {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public CloneConstructorExample(CloneConstructorExample original) {
        arr = new int[original.arr.length];
        for (int i = 0; i < original.arr.length; i++) {
            arr[i] = original.arr[i];
        }
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int get(int index) {
        return arr[index];
    }
}

class test6{
  public static void main(String[] args) {
      CloneConstructorExample e1 = new CloneConstructorExample();
      CloneConstructorExample e2 = new CloneConstructorExample(e1);
      e1.set(2, 222);
      System.out.println(e2.get(2)); // 2
  }
}
