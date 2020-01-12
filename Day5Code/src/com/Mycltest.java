package com;/*
 * @author Xingqilin
 *
 */


import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mycltest {
    public void start() {
        countMoney();
    }

    private void hashtest() {
        HashMap<Integer, String> hs = new HashMap<>();
        hs.put(1, "aaa");
        hs.put(2, "bbb");
        hs.put(3, "ccc");
        hs.put(4, "ddd");
        hs.put(5, "eee");
        hs.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });
    }

    //    地铁站编号和站名对应关系如下：
//1=天府广场
//2=省体育馆
//3=倪家桥
//4=火车南站
//5=孵化园
//6=世纪城
//7=天府三街
//8=天府五街
//计算从天府三街到天府广场的站数
    private void countStation() {
        HashMap<Integer, String> hs = new HashMap<>();
        hs.put(1, "天府广场");
        hs.put(2, "省体育馆");
        hs.put(3, "倪家桥");
        hs.put(4, "火车南站");
        hs.put(5, "孵化园");
        hs.put(6, "世纪城");
        hs.put(7, "天府三街");
        hs.put(8, "天府五街");
        int i = 0;
        boolean flag = false;
        for (Map.Entry<Integer, String> entry : hs.entrySet()) {
            if ("天府广场".equals(entry.getValue())) {
                flag = true;
            }
            if ("天府三街".equals(entry.getValue())) {
                flag = false;
                System.out.println("距离天府广场" + i + "站");
            }
            if (flag) {
                i++;
            }
        }
    }

    //    停车场系统：（使用hashMap）
//每次有车辆进入记录车牌，并记录入场时间(系统时间),并在手动输入出场时间，，计算相应停车时间
//10s一下免费，10s-30s收费10块，超出30s多1s多一块 
//测试：
//现在停车场中已有3个车辆已入场，入场时间为初始化集合的时间，川A2n912  川A3v831,川Ax9982
//现在川A3v831过20s后手动出场，计算费用和时间
//然后川A3A2AS入场停放,经过40s后出厂，计算费用及时间
    private void countMoney() {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Date> hs = new HashMap<>();
        hs.put("aaa", new Date());
        hs.put("bbb", new Date());
        hs.put("ccc", new Date());
        hs.put("ddd", new Date());

//        String cID=sc.nextLine();
//        Date ind=new Date();
//        hs.put(cID,ind);

        long moneyt = 0;
        System.out.println("出厂车辆:");
        String str = sc.nextLine();
        for (Map.Entry<String, Date> entry : hs.entrySet()) {
            if (entry.getKey().equals(str)) {
                Date out = new Date();
                moneyt = (out.getTime() - entry.getValue().getTime()) / 1000;
            }
        }

        if (moneyt < 10) {
            System.out.println("free");
        } else if (moneyt < 30) {
            System.out.println("10$");
        } else {
            System.out.println("money:" + (moneyt - 20));
        }


    }
}
