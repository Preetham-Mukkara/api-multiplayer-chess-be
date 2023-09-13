import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.kotlin.kapt")
    id("org.jetbrains.kotlin.plugin.allopen")
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    constraints {
        // Define dependency versions as constraints
        implementation("org.apache.commons:commons-text:1.10.0")
    }
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.9.10")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.9.10")
    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility  = JavaVersion.VERSION_17
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}

tasks.withType<JavaExec> {
    jvmArgs("-noverify","-XX:TieredStopAtLevel=1")
    environment = this.environment + System.getenv() as Map<String,Any>
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
        javaParameters = true
        allWarningsAsErrors = true
        suppressWarnings = false
        verbose = false
    }
}

allOpen {
    annotation("io.microanut.aop.Around")
}
