package prasad.vennam.jsonpro.data.repo

import prasad.vennam.jsonpro.data.MyApiService
import prasad.vennam.jsonpro.data.model.ProductResponse
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(
    private val api: MyApiService,
) : ProductsRepository {
    override suspend fun getProducts(): ProductResponse {
        return api.getProducts()
    }
}