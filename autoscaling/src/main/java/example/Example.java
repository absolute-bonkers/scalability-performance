package example;

public final class Example {
    public static int decide(int replicas,double utilization,double target,boolean cooldown,int min,int max){if(cooldown)return replicas;if(utilization>target&&replicas<max)return replicas+1;if(utilization<target*.5&&replicas>min)return replicas-1;return replicas;}
        public static void main(String[] args){System.out.println(decide(3,.85,.70,false,1,8));}
}
