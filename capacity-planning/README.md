# Capacity Planning & Estimation

Convert daily users/actions into average and peak request rate, then estimate instances from tested per-instance capacity and headroom. Assumptions are explicit.

## Run the example and tests
From this directory run `../../gradlew :capacity-planning:runExample` and `../../gradlew :capacity-planning:test`. The example is dependency-free Java 21 and makes no external service calls.

## Trade-offs
Daily averages hide spikes, query cost varies, and throughput changes with code/dependencies. Benchmark representative demand and plan redundancy; update estimates as usage evolves.

## Primary references checked

- [Google SRE — Service Best Practices](https://sre.google/sre-book/service-best-practices/) — Covers capacity planning, headroom, and load testing.
