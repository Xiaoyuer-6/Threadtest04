package threadsleep;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-18
 * Time: 08:40
 * 线程休眠
 */
public class ThreadDemo10 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始时间"+new Date());
        //方式1：休眠1秒
        //Thread.sleep(1000);
        //休眠的实现方式2：
        //TimeUnit.SECONDS.sleep(1);
        //休眠的实现方式3:
        Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        System.out.println("结束时间"+new Date());
    }
}
