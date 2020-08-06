import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author bean
 * @date 2020/7/7
 */
public class TestThread {
        static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {

        for(int i = 0; i<10000; i++){
            list.add(i);
        }
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    if (list.size() > 0) {
                        int content = list.get(list.size() - 1);
                    }else {
                        break;
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    if(list.size() <= 0){
                        break;
                    }
                    list.remove(0);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

    }
}
