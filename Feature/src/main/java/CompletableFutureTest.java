import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

/**
 * ClassName: CompletableFutureTest Description: date: 2021/12/20 13:51
 *
 * @author liujian
 * @since JDK 1.8
 */
public class CompletableFutureTest {
  public static AtomicInteger i = new AtomicInteger(1);

  public static void main(String[] args)
      throws ExecutionException, InterruptedException, TimeoutException {
    //System.getProperties()
    //    .forEach(
    //        (k, v) -> {
    //          System.out.println(k + "=" + v);
    //        });
    //
    //Map<String, String> getenv = System.getenv();
    //getenv.forEach((k, v) -> System.out.println(k + "：" + v));
    ThreadPoolExecutor executor = ThreadPools.getInstance().executor();
    CompletableFutureTest completableFutureTest = new CompletableFutureTest();
    //CompletableFuture<String> stringCompletableFuture =
    //    CompletableFuture.supplyAsync(
    //        (Supplier<String>) completableFutureTest::getString, executor);
    //stringCompletableFuture.whenComplete(
    //    (result, error) -> {
    //      System.out.println("拨打" + result);
    //      error.printStackTrace();
    //    });
    //stringCompletableFuture.whenComplete(
    //    (result, error) -> {
    //      System.out.println("拨打2" + result);
    //      error.printStackTrace();
    //    });
    //CompletableFuture<Integer> intCompletableFuture =
    //    CompletableFuture.supplyAsync((Supplier<Integer>) completableFutureTest::getInt, executor);
    List<CompletableFuture<Integer>> completableFutureList = new ArrayList<CompletableFuture<Integer>>();
    for (int i = 0;i < 10; i++) {
      completableFutureList.add(CompletableFuture.supplyAsync((Supplier<Integer>) completableFutureTest::getInt, executor));
    }
    completableFutureList.forEach(completableFuture -> {
      try {
        completableFuture.get(1000,TimeUnit.MILLISECONDS);
      } catch (InterruptedException e) {
        e.printStackTrace();
      } catch (ExecutionException e) {
        e.printStackTrace();
      } catch (TimeoutException e) {
        e.printStackTrace();
      }
    });
    completableFutureList.add(CompletableFuture.supplyAsync((Supplier<Integer>) completableFutureTest::getInt, executor));
    //Demo demo =
    //    CompletableFuture.allOf(stringCompletableFuture, intCompletableFuture)
    //        .handle(
    //            (v, exception) -> {
    //              if (exception != null) {
    //                return null;
    //              }
    //              return completableFutureTest.getDemo(
    //                  stringCompletableFuture, intCompletableFuture);
    //            })
    //        .get(10000, TimeUnit.MILLISECONDS);
  }

  private String getString() {
    try {
      System.out.println("string1");
      Thread.sleep(3000);

      return "这是string1";
    } catch (Exception e) {
      return "错误1";
    }
  }

  private Integer getInt() {
    try {
      System.out.println(i);
      Thread.sleep(1000);
      return i.incrementAndGet();
    } catch (Exception e) {
      return 2;
    }
  }

  private Demo getDemo(
      CompletableFuture<String> stringCompletableFuture,
      CompletableFuture<Integer> intCompletableFuture) {
    String s = stringCompletableFuture.getNow(null);
    Integer in = intCompletableFuture.getNow(null);
    Demo demo = new Demo();
    System.out.println("Demo");
    demo.setI(in);
    demo.setS(s);
    return demo;
  }

  public static class Demo {
    private String s;
    private Integer i;

    public String getS() {
      return s;
    }

    public void setS(String s) {
      this.s = s;
    }

    public Integer getI() {
      return i;
    }

    public void setI(Integer i) {
      this.i = i;
    }

    @Override
    public String toString() {
      return "Demo{" + "s='" + s + '\'' + ", i=" + i + '}';
    }
  }
}
