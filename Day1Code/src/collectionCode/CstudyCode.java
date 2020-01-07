package collectionCode;/*
 * @author Xingqilin
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//某中学有若干学生(学生对象放在一个List中)，
//每个学生有一个姓名属性(String)、班级名称属性(String)和考试成绩属性(double)
//某次考试结束后，每个学生都获得了一个考试成绩。
//遍历list集合，并把学生对象的属性打印出来（2种方式 for-each循环）
//使用ArrayList存储若干学生的姓名（5个），编写一个方法，找出集合中姓名长度大于5的，将其放在集合中返回，并且输出

public class CstudyCode {
    public void start() {
//        collections1();
        collections2();
    }

    private void collections1() {
        List<Students> stus = new ArrayList<>();
        stus.add(new Students("aaa", "first", 10));
        stus.add(new Students("bbbbbb", "second", 20));
        stus.add(new Students("cccccc", "first", 30));
        stus.add(new Students("ddd", "second", 40));
        stus.add(new Students("eeeeee", "third", 50));

        stus.forEach(students -> System.out.println(students.toString()));
        System.out.println(stus);
        for (Students students : stus) {
            System.out.println(students.toString());
        }
        stus.removeIf(students -> students.getSname().length() < 5);
        System.out.println(stus);

    }

    //现在有一组学生分数按照从小到大的顺序进行添加，23，35,89,90，100，添加到ArrayList数组中，
// 但是在录入成绩的时候发现少录入一个最低分 2分，和一个最高分150分，进行补录，然后遍历输出
    private void collections2() {
        List<Integer> grades = new ArrayList<>();
        grades.add(23);
        grades.add(35);
        grades.add(89);
        grades.add(90);
        grades.add(100);

        grades.add(2);
        grades.add(150);
        Collections.sort(grades);
        grades.forEach(gradet -> System.out.println(gradet.toString()));
    }
}
