package prasad.vennam.jsonpro.domain

import jakarta.inject.Inject
import prasad.vennam.jsonpro.data.model.ProductResponse
import prasad.vennam.jsonpro.data.repo.ProductsRepository

class GetProductsUseCase @Inject constructor(
    private val repository: ProductsRepository,
) {
    suspend operator fun invoke(): Result<ProductResponse> {
        return try {
            val products = repository.getProducts()
            Result.success(products)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}

