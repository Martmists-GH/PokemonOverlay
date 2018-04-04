package com.martmists.PokemonOverlay

import okhttp3.*

object Http {
    val okhttp = OkHttpClient()

    fun get(url: HttpUrl): Response = okhttp.newCall(Request.Builder().url(url).build()).execute()

    fun get(url: String): Response = get(HttpUrl.parse(url)!!)
}