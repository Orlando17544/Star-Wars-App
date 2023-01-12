package com.example.android.bookdroid

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.*


private const val BASE_URL = "https://swapi.dev/api/"

/**
 * Build the Moshi object that Retrofit will be using, making sure to add the Kotlin adapter for
 * full Kotlin compatibility.
 */
private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

/**
 * Use the Retrofit builder to build a retrofit object using a Moshi converter with our Moshi
 * object.
 */
private val retrofit = Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

/**
 * A public interface that exposes the [getProperties] method
 */
interface CharacterApiService {
    /**
     * Returns a Coroutine [List] of [MarsProperty] which can be fetched with await() if
     * in a Coroutine scope.
     * The @GET annotation indicates that the "realestate" endpoint will be requested with the GET
     * HTTP method
     */
    @GET("api/books?bibkeys=ISBN:9783775705813,ISBN:3832191321,ISBN:8806566067,ISBN:085331893,ISBN:085331392,ISBN:0810913135,ISBN:1556601263,ISBN:0226033848,ISBN:9780618758920,ISBN:9781406733174,ISBN:1580819532,ISBN:9783791311227,ISBN:8834317335,ISBN:9798540447898,ISBN:0143037528,ISBN:9781497317857,ISBN:2266198351,ISBN:171744962,ISBN:9798624112490,ISBN:9780710064387&jscmd=data&format=json")
    fun getArtBooks(): Call<String>

    @GET("api/books?jscmd=data&format=json")
    fun getBook(@Query("bibkeys") isbnQuery: String): Call<String>

    @Streaming
    @GET
    suspend fun downloadFile(@Url fileUrl:String): Response<ResponseBody>
}

/**
 * A public Api object that exposes the lazy-initialized Retrofit service
 */
object CharacterApi {
    val retrofitService : CharacterApiService by lazy { retrofit.create(CharacterApiService::class.java) }
}