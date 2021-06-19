package threadsleep;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-18
 * Time: 09:01
 * 使用两个线程打印AABBCCDD
 */
public class ThreadDemo11 {
    public static void main(String[] args) throws InterruptedException {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String data= "ABCD";
//                for (char item:data.toCharArray()){
//                    try {
//                        Thread.sleep(1);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.print(item);
//                }
//            }
//        };
//        Thread t1 = new Thread(runnable);
//        Thread t2 = new Thread(runnable);
//        t1.start();
//        t2.start();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                String data= "ABCD";
                for (char item:data.toCharArray()){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print(item);
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                String data= "ABCD";
                for (char item:data.toCharArray()){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.print(item);
                }
            }
        });
        t2.start();
    }
}
