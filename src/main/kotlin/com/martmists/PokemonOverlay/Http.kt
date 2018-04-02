import okhttp3.*

object Http {
    val okhttp = OkHttpClient()

    inline fun get(url: HttpUrl): Response {
        return okhttp.newCall(Request.Builder().url(url).build()).execute()
    }

    inline fun get(url: String): Response {
        val httpUrl = HttpUrl.parse(url)!!

        return get(httpUrl)
    }
}