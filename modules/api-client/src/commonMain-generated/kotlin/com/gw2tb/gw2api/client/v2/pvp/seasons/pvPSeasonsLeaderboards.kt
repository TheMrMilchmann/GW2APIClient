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
 * Creates a request used to query the resource.
 *
 * Returns information about the available sub-endpoints.
 *
 * ```
 * Authenticated:       No
 * Paginated:           No
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          INFINITE
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/pvp/seasons/:id/leaderboards]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun GW2APIClient.gw2v2PvPSeasonsLeaderboards(iD: String, configure: RequestConfigurator<List<String>>? = null): RequestBuilder<List<String>> = request(
    path = "/v2/pvp/seasons/:id/leaderboards",
    parameters = mapOfNonNullValues("v" to "2020-11-17T00:30:00.000Z"),
    replaceInPath = mapOf(":id" to iD),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(String.serializer()),
    configure = configure
)

/**
 * Creates a request used to query the resource.
 *
 * Returns information about the available sub-endpoints.
 *
 * ```
 * Authenticated:       No
 * Paginated:           No
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          INFINITE
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/pvp/seasons/:id/leaderboards/:board]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun GW2APIClient.gw2v2PvPSeasonsLeaderboards(iD: String, board: String, configure: RequestConfigurator<List<String>>? = null): RequestBuilder<List<String>> = request(
    path = "/v2/pvp/seasons/:id/leaderboards/:board",
    parameters = mapOfNonNullValues("v" to "2020-11-17T00:30:00.000Z"),
    replaceInPath = mapOf(":id" to iD, ":board" to board),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(String.serializer()),
    configure = configure
)

/**
 * Creates a request used to query one or more [items](GW2v2LeaderboardEntry) by page.
 *
 * Returns information about a PvP leaderboard.
 *
 * ```
 * Authenticated:       No
 * Paginated:           Yes
 * Bulk expanded:       No
 * Localized:           No
 * Cache time:          1h
 * ```
 *
 * Read more: [https://wiki.guildwars2.com/wiki/API:2/pvp/seasons/:id/leaderboards/:board/:region]
 *
 * @receiver        the client instance used to make the request
 * @param configure configure action for the request
 *
 * @return  the request that can be executed to query the API
 */
@JvmOverloads
public fun GW2APIClient.gw2v2PvPSeasonsLeaderboardsByPage(iD: String, board: String, region: String, page: Int, pageSize: Int = 200, configure: RequestConfigurator<List<GW2v2LeaderboardEntry>>? = null): RequestBuilder<List<GW2v2LeaderboardEntry>> = request(
    path = "/v2/pvp/seasons/:id/leaderboards/:board/:region",
    parameters = mapOfNonNullValues("page" to page.toString(), "page_size" to pageSize.let { if (it < 1 || it > 200) throw IllegalArgumentException("Illegal page size") else it }.toString(), "v" to "2020-11-17T00:30:00.000Z"),
    replaceInPath = mapOf(":id" to iD, ":board" to board, ":region" to region),
    requiresAuthentication = false,
    requiredPermissions = emptySet(),
    supportedLanguages = emptySet(),
    serializer = ListSerializer(GW2v2LeaderboardEntry.serializer()),
    configure = configure
)