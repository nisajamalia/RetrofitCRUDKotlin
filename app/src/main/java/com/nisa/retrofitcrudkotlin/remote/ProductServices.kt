package com.nisa.retrofitcrudkotlin.remote

import com.nisa.retrofitcrudkotlin.model.PersonItem
import retrofit2.Call
import retrofit2.http.*

interface ProductServices {
    @get:GET("person/get/")
    val product: Call<List<PersonItem>>

    @FormUrlEncoded
    @POST("person/add")
    fun addProduct(
        @Field("name") name: String?,
        @Field("price") price: String?,
        @Field("desc") desc: String?
    ): Call<PersonItem?>?

    @FormUrlEncoded
    @PUT("person/update/")
    fun updateProduct(
        @Field("id") id: Int,
        @Field("name") name: String?,
        @Field("price") price: String?,
        @Field("desc") desc: String?
    ): Call<PersonItem?>?

    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "person/delete/", hasBody = true)
    fun deleteProduct(@Field("id") id: Int): Call<PersonItem?>?
}
