package example;

public final class Example {
    public static final class Ring {private final java.util.NavigableMap<Integer,String> tokens=new java.util.TreeMap<>(); public Ring(java.util.List<String> hosts){hosts.forEach(h->tokens.put(h.hashCode(),h));}
            public String owner(String key){if(tokens.isEmpty())throw new IllegalStateException("empty ring");var e=tokens.ceilingEntry(key.hashCode());return (e==null?tokens.firstEntry():e).getValue();}}
        public static void main(String[] args){System.out.println(new Ring(java.util.List.of("node-a","node-b")).owner("customer-7"));}
}
