package example;

public final class Example {
    public record Shape(int instances,int capacityEach){public Shape{if(instances<1||capacityEach<1)throw new IllegalArgumentException("capacity must be positive");}public int total(){return Math.multiplyExact(instances,capacityEach);}}
        public static Shape horizontal(int n,int c){return new Shape(n,c);} public static Shape vertical(int c){return new Shape(1,c);}
        public static void main(String[] args){System.out.println("horizontal="+horizontal(4,10).total()+" vertical="+vertical(40).total());}
}
