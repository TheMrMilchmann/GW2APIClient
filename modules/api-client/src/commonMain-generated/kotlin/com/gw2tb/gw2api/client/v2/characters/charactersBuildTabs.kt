/*
 * Copyright (c) 2018-2021 Leon Linhart
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
package com.gw2tb.gw2api.client.v2

import com.gw2tb.gw2api.client.*
import com.gw2tb.gw2api.client.internal.*
import com.gw2tb.gw2api.types.v2.*
import kotlinx.serialization.builtins.*
import kotlin.jvm.*

/**
 * Creates a request used to query the list of available IDs.
 *
 * Returns information about a character's equipped specializations.
 *
 * ```
 * Authenticated:       Yes (ACCOUNT, BUILDS, CHARACTERS)
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           No
 * Cache time:          N/A
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters/:id/buildtabs]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun GW2APIClient.gw2v2CharactersBuildTabsIDs(id: String, configure: RequestConfigurator<List<Int>>? = null): RequestBuilder<List<Int>> = request(
    path = "/v2/characters/:id/buildtabs",
    parameters = mapOfNonNullValues("v" to "2020-11-17T00:30:00.000Z"),
    replaceInPath = mapOf(":id" to id),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(Int.serializer()),
    configure = configure
)

/**
 * Creates a request used to query a single [item](GW2v2CharactersBuildTab) by its ID.
 *
 * Returns information about a character's equipped specializations.
 *
 * ```
 * Authenticated:       Yes (ACCOUNT, BUILDS, CHARACTERS)
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           No
 * Cache time:          N/A
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters/:id/buildtabs]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun GW2APIClient.gw2v2CharactersBuildTabsByID(id: String, tab: Int, configure: RequestConfigurator<GW2v2CharactersBuildTab>? = null): RequestBuilder<GW2v2CharactersBuildTab> = request(
    path = "/v2/characters/:id/buildtabs",
    parameters = mapOfNonNullValues("tab" to tab.toString(), "v" to "2020-11-17T00:30:00.000Z"),
    replaceInPath = mapOf(":id" to id),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = GW2v2CharactersBuildTab.serializer(),
    configure = configure
)

/**
 * Creates a request used to query one or more [items](GW2v2CharactersBuildTab) by their IDs.
 *
 * Returns information about a character's equipped specializations.
 *
 * ```
 * Authenticated:       Yes (ACCOUNT, BUILDS, CHARACTERS)
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           No
 * Cache time:          N/A
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters/:id/buildtabs]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun GW2APIClient.gw2v2CharactersBuildTabsByIDs(id: String, tabs: Collection<Int>, configure: RequestConfigurator<List<GW2v2CharactersBuildTab>>? = null): RequestBuilder<List<GW2v2CharactersBuildTab>> = request(
    path = "/v2/characters/:id/buildtabs",
    parameters = mapOfNonNullValues("tabs" to tabs.joinToString(","), "v" to "2020-11-17T00:30:00.000Z"),
    replaceInPath = mapOf(":id" to id),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2CharactersBuildTab.serializer()),
    configure = configure
)

/**
 * Creates a request used to query all available [items](GW2v2CharactersBuildTab).
 *
 * Returns information about a character's equipped specializations.
 *
 * ```
 * Authenticated:       Yes (ACCOUNT, BUILDS, CHARACTERS)
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           No
 * Cache time:          N/A
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters/:id/buildtabs]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun GW2APIClient.gw2v2CharactersBuildTabsAll(id: String, tabs: List<Int>, configure: RequestConfigurator<List<GW2v2CharactersBuildTab>>? = null): RequestBuilder<List<GW2v2CharactersBuildTab>> = request(
    path = "/v2/characters/:id/buildtabs",
    parameters = mapOfNonNullValues("tabs" to tabs.joinToString(","), "v" to "2020-11-17T00:30:00.000Z", "ids" to "all"),
    replaceInPath = mapOf(":id" to id),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2CharactersBuildTab.serializer()),
    configure = configure
)

/**
 * Creates a request used to query one or more [items](GW2v2CharactersBuildTab) by page.
 *
 * Returns information about a character's equipped specializations.
 *
 * ```
 * Authenticated:       Yes (ACCOUNT, BUILDS, CHARACTERS)
 * Paginated:           Yes
 * Bulk expanded:       Yes
 * Localized:           No
 * Cache time:          N/A
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/characters/:id/buildtabs]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun GW2APIClient.gw2v2CharactersBuildTabsByPage(id: String, page: Int, pageSize: Int = 200, configure: RequestConfigurator<List<GW2v2CharactersBuildTab>>? = null): RequestBuilder<List<GW2v2CharactersBuildTab>> = request(
    path = "/v2/characters/:id/buildtabs",
    parameters = mapOfNonNullValues("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString(), "v" to "2020-11-17T00:30:00.000Z"),
    replaceInPath = mapOf(":id" to id),
    requiresAuthentication = true,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2CharactersBuildTab.serializer()),
    configure = configure
)