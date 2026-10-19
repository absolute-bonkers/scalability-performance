package example;

public final class Example {
    public record Estimate(double averageRps,double peakRps,int instances){}
        public static Estimate estimate(long users,double actionsPerDay,double peak,double perInstance,double headroom){double avg=users*actionsPerDay/86400.0;double p=avg*peak;return new Estimate(avg,p,(int)Math.ceil(p/(perInstance*headroom)));}
        public static void main(String[] args){System.out.println(estimate(100000,20,3,100,.7));}
}
