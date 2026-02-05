package threads;
public class ResultDeclaration {
    synchronized void declareResult() throws Exception {
        System.out.println("Waiting for approval...");
        wait();
        System.out.println("Result declared.");
    }
    synchronized void approve(){
        notify();
    }
    public static void main(String[] args) throws Exception {
        ResultDeclaration rd = new ResultDeclaration();
        new Thread(() -> {
          try{
              rd.declareResult();
          }catch (Exception e){}
        }).start();

        Thread.sleep(2000);
        new Thread(() ->
                rd.approve()).start();
    }
}
/*
⭐ The declareResult() method waits until another thread calls notify()
⭐ During wait(), the thread releases the lock, allowing other threads
   to enter the synchronized code.
🟢ℹ️ Important Points:
⭐ sleep() -> time based
⭐ wait() -> condition based
⭐ wait() -> releases lock
⭐ wait() -> Used in inter-thread communication
 */
