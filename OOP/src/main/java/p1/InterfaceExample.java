package p1;

/**
 * ClassName: p1.InterfaceExample
 * Description:
 * date: 2022/4/20 15:40
 *
 * @author liujian
 * @apiNote
 * @since JDK 1.8
 */
public interface InterfaceExample {
   void func1();

    default void func2(){
        System.out.println("func2");
    }

    int x = 123;
    int y = 0;               // Variable 'y' might not have been initialized
    //public int z = 0;       // Modifier 'public' is redundant for interface fields
    // private int k = 0;   // Modifier 'private' not allowed here
    // protected int l = 0; // Modifier 'protected' not allowed here
    // private void fun3(); // Modifier 'private' not allowed here
}

  class InterfaceImplementExample implements InterfaceExample {
    @Override
    public void func1() {
        System.out.println("func1");
    }
}
class Test1{
  public static void main(String[] args) {
      // p1.InterfaceExample ie1 = new p1.InterfaceExample(); // 'p1.InterfaceExample' is abstract; cannot be instantiated
      InterfaceExample ie2 = new InterfaceImplementExample();
      ie2.func1();
      ie2.func2();
      System.out.println(InterfaceExample.x);

  }
}



