import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
/**
 * ClassName: ThreadPools
 * Description:
 * date: 2021/12/20 13:52
 *
 * @author liujian
 * @since JDK 1.8
 */
public class ThreadPools {
    private ThreadPoolExecutor threadPoolExecutor;
    ThreadPools(){
        threadPoolExecutor = new ScheduledThreadPoolExecutor(3);
    }
    private static class ThreadPoolManagerHolder {
        private static ThreadPools instance = new ThreadPools();
    }
    public static ThreadPools getInstance() {
        return ThreadPoolManagerHolder.instance;
    }


    public ThreadPoolExecutor executor(){
        return  this.threadPoolExecutor;
    }
}
