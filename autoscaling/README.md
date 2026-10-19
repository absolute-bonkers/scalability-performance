# Auto-Scaling

A small controller adjusts replica count from utilization while honoring min/max bounds and a cooldown. Real autoscalers reconcile sampled metrics and include stabilization and quota constraints.

## Run the example and tests
From this directory run `../../gradlew :autoscaling:runExample` and `../../gradlew :autoscaling:test`. The example is dependency-free Java 21 and makes no external service calls.

## Trade-offs
Scaling out too slowly overloads systems; scaling in too quickly causes oscillation or loss of headroom. Cooldowns improve stability but delay reaction.

## Primary references checked

- [Kubernetes Horizontal Pod Autoscaler](https://kubernetes.io/docs/concepts/workloads/autoscaling/horizontal-pod-autoscale/) — Explains metric-driven reconciliation and horizontal versus vertical scaling.
