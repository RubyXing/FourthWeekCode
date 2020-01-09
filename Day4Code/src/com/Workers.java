package com;/*
 * @author Xingqilin
 *
 */

import java.util.Objects;

//姓名       年龄     工资
public class Workers {
    String wname;
    String wage;
    Integer wpay;

    public Workers(String wname, String wage, Integer wpay) {
        this.wname = wname;
        this.wage = wage;
        this.wpay = wpay;
    }

    public Workers() {
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public Integer getWpay() {
        return wpay;
    }

    public void setWpay(Integer wpay) {
        this.wpay = wpay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Workers)) return false;
        Workers workers = (Workers) o;
        return Objects.equals(wname, workers.wname) &&
                Objects.equals(wage, workers.wage) &&
                Objects.equals(wpay, workers.wpay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wname, wage, wpay);
    }

    @Override
    public String toString() {
        return "Workers{" +
                "wname='" + wname + '\'' +
                ", wage='" + wage + '\'' +
                ", wpay=" + wpay +
                '}';
    }
}
