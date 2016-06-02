# SLF4K

This library is a thin Kotlin wrapper around the SLF4 API to lazily evaluate messages and arguments passed to the logger methods.

The following snippet will call `expensiveOperation()` regardless of the log priority level:

```kotlin
LOGGER.debug("A message with an ", expensiveOperation())
```

The library aims to offer the following:

```kotlin
LOGGER.debug("A message with an ") { expensiveOperation() }
```

With this, `expensiveOperation()` will get called _only_ if the log priority is set to `DEBUG` or lower.