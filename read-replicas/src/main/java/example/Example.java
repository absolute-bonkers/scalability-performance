package example;

public final class Example {
    public record Route(String node,boolean mayBeStale){}
        public static Route write(){return new Route("primary",false);} public static Route read(boolean staleOk,boolean caughtUp){return staleOk&&caughtUp?new Route("replica",true):new Route("primary",false);}
        public static void main(String[] args){System.out.println("write="+write()+" read="+read(true,true));}
}
