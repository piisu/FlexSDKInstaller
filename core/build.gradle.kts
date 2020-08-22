plugins {
    groovy
}


repositories {
    mavenCentral()
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:3.0.5")
    testImplementation("junit", "junit", "4.12")

    implementation("org.codehaus.groovy:groovy-ant:3.0.5")
    //implementation("org.apache.ant:ant:1.10.8")
}
