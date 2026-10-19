package example;

public final class Example {
    public static final class Ring {private final java.util.NavigableMap<Integer,String> tokens=new java.util.TreeMap<>(); public Ring(java.util.List<String> hosts){for(String host:hosts){if(host==null)throw new IllegalArgumentException("host cannot be null");if(tokens.putIfAbsent(host.hashCode(),host)!=null)throw new IllegalArgumentException("host hash collision: "+host);}}
            public String owner(String key){if(key==null)throw new IllegalArgumentException("key cannot be null");if(tokens.isEmpty())throw new IllegalStateException("empty ring");var e=tokens.ceilingEntry(key.hashCode());return (e==null?tokens.firstEntry():e).getValue();}}
        public static void main(String[] args){System.out.println(new Ring(java.util.List.of("node-a","node-b")).owner("customer-7"));}
}
