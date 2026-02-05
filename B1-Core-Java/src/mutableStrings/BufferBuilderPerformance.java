package mutableStrings;
public class BufferBuilderPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("GSSS");
        for (int i=1; i<1000000; i++){
            buffer.append(" B1");
        }
        System.out.println("Buffer Time: " +
                (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("GSSS");
        for (int i=1; i<1000000; i++){
            builder.append(" B1");
        }
        System.out.println("Builder Time: " +
                (System.currentTimeMillis() - startTime) + "ms");
    }
}
/*
Builder                              Buffer
❌ Not Thread Safe               ✅ Thread Safe
❌ Not Synchronized              ✅ Synchronized
😀 Faster                        😔 Slower
ℹ Single Threaded Apps          ℹ Multi-threaded apps
ℹ Java 1.5                      ℹ Java 1.0 ️ ️ ️
 */
