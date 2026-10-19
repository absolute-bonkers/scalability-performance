# Back-of-the-Envelope Calculations

Compute daily request volume, storage footprint, and serial latency from explicit quantities. These estimates help expose orders-of-magnitude problems before detailed benchmarking.

## Run the example and tests
From this directory run `../../gradlew :napkin-math:runExample` and `../../gradlew :napkin-math:test`. The example is dependency-free Java 21 and makes no external service calls.

## Trade-offs
Uncertainty compounds; use ranges and validate with load tests. Means hide tails, and serialized latency differs from parallel work and measured end-to-end behavior.

## Primary references checked

- [Jeff Dean — Designs, Lessons and Advice](https://research.google/pubs/designs-lessons-and-advice-from-building-large-distributed-systems/) — Provides illustrative latency orders of magnitude for rough estimates.
- [Google SRE — Service Best Practices](https://sre.google/sre-book/service-best-practices/) — Discusses capacity estimates and the need to validate assumptions.
