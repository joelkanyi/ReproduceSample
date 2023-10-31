plugins {
    alias(libs.plugins.jvm)
    alias(libs.plugins.compose.multiplatform)
}

dependencies {
    implementation(projects.shared)
    implementation(compose.material3)
    implementation(compose.desktop.currentOs)
}

compose.desktop {
    application {
        mainClass = "DesktopAppKt"
        nativeDistributions {
            targetFormats(
                org.jetbrains.compose.desktop.application.dsl.TargetFormat.Dmg,
                org.jetbrains.compose.desktop.application.dsl.TargetFormat.Msi,
                org.jetbrains.compose.desktop.application.dsl.TargetFormat.Deb,
                org.jetbrains.compose.desktop.application.dsl.TargetFormat.Rpm,
            )
            packageName = "sample.desktop.app"
            packageName = "1.0.0"
        }
    }
}
