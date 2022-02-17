import java.util.concurrent.*;
import java.util.function.Supplier;

/**
 * ClassName: CompletableFutureTest Description: date: 2021/12/20 13:51
 *
 * @author liujian
 * @since JDK 1.8
 */
public class CompletableFutureTest {

  public static void main(String[] args)
      throws ExecutionException, InterruptedException, TimeoutException {
    ThreadPoolExecutor executor = ThreadPools.getInstance().executor();
    CompletableFutureTest completableFutureTest = new CompletableFutureTest();
    CompletableFuture<String> stringCompletableFuture =
        CompletableFuture.supplyAsync(
            (Supplier<String>) completableFutureTest::getString, executor);
    CompletableFuture<Integer> intCompletableFuture =
        CompletableFuture.supplyAsync((Supplier<Integer>) completableFutureTest::getInt, executor);
    Demo demo =
        CompletableFuture.allOf(stringCompletableFuture, intCompletableFuture)
            .handle(
                (v, exception) -> {
                  if (exception != null) {
                    return null;
                  }
                  return completableFutureTest.getDemo(
                      stringCompletableFuture, intCompletableFuture);
                })
            .get(10000, TimeUnit.MILLISECONDS);

    System.out.println(demo);
    System.out.println("iiii{}");
  }

  private String getString() {
    try {
      Thread.sleep(5000);
      return "这是string1";
    } catch (Exception e) {
      return "错误1";
    }
  }

  private Integer getInt() {
    try {
      Thread.sleep(1000);
      return 1;
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
