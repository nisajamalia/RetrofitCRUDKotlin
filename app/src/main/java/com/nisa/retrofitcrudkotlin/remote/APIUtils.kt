package com.nisa.retrofitcrudkotlin.remote


object APIUtils {
    private const val API_URL = "http://192.168.0.101/marketplace/index.php/"
    val productService: ProductServices
        get() = RetrofitClient.getClient(API_URL)?.create(ProductServices::class.java)!!
}