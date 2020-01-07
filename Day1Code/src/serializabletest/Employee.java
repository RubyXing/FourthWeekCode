package serializabletest;/*
 * @author Xingqilin
 *
 */


public class Employee implements java.io.Serializable {


    private static final long serialVersionUID = -7790488254503454205L;
    private String ename;
    private String ecoed;
    private String eID;

    public Employee(String ename, String ecoed, String eID) {
        this.ename = ename;
        this.ecoed = ecoed;
        this.eID = eID;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", ecoed='" + ecoed + '\'' +
                ", eID='" + eID + '\'' +
                '}';
    }

}
