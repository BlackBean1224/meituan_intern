package exercise;

/**
 * @author bean
 * @date 2020/7/20
 */
public class ThreadOddEven {
    volatile static int i = 0;
    public static void main(String[] args) {
        new Thread() {
            @Override
            public synchronized void run() {
                while (i <= 100) {
                    if(i % 2 == 0) {
                        System.out.println(i);
                        i++;
                        notifyAll();
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public synchronized void run() {
                while (i <= 100) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(i % 2 == 1) {
                        System.out.println(i);
                        i++;
                        notifyAll();
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }.start();
    }
}
