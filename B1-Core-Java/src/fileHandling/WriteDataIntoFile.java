package fileHandling;
import java.io.FileWriter;
public class WriteDataIntoFile {
    public static void main(String[] args) throws Exception{
        // ⭐ By default append flag is `false` (Overwrites)
        // ⭐ To add data we use append flag as `true` (Gets added)
        FileWriter writer =
                new FileWriter("./GSSS/b1.txt", true);
        writer.append("\nThis the Advanced Phase of training.");
        System.out.println("Successfully wrote data into the file.");
        writer.close();
    }
}
