plugins {
    kotlin("multiplatform")
    alias(libs.plugins.compose.multiplatform)
}

kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(projects.shared)
                implementation(compose.material3)
            }
        }
    }
}

compose.experimental {
    web.application {}
}
