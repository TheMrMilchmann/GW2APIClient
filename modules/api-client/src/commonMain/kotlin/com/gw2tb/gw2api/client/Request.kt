/*
 * Copyright (c) 2018-2020 Leon Linhart
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
package com.gw2tb.gw2api.client

import kotlinx.coroutines.*
import kotlin.coroutines.*
import kotlin.jvm.*

/**
 * TODO doc
 *
 * @since   0.1.0
 */
public expect class Request<T> internal constructor(
    host: String,
    path: String,
    parameters: Map<String, String>,
    apiKey: String?,
    func: (Request<T>) -> Deferred<Response<T>>
) {

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    public val host: String

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    public val path: String

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    public val parameters: Map<String, String>

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    public val apiKey: String?

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    public suspend fun get(): Response<T>

    /**
     * TODO doc
     *
     * @since   0.1.0
     */
    @JvmOverloads
    public fun then(errorHandler: ErrorHandler? = null, responseHandler: ResponseHandler<T>)

}