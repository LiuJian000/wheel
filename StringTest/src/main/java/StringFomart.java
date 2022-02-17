import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: StringFomart Description: date: 2021/12/21 11:17
 *
 * @author liujian
 * @since JDK 1.8
 */
public class StringFomart {
  public static void main(String[] args) {

    //
    //// java拼接字符串、格式化字符串方式
    // String arg0 = "Bob";
    // String arg1 = "Alice";
    /// **
    // * StringBuffer线程安全
    // */
    // System.out.println(new StringBuilder(arg0).append(arg1));
    //// 线程不安去
    // System.out.println(new StringBuffer(arg0).append(arg1));
    // System.out.println(arg0.concat(arg1));
    //
    // System.out.println("hello," + arg0 + ". I am " + arg1 + ".");
    //
    // System.out.println(String.join("---", arg0, arg1));
    //
    // StringUtils.join(arg0, arg1);
    //
    //// StringBuilder.append
    // StringBuilder builder = new StringBuilder();
    // builder.append("hello,");
    // builder.append(arg0);
    // builder.append(". I am ");
    // builder.append(arg1);
    // builder.append(".");
    // System.out.println(builder.toString());
    //
    //// String.format
    // String formatStr = String.format("hello,%s. I am %s.", arg0, arg1);
    // System.out.println(formatStr);
    //
    //// MessageFormat.format
    // String formattedText = MessageFormat.format("hello,{0}. I am {1}.", arg0, arg1);
    // System.out.println(formattedText);

    List list = new ArrayList<>();
    for (int i = 0; i < 10000; i++) {
      list.add(i);
    }
    System.out.println(list);
    Collections.shuffle(list);
    System.out.println(list);
  }
}
