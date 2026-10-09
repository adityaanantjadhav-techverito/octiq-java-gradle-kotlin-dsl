# octiq-java-gradle-kotlin-dsl

> Synthetic fixture for testing Octiq's GitHub import of Java projects. Not a real application.

## Scenario

A Gradle project using the Kotlin DSL (`build.gradle.kts`) with the Kotlin JVM plugin and `jvmToolchain(17)`. Sources are Kotlin only; there are no `.java` files.

## What this exercises

- Kotlin-DSL build-file parsing
- `jvmToolchain(17)` version detection
- The `kotlinSourcesOnly` flag, which warns that a green build says little here (Gradle `testClasses` compiles Kotlin via the Kotlin plugin)

## Expected result on import

| Field | Expected |
| --- | --- |
| stack | `java` |
| build tool | `gradle` |
| Java version | `17` |
| image | `gradle:8-jdk17` |
| framework | `java` |
| modules | `[]` |
| final phase | `ready` |
| build green | `true` |
| kotlinSourcesOnly | `true` |

`kotlinSourcesOnly` is `true` when the project has at least one `.kt` source file and no `.java` file anywhere (build output directories excluded). Resolving the Kotlin plugin and stdlib needs network access to Maven Central / the plugin portal.

## Layout

```
build.gradle.kts
settings.gradle.kts
src/main/kotlin/com/octiq/fixture/Inventory.kt
```
