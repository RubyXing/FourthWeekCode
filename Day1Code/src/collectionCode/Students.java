package collectionCode;/*
 * @author Xingqilin
 *
 */

public class Students {
    private String sname;
    private String sclass;
    private double score;

    public Students(String sname, String sclass, double score) {
        this.sname = sname;
        this.score = score;
        this.sclass = sclass;
    }

    public Students() {
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    @Override
    public String toString() {
        return "Students{" +
                "sname='" + sname + '\'' +
                ", sclass='" + sclass + '\'' +
                ", score=" + score +
                '}';
    }
}
