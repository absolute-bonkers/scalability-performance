# Horizontal vs Vertical Scaling

Compare adding instances with increasing capacity per instance. This model assumes linear throughput; real bottlenecks, coordination, and failure domains invalidate that simplification.

## Run the example and tests
From this directory run `../../gradlew :scaling:runExample` and `../../gradlew :scaling:test`. The example is dependency-free Java 21 and makes no external service calls.

## Trade-offs
Vertical scaling is simpler but bounded and may retain a single failure domain. Horizontal scaling can add capacity and redundancy but requires distribution, coordination, and balanced work.

## Primary references checked

- [Google SRE — Handling Overload](https://sre.google/sre-book/handling-overload/) — Explains capacity limits, load balancing, and overload behavior.
