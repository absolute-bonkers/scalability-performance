package example;

public final class Example {
    private final java.util.concurrent.BlockingQueue<String> tasks; public Example(int capacity){tasks=new java.util.concurrent.ArrayBlockingQueue<>(capacity);}
        public boolean submit(String task){return tasks.offer(task);} public String workOne(){return tasks.poll();} public int queued(){return tasks.size();}
        public static void main(String[] args){var q=new Example(2);q.submit("resize-image");System.out.println(q.workOne());}
}
