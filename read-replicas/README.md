# Database Read Replicas

Route writes to the primary. Choose a read replica only when the caller accepts replica lag and the replica is caught up; otherwise read from the primary.

## Run the example and tests
From this directory run `../../gradlew :read-replicas:runExample` and `../../gradlew :read-replicas:test`. The example is dependency-free Java 21 and makes no external service calls.

## Trade-offs
Replicas can increase read throughput but asynchronous replication may return stale data. Read-after-write needs explicit consistency decisions, and replication adds operational cost.

## Primary references checked

- [Amazon RDS read replicas](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReadRepl.html) — Documents read-only replicas, read scaling, and asynchronous replication lag.
