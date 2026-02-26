rootProject.name = "prosemirror-multiplatform"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
  repositories {
    google()
    gradlePluginPortal()
    mavenCentral()
  }
}

dependencyResolutionManagement {
  versionCatalogs {
    create("libs") {
      from(files("libs.versions.toml"))
    }

    create("kotlinJsWrappers") {
      val wrappersVersion = "2025.7.11"
      from("org.jetbrains.kotlin-wrappers:kotlin-wrappers-catalog:$wrappersVersion")
    }
  }
  repositories {
    google()
    mavenCentral()
  }
}

include("model")
include("state")
include("transform")
include("util")
include("collab")
include("history")
include("test-builder")
