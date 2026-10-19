# Consistent Hashing

Store host tokens in a sorted ring. A key is assigned to its clockwise successor, wrapping at the end. Production designs usually add virtual nodes and careful hashing.

## Run the example and tests
From this directory run `../../gradlew :consistent-hashing:runExample` and `../../gradlew :consistent-hashing:test`. The example is dependency-free Java 21 and makes no external service calls.

## Trade-offs
A ring can limit key movement after membership changes compared with modulo hashing; distribution depends on token count, hash quality, node weights, and hot keys.

## Primary references checked

- [Envoy Ring Hash](https://www.envoyproxy.io/docs/envoy/latest/intro/arch_overview/upstream/load_balancing/load_balancers#ring-hash) — Explains ring hash policy and ring-size trade-offs.
