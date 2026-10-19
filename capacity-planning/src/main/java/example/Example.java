package example;

public final class Example {
    public record Estimate(double averageRps,double peakRps,int instances){}
        public static Estimate estimate(long users,double actionsPerDay,double peak,double perInstance,double headroom){if(users<0||!Double.isFinite(actionsPerDay)||actionsPerDay<0||!Double.isFinite(peak)||peak<0||!Double.isFinite(perInstance)||perInstance<=0||!Double.isFinite(headroom)||headroom<=0)throw new IllegalArgumentException("demand must be non-negative and capacity/headroom positive");double avg=users*actionsPerDay/86400.0;double p=avg*peak;double needed=Math.ceil(p/(perInstance*headroom));if(!Double.isFinite(needed)||needed>Integer.MAX_VALUE)throw new IllegalArgumentException("estimated instance count is too large");return new Estimate(avg,p,(int)needed);}
        public static void main(String[] args){System.out.println(estimate(100000,20,3,100,.7));}
}
