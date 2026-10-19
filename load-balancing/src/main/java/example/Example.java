package example;

public final class Example {
    private static int cursor; public static void reset(){cursor=0;}
        public static String roundRobin(java.util.List<String> hosts){return hosts.get(cursor++%hosts.size());}
        public static String leastConnections(java.util.Map<String,Integer> active){return active.entrySet().stream().min(java.util.Map.Entry.comparingByValue()).orElseThrow().getKey();}
        public static String hash(String key,java.util.List<String> hosts){return hosts.get(Math.floorMod(key.hashCode(),hosts.size()));}
        public static void main(String[] args){var h=java.util.List.of("a","b","c");reset();System.out.println(roundRobin(h));}
}
