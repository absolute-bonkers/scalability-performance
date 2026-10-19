# Latency Numbers Every Programmer Should Know

Use approximate orders of magnitude for cache, SSD, and same-datacenter round-trip operations, and sum a serial request path. Values are illustrative, not promises.

## Run the example and tests
From this directory run `../../gradlew :latency:runExample` and `../../gradlew :latency:test`. The example is dependency-free Java 21 and makes no external service calls.

## Trade-offs
Latency depends on hardware, topology, queueing, and tail percentiles. Measure real paths, make budgets explicit, and distinguish p50 from p99.

## Primary references checked

- [Google SRE — Monitoring Distributed Systems](https://sre.google/sre-book/monitoring-distributed-systems/) — Explains latency distributions and percentiles.

The constants in the example are deliberately rough teaching values, not measurements asserted by the cited SRE chapter. Hardware, geography, queueing, and workload materially change observed latency.
