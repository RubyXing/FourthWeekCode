import serializabletest.Employee;

import java.io.*;

public class Launcher1 {
    public static void main(String[] args) {
        Employee employee = new Employee("abc", "e1234", "eabcde");
        File fl = new File("d:\\ccc\\abc.ser");
        OutputStream flin = null;
        ObjectOutput oin = null;
        try {
            flin = new FileOutputStream(fl);
            oin = new ObjectOutputStream(flin);
            oin.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oin != null) {
                try {
                    oin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (flin != null) {
                try {
                    flin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
