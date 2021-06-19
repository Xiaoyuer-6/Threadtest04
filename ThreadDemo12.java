package threadsleep;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-18
 * Time: 16:31
 */
public class ThreadDemo12 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("开始起跑："+Thread.currentThread().getName());
                int num  = 1+new Random().nextInt(5);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("到达终点："+Thread.currentThread().getName());
            }

        };
        //定义分组
        ThreadGroup threadGroup = new ThreadGroup("百米赛跑一组！");
        //创建运动员
        Thread t1  = new Thread(runnable,"赵意义");
        Thread t2  = new Thread(runnable,"胡一于");
        t1.start();
        t2.start();
        //宣布成绩
        threadGroup.list();
        while (threadGroup.activeCount()!=0){

        }
        System.out.println("宣布成绩");

    }
}
