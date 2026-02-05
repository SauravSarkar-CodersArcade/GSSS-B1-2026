package exceptions;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class E4 {
    public static void main(String[] args) throws Exception{
        String str;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter data or press any key:");
            str = br.readLine();
            System.out.println(str);
        }
    }
}
/*
⭐ Scanner is convenient to use and slower, BufferedReader is faster and suitable for
   large input.
⭐ Scanner can produce TLE - Time Limit Exceeded for larger inputs but BufferedReader won't.
⭐ Scanner should be used for simple values & easy & clean code.
⭐ BufferedReader should be used for online interviews where time limit is important like:
   CodeChef, LeetCode, etc.
⭐ BufferedReader is preferred more when we have larger inputs.
 */
