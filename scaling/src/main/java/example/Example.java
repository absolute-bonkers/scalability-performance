package example;

public final class Example {
    public record Shape(int instances,int capacityEach){public int total(){return instances*capacityEach;}}
        public static Shape horizontal(int n,int c){return new Shape(n,c);} public static Shape vertical(int c){return new Shape(1,c);}
        public static void main(String[] args){System.out.println("horizontal="+horizontal(4,10).total()+" vertical="+vertical(40).total());}
}
