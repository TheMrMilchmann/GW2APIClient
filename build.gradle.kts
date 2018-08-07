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
import gw2apiclient.build.*

allprojects {
    val nextVersion = "0.1.0"

    group = "com.github.themrmilchmann.gw2api"
    version = when (deployment.type) {
        gw2apiclient.build.BuildType.SNAPSHOT -> "$nextVersion-SNAPSHOT"
        else -> nextVersion
    }

    repositories {
        mavenCentral()
        maven("https://kotlin.bintray.com/kotlinx")
        maven("https://dl.bintray.com/kotlin/ktor")
    }
}