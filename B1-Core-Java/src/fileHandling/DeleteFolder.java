package fileHandling;
import java.io.File;
public class DeleteFolder {
    public static void main(String[] args) {
        // Path of the current folder-project-directory
        String path = System.getProperty("user.dir");
        System.out.println(System.getProperty("os.arch"));
        System.out.println(path);
        // ⭐ . -> current directory
        // ⭐ If we want to enter: ./
        // D:/GSSSIETW/B1-Core-Java + /Demo
        File folder =
                new File(path + "/Demo");
        if (folder.delete()){
            System.out.println("Folder " + folder.getName() + " deleted");
        }else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
