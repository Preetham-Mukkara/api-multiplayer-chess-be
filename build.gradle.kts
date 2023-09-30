plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.22"
    id("org.jetbrains.kotlin.plugin.allopen") version "1.8.22"
    id("com.google.devtools.ksp") version "1.8.22-1.0.11"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    id("io.micronaut.application") version "4.0.3"
    id("io.micronaut.aot") version "4.0.3"
}

version = "1"
group = "multiplayer.chess.be"

val kotlinVersion=project.properties.get("kotlinVersion")
val kotestVersion=project.properties.get("kotestVersion")
val mockkVersion=project.properties.get("mockkVersion")

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.microutils:kotlin-logging:3.0.5")
    ksp("io.micronaut.serde:micronaut-serde-processor")
    implementation("io.micronaut.kotlin:micronaut-kotlin-runtime")
    implementation("io.micronaut.serde:micronaut-serde-jackson")
    implementation("org.jetbrains.kotlin:kotlin-reflect:${kotlinVersion}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:${kotlinVersion}")
    testImplementation("io.micronaut.test:micronaut-test-kotest5:4.0.2")
    testImplementation("io.mockk:mockk:${mockkVersion}")
    testImplementation("io.kotest:kotest-runner-junit5-jvm:${kotestVersion}")
    runtimeOnly("ch.qos.logback:logback-classic")
    runtimeOnly("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("io.micronaut.data:micronaut-data-jdbc:3.10.0")
    runtimeOnly("org.yaml:snakeyaml")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1-native-mt")
    testImplementation("io.micronaut:micronaut-http-client")
    ksp("io.micronaut:micronaut-inject-java")
    implementation("io.micronaut:micronaut-inject")
    ksp(platform("io.micronaut:micronaut-bom:3.10.1"))
    implementation(platform("io.micronaut:micronaut-bom:3.10.1"))
    implementation("com.fasterxml.jackson.core:jackson-databind:2.12.6")
    ksp("io.micronaut:micronaut-validation")
    implementation("io.micronaut:micronaut-validation")
    ksp("io.micronaut.data:micronaut-data-processor:3.10.0")
    implementation("io.micronaut.sql:micronaut-jdbc-hikari")
    implementation("io.micronaut.sql:micronaut-jooq")
    implementation("io.micronaut.flyway:micronaut-flyway")
    implementation("javax.persistence:javax.persistence-api:2.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${kotlinVersion}")
    implementation("org.postgresql:postgresql:15.4.0")
    implementation("org.apache.logging.log4j:log4j-slf4j2-impl:2.0.7")
    implementation("org.apache.sling:org.apache.sling.extensions.slf4j.mdc:1.0.0")
    runtimeOnly("org.jetbrains.kotlinx:kotlinx-coroutines-slf4j:1.7.2")
    implementation("org.apache.logging.log4j:log4j-slf4j2-impl:2.0.7")
}


application {
    mainClass.set("multiplayer.chess.be.api.command.ApplicationKt")
}
java {
    sourceCompatibility = JavaVersion.toVersion("17")
}

tasks {
    compileKotlin {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
        }
    }
    compileTestKotlin {
        compilerOptions {
            jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
        }
    }
    val stage by registering {
        dependsOn(build, clean)
    }
    build {
        mustRunAfter(clean)
    }
}

graalvmNative.toolchainDetection.set(false)
micronaut {
    runtime("netty")
    testRuntime("kotest5")
    processing {
        incremental(true)
        annotations("multiplayer.chess.be.*")
    }
    aot {
    // Please review carefully the optimizations enabled below
    // Check https://micronaut-projects.github.io/micronaut-aot/latest/guide/ for more details
        optimizeServiceLoading.set(false)
        convertYamlToJava.set(false)
        precomputeOperations.set(true)
        cacheEnvironment.set(true)
        optimizeClassLoading.set(true)
        deduceEnvironment.set(true)
        optimizeNetty.set(true)
    }
}



