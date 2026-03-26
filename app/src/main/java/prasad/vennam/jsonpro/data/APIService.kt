package prasad.vennam.jsonpro.data

import prasad.vennam.jsonpro.data.model.ProductResponse
import retrofit2.http.GET


interface MyApiService {
    @GET("products")
    suspend fun getProducts(): ProductResponse
}