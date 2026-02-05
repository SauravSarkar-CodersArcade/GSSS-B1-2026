package exceptions;
import java.io.IOException;
// ⭐ For checked exceptions we always use try-catch or throws
// ⭐ the 'throws' keyword doesn't handle exception
// ⭐ It only passes on the information for the calling method
// ⭐ The calling method has to handle the exception
// ⭐ The 'throws' keyword is used in the method signature
public class CheckedException {
    static void readFile() throws IOException {
        throw new IOException("File not found!");
    }
    public static void main(String[] args) {
        try {
            display();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    static void display() throws IOException{
        readFile();
    }
    static void show() throws IOException{
        display();
    }
}
