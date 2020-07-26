/*
 * Copyright (c) 2018-2020 Leon Linhart
 * MACHINE GENERATED FILE, DO NOT EDIT
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
@file:JvmName("GW2v2")
@file:JvmMultifileClass
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package gw2api.v2

import gw2api.*
import gw2api.extra.*
import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*
import kotlin.jvm.*

fun GW2APIClient.gw2v2Account(configure: (RequestBuilder<GW2v2Account>.() -> Unit)? = null): RequestBuilder<GW2v2Account> = request(
    path = "/v2/account",
    parameters = mapOf("v" to "2019-12-19T00:00:00.000Z"),
    replaceInPath = emptyMap(),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2Account.serializer(),
    configure = configure
)

@Serializable
data class GW2v2Account(
    val id: String,
    val age: Int,
    val name: String,
    val world: Int,
    val guilds: List<String>,
    @SerialName("guild_leader")
    val guildLeader: List<String>? = null,
    val created: String,
    val access: List<String>,
    val commander: Boolean,
    @SerialName("fractal_level")
    val fractalLevel: Int? = null,
    @SerialName("daily_ap")
    val dailyAP: Int? = null,
    @SerialName("monthly_ap")
    val monthlyAP: Int? = null,
    @SerialName("wvw_rank")
    val wvwRank: Int? = null,
    @SerialName("last_modified")
    val lastModified: String
)