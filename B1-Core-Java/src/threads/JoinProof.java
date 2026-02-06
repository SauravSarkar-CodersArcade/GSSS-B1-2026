package threads;
public class JoinProof {
    static class Task extends Thread {
        public void run(){
            try{
                Thread.sleep(2000);
            }catch (Exception e){}
            System.out.println("Task Finished!");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Task t = new Task();
        t.start();
        t.join(); // Code will wait (guaranteed) then go to main
        System.out.println("Main Thread resumes.");
    }
}
