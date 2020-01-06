import java.io.*;

public class Launcher1 {
    public static void main(String[] args) {
        try {
            Writer w=new FileWriter(new File("d:\\ccc"));
            BufferedWriter bf=new BufferedWriter(w);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
