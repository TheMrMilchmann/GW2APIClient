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
@file:Suppress("PackageDirectoryMismatch", "UnusedImport")
package com.gw2tb.gw2api.types.v2

import kotlinx.serialization.*
import kotlinx.serialization.builtins.*
import kotlinx.serialization.json.*

/**
 * Information about a quest.
 *
 * @param id the quest's ID
 * @param name the quest's localized name
 * @param level the minimum level required to begin the quest
 * @param story the story's ID
 * @param goals the quest's goals
 */
@Serializable
public data class GW2v2Quest(
    val id: String,
    val name: String,
    val level: Int,
    val story: Int,
    val goals: List<Goal>
) {

    /**
     * Information about a quest's goal.
     *
     * @param active the text displayed for the quest step if it is active
     * @param complete the text displayed for the quest step if it is complete
     */
    @Serializable
    public data class Goal(
        val active: String,
        val complete: String
    )

}