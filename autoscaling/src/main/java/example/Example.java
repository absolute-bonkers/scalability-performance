package example;

public final class Example {
    public static int decide(int replicas, double utilization, double target, boolean cooldown, int min, int max) {
        if (min < 1 || max < min || target <= 0 || !Double.isFinite(utilization) || utilization < 0
                || !Double.isFinite(target) || replicas < 0) {
            throw new IllegalArgumentException("invalid scaling input");
        }
        int boundedReplicas = Math.clamp(replicas, min, max);
        if (cooldown) return boundedReplicas;
        if (utilization > target) return Math.min(max, boundedReplicas + 1);
        if (utilization < target * .5) return Math.max(min, boundedReplicas - 1);
        return boundedReplicas;
    }

    public static void main(String[] args) {
        System.out.println(decide(3, .85, .70, false, 1, 8));
    }
}
