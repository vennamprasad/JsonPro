package prasad.vennam.jsonpro.data.repo

import prasad.vennam.jsonpro.data.model.ProductResponse

interface ProductsRepository {
    suspend fun getProducts(): ProductResponse
}