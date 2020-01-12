import com.Mycltest;
import com.Strudents;

import java.text.SimpleDateFormat;
import java.util.*;

public class Launcher5 extends Thread {
    public static void main(String[] args) {
//        new Mycltest().start();
//        Set<Integer> set =new HashSet<>();
//        set.add(1);
//        set.add(3);
//        set.add(2);
//        set.add(4);

        ArrayList<Strudents> arl = new ArrayList<>();
        arl.add(new Strudents("aaa", 89));
        arl.add(new Strudents("bbb", 100));
        arl.add(new Strudents("ccc", 60));
        arl.add(new Strudents("ddd", 54));
        arl.add(new Strudents("eee", 89));
        Collections.sort(arl);

        System.out.println(Arrays.toString(arl.toArray()));
    }

}


