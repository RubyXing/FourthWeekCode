package com;/*
 * @author Xingqilin
 *
 */

import java.util.Objects;

public class Complans {
    String cname;
    int cnumber;

    public Complans(String cname, int cnumber) {
        this.cname = cname;
        this.cnumber = cnumber;
    }

    public Complans() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Complans)) return false;
        Complans complans = (Complans) o;
        return cnumber == complans.cnumber &&
                Objects.equals(cname, complans.cname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cname, cnumber);
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCnumber() {
        return cnumber;
    }

    public void setCnumber(int cnumber) {
        this.cnumber = cnumber;
    }
}
