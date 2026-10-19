package example;

public final class Example {
    public static final class Pool{private final int max;private int leased,created;public Pool(int max){if(max<1)throw new IllegalArgumentException();this.max=max;}
            public boolean acquire(){if(leased>=max)return false;if(created<max)created++;leased++;return true;}public void release(){if(leased==0)throw new IllegalStateException();leased--;}public int created(){return created;}}
        public static void main(String[] args){var p=new Pool(2);p.acquire();p.acquire();System.out.println("third="+p.acquire());}
}
