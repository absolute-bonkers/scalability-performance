# Async Processing & Task Queues

A bounded in-memory queue separates submission from worker execution and rejects work when full. This demonstrates backpressure, not durability or distributed delivery guarantees.

## Run the example and tests
From this directory run `../../gradlew :async-processing:runExample` and `../../gradlew :async-processing:test`. The example is dependency-free Java 21 and makes no external service calls.

## Trade-offs
Queues smooth bursts but add eventual completion, duplicate/retry, ordering, dead-letter, and observability concerns. Bounded queues trade immediate rejection for protection from unbounded memory use.

## Primary references checked

- [RabbitMQ Work Queues tutorial](https://www.rabbitmq.com/tutorials/tutorial-two-java) — Explains queuing time-consuming work and worker distribution; the local example models only the queueing idea.
