import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author bean
 * @date 2020/7/7
 */
public class testSubList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.subList(4,8).clear();
        System.out.println(list);

    }

}
