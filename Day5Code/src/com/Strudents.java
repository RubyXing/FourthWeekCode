package com;/*
 * @author Xingqilin
 *
 */

public class Strudents implements Comparable<Strudents> {
    private String sname;
    private int sscort;

    @Override
    public int compareTo(Strudents o) {
        if (this.sscort > o.sscort) {
            return 1;
        } else if (this.sscort == o.sscort) {
            return 0;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Strudents{" +
                "sname='" + sname + '\'' +
                ", sscort=" + sscort +
                '}';
    }

    public Strudents(String sname, int sscort) {
        this.sname = sname;
        this.sscort = sscort;
    }
}
