package com;/*
 * @author Xingqilin
 *
 */


import java.util.*;

public class HomeWork4 {
    public void start() {
        worker2();
    }

    //从键盘获取一行输入字符串，要求去除重复字符
    private void worker1() {
        Set<Character> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        char[] ab = sc.nextLine().toCharArray();
        for (char c : ab) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        set.forEach(sb::append);
        System.out.println(sb);
    }

    //    生成10个1到20之间的不重复的随机数
    private void worker2() {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 10) {
            set.add((int) (Math.random() * 20));
        }
        System.out.println(set.toString());

    }

    //    3:把如下元素存入List集合“aaa” “bbb” “aaa” “abc”“xyz” “123” “xyz”去掉重复元素
    private void worker3() {
        List<String> li = new LinkedList<>();
        li.add("aaa");
        li.add("bbb");
        li.add("aaa");
        li.add("abc");
        li.add("xyz");
        li.add("123");
        li.add("xyz");


    }

    //已知有十六支男子足球队参加2008 北京奥运会。把这16 支球队随机分为4 个组。采用List集合和随机数2008 北京奥运会男足参赛国家：
//科特迪瓦，阿根廷，澳大利亚，塞尔维亚，荷兰，尼日利亚、日本，美国，中国，新西 兰，巴西，比利时，韩国，喀麦隆，洪都拉斯，意大利
    private void worker4() {

    }

    //5; 当前班上有同学进行报道，当学号与姓名相同时就被认为是同一个学生，统计当前班上同学姓名和人数。随意创建5个学生即可。
    private void worker5() {

    }

}
