# Load Balancing Algorithms (Round Robin, Consistent Hashing, Least Connections)

Implement round-robin selection, least active connections, and basic key hashing. This introduces algorithm mechanics; the following topic demonstrates a consistent-hash ring in more detail.

## Run the example and tests
From this directory run `../../gradlew :load-balancing:runExample` and `../../gradlew :load-balancing:test`. The example is dependency-free Java 21 and makes no external service calls.

## Trade-offs
Round robin is simple but ignores unequal work; least-connections adapts to activity but connection counts may not represent request cost; hashing offers affinity but simple modulo can remap many keys when hosts change.

## Primary references checked

- [Envoy load balancing architecture](https://www.envoyproxy.io/docs/envoy/latest/intro/arch_overview/upstream/load_balancing/load_balancing) — Describes weighted round robin and related balancing policies.
