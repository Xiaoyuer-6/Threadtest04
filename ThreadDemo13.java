package threadsleep;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-18
 * Time: 16:48
 */
public class ThreadDemo13 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
        },"张三");
        System.out.println("t1的状态："+t1.getState());//状态
        t1.start();
        System.out.println(""+t1.getId());//id
        System.out.println(""+t1.getName());//名字
        System.out.println(""+t1.getPriority());//优先级
        System.out.println(""+t1.isAlive());//存活
        System.out.println(""+t1.isDaemon());//
        System.out.println(""+t1.isInterrupted());//是否休眠

    }
}
