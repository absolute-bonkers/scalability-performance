# Connection Pooling

Model a bounded number of concurrent connection leases. Pooling avoids repeated setup and constrains downstream concurrency; Module 9 also discusses connection reuse and keep-alive.

## Run the example and tests
From this directory run `../../gradlew :connection-pooling:runExample` and `../../gradlew :connection-pooling:test`. The example is dependency-free Java 21 and makes no external service calls.

## Trade-offs
Too few connections queue callers; too many can overwhelm the service. Set acquisition timeouts, bound waiters, and release resources reliably.

## Primary references checked

- [Java 21 HttpClient API](https://docs.oracle.com/en/java/javase/21/docs/api/java.net.http/java/net/http/HttpClient.html) — Documents client state sharing and typical connection pool reuse.
