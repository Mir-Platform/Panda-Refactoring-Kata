plugins {
    java
}

group = "ru.starMir.pandaRefactoringKata"
version = "1.0"

repositories {
    mavenCentral()
}

val junitVersion = "5.8.2"

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.withType<Test> {
    useJUnitPlatform()
}