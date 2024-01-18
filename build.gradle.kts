// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.3" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}
buildscript {
    // ...
    dependencies {
        // ...
        classpath("com.google.gms:google-services:4.4.0")  // Google 서비스 플러그인 버전은 최신 버전으로
    }
}