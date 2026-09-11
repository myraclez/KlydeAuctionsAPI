plugins {
    id("java")
}

group = "net.klyde.klydeauctionsapi"
version = "1.0.3"

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
    mavenCentral()
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.11-R0.1-SNAPSHOT")
}
