import java.util.Map;

/**
 * ClassName: StringFomart Description: date: 2021/12/21 11:17
 *
 * @author liujian
 * @since JDK 1.8
 */
public class StringFomart {
  public static void main(String[] args) throws InterruptedException {
    // ObjectMapper objectMapper = new ObjectMapper();
    //
    ////
    //// java拼接字符串、格式化字符串方式
    // String arg0 = "Bob";
    // String arg1 = "Alice";
    ///**
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
    // String formattedText = MessageFormat.format("hello,{1}. I am {0}.", arg0, arg1);
    // System.out.println(formattedText);
    //
    //  List<String> objects = emptyList();
    //System.out.println(objects.size());

      //List list = new ArrayList<>();
    //for (int i = 0; i < 10000; i++) {
    //  list.add(i);
    //}
    //System.out.println(list);
    //Collections.shuffle(list);
    //System.out.println(list);
    //
    //List<String> list = new ArrayList<>();
    //list.add("11");
    //list.add("11");
    //list.add("2");
    //list.add("123");
    //List<String> list1 = new ArrayList<>();
    //list1.add("11");
    //String s ="s" ;
    //int hash = Objects.hash(s);
    //System.out.println(hash);
    //
    //list.removeAll(list1);
    //System.out.println(list);
    //  LocalDateTime localDateTime = LocalDateTime.now();
    //  LocalDateTime minusMonths = localDateTime.minusMonths(1L);
    //
    //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
    //Date date = new Date();
    //Calendar calendar = Calendar.getInstance();
    //calendar.setTime(date); // 设置为当前时间
    //calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - 1); // 设置为上一个月
    //date = calendar.getTime();
    //System.out.println(date);
    //String accDate = format.format(date);
    //System.out.println(accDate);
    //System.out.println(minusMonths);
    //System.out.println(    minusMonths.format(DateTimeFormatter.ofPattern("yyyy-MM")));
    //int i = 5;
    //int j = 2;
    //int pageIndex = Math.floorDiv(i,j);
    //System.out.println(pageIndex);
    //List<String> objects = null;
    //System.out.println(    CollectionUtils.isEmpty(objects)
    //);
    //Map<String,String> map = new HashMap<>();
    //
    //String s = map.get(null);
    //System.out.println(s);
    //User ww = User.builder().name("11").password("ww").build();
    //User sw = User.builder().name("11q").password("wsw").build();
    //
    //List<User> users = new ArrayList<>();
    //users.add(ww);
    //users.add(sw);
    //List<String> stringStream = users.stream().filter(o -> Objects.equals(o.getName(), "11")).map(User::getPassword).collect(Collectors.toList());
    ////List<String> collect = stringStream.stream().map(User::getPassword).collect(Collectors.toList());
    //List<String> stringm = users.stream().filter(o -> Objects.equals(o.getName(), "11q")).map(User::getPassword).collect(Collectors.toList());
    //
    //stringStream.forEach(System.out::println);
    //stringm.forEach(System.out::println);

    //List<String> stringStream = list.stream().filter(e -> !"11".equals(e) || !"2".equals(e)).collect(Collectors.toList());
    //System.out.println(stringStream);
    ////System.out.println(list.stream().sorted().collect(Collectors.toList()));
    //  String   a   =  new DecimalFormat("0.00").format(100.12345  );
    //  List<String> b = Optional.ofNullable(list).orElse(new ArrayList<>());
    //
    //  System.out.println(b);
    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    //
    //System.out.println(LocalDateTime.parse("2022-03-01 00:00:00",formatter));
    //System.out.println(LocalDateTime.now());
    //String s= "ss";
    //JavaType javaType = TypeFactory.defaultInstance()
    //        .constructParametricType(HashMap.class, String.class, List.class);
    //Map<String, List<String>> searchTypeInfoMap = new HashMap<>();
    //try {
    //  searchTypeInfoMap = objectMapper.readValue(s, javaType);
    //} catch (IOException e) {
    //  e.printStackTrace();
    //  System.out.println("errer");
    //}
    //System.out.println("ok")
    //  Map<String, String> map = new HashMap<>();
    // new Thread(()-> {
    //     try {
    //         putMap(map,Thread.currentThread().getName());
    //     } catch (InterruptedException e) {
    //         e.printStackTrace();
    //     }
    // }
    // ).start();
    //  new Thread(()-> {
    //      try {
    //          putMap(map,Thread.currentThread().getName());
    //      } catch (InterruptedException e) {
    //          e.printStackTrace();
    //      }
    //  }
    //  ).start();
    //  Thread.sleep(100L);
    //System.out.println(map);
  }

  private static void putMap(Map<String, String> map,String s) throws InterruptedException {
    for (int i = 0; i < 1000; i++) {

        map.put(String.valueOf(i), s);
    }
  }

}
