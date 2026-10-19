package example;

public final class Example {
    public static double requestsPerDay(double rps){return rps*86400;} public static double gib(long rows,int bytesPerRow,int copies){return rows*(double)bytesPerRow*copies/(1024*1024*1024);}
        public static long serialMicros(long... steps){return java.util.Arrays.stream(steps).sum();}
        public static void main(String[] args){System.out.println("req/day="+requestsPerDay(1000)+" serial-us="+serialMicros(100,500,2000));}
}
