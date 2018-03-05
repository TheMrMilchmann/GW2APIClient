/*
 * Copyright 2018 Leon Linhart
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import org.jetbrains.kotlin.gradle.dsl.*
import org.jetbrains.kotlin.gradle.tasks.*

plugins {
    id("kotlin-platform-js")
    id("kotlinx-serialization")
}

kotlin {
    experimental.coroutines = Coroutines.ENABLE
}

tasks.withType<Kotlin2JsCompile> {
    kotlinOptions {
        metaInfo = true
        moduleKind = "umd"
    }
}

dependencies {
    expectedBy(project(":shared"))

    compile(kotlin("stdlib-js"))
    compile("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:0.22.4")
    compile("org.jetbrains.kotlinx:kotlinx-serialization-runtime-js:0.4.1")

    testCompile(kotlin("test-js"))
}