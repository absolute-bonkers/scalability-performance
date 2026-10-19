package example;

public final class Example {
    public static final long L1_NS=1, SSD_READ_NS=100_000, DATACENTER_RTT_NS=500_000;
        public static long budget(long... serialNs){return java.util.Arrays.stream(serialNs).sum();}
        public static void main(String[] args){System.out.println("approx serial ns="+budget(SSD_READ_NS,DATACENTER_RTT_NS));}
}
