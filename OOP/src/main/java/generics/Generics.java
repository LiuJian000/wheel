package generics;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Generics
 * Description:
 * date: 2022/4/21 09:44
 *
 * @author liujian
 * @apiNote
 * @since JDK 1.8
 */
public class Generics {

  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      List<Integer> list = new ArrayList<>();
      list.add(12);
//这⾥直接添加会报错
//      list.add("a");
      Class<? extends List> clazz = list.getClass();
      Field[] fields = clazz.getFields();
    System.out.println(fields);
    for (Field field : fields) {
      System.out.println(field.getName());
    }
      Method add = clazz.getDeclaredMethod("add", Object.class);
//但是通过反射添加，是可以的
      add.invoke(list, "kl");
      System.out.println(list);
  }
}
