package fileHandling;
import java.io.File;
public class CreateFolder {
    public static void main(String[] args) {
        // ⭐ Absolute - Root directory
        // ⭐ Relative - Current directory
        // ⭐ mkdir() - Only the last directory
        // ⭐ mkdirs() - The last directory along with all the path directories
        File folder =
                new File("D:\\GSSSIETW\\B1-Core-Java\\GSSS\\B1\\Java\\SemVI\\Placements");
        if(folder.mkdirs()){
            System.out.println("Folder " + folder.getName() + " created.");
        }else {
            System.out.println("Failed to create the folder.");
        }
    }
}
