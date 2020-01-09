package com;/*
 * @author Xingqilin
 *
 */

import java.util.Objects;

public class Students {
    private String sname;
    private int snumber;

    public Students(String sname, int snumber) {
        this.sname = sname;
        this.snumber = snumber;
    }

    @Override
    public String toString() {
        return "Students{" +
                "sname='" + sname + '\'' +
                ", snumber=" + snumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students)) return false;
        Students students = (Students) o;
        return snumber == students.snumber &&
                Objects.equals(sname, students.sname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sname, snumber);
    }

    public Students() {
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSnumber() {
        return snumber;
    }

    public void setSnumber(int snumber) {
        this.snumber = snumber;
    }
}
