plugins {
    id("multiplayer.chess.be.kotlin-application-conventions")
    application
}


dependencies {
    implementation("org.apache.commons:commons-text")
    kapt(platform("io.micronaut:micronaut-bom:3.10.1"))
    kapt("io.micronaut:micronaut-inject-java")
    kapt("io.micronaut:micronaut-validation")
    implementation(platform("io.micronaut:micronaut-bom:3.10.1"))
    implementation("io.micronaut:micronaut-validation")
    implementation("io.micronaut:micronaut-inject")
    implementation("io.micronaut.kotlin:micronaut-kotlin-runtime")
    implementation(project(":datasource"))
}

application {
    // Define the main class for the application.
    mainClass.set("multiplayer.chess.be.api.command.MainKt")
}
