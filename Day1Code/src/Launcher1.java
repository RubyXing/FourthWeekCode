import java.io.*;

public class Launcher1 {
    public static void main(String[] args) {
        Writer w = null;
        BufferedWriter bf = null;
        try {
            w = new FileWriter(new File("d:\\ccc\\testmy.txt"), true);
            bf = new BufferedWriter(w);
            String str = "abc test";
            bf.write(str);
            bf.newLine();
            bf.write(str);
            bf.write(str);
            bf.write(str);
            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bf != null) {
                    bf.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (w != null) {
                try {
                    w.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
