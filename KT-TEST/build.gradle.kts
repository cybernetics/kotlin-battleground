plugins {
    kotlin("js") version "1.3.70-eap-184" apply false
}

allprojects {
    repositories {
        jcenter()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
        mavenLocal()
    }
}

tasks.wrapper {
    gradleVersion = "6.2"
    distributionType = Wrapper.DistributionType.ALL
}
