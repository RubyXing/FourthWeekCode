import com.Complans;
import com.Workers;

import java.util.*;


public class Launcher4 {
    public static void main(String[] args) {
        List<Workers> lilist = new ArrayList<>();
        lilist.add(new Workers("zhangsan", "18", 3000));
        lilist.add(new Workers("li4", "25", 3500));
        lilist.add(new Workers("wang5", "22", 3200));
        lilist.add(new Workers("li4", "25", 35));

        lilist.add(1, new Workers("zhao6", "24", 3300));
//        lilist.remove(new Workers("wang5","22",3200));
        lilist.removeIf(workers -> "wang5".equals(workers.getWname()));
        lilist.forEach(System.out::println);


//        Set<Complans> set =new HashSet<>();
//        set.add(new Complans("张三",213));
//        set.add(new Complans("李四",123));
//        set.add(new Complans("王五",678));
//        set.add(new Complans("abc",213));
//        set.add(new Complans("abc",213));
//        System.out.println(set.size());
    }
}
