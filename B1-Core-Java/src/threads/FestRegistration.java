package threads;
public class FestRegistration {
    static class FormFilling extends Thread {
        public void run(){
            System.out.println("Form Filling started!");
        }
    }
    static class DocumentUpload extends Thread {
        public void run(){
            System.out.println("Document upload started!");
        }
    }
    static class EmailNotification extends Thread {
        public void run(){
            System.out.println("Confirmation email sent!");
        }
    }
    public static void main(String[] args) {
        FormFilling t1 = new FormFilling();
        DocumentUpload t2 = new DocumentUpload();
        EmailNotification t3 = new EmailNotification();
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
Points to remember:
⭐ Java program starts with one main thread
⭐ Threads allow parallel execution of tasks
⭐ Output order is not guaranteed
⭐ Improves performance & responsiveness
ℹ When start() is called, the JVM creates independent path for each thread
ℹ When run() is called directly, it won't lead to multitasking

 Process Vs Thread
 ⭐ Process: A running program
 ⭐ Thread: A path of execution inside that process
 ⭐ A process has its own memory
 ⭐ Threads share the same memory
 ⭐ Creating a Thread is cheaper than creating a Process
 ℹ Examples: Process -> Chrome, Threads : Chrome Tabs
 🟢 Closing a tab doesn't kill Chrome Browser.
 */

