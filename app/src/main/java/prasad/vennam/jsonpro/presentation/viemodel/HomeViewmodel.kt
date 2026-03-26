package prasad.vennam.jsonpro.presentation.viemodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import prasad.vennam.jsonpro.data.model.Product
import prasad.vennam.jsonpro.domain.GetProductsUseCase
import javax.inject.Inject

@HiltViewModel
class HomeViewmodel @Inject constructor(
    private val getProductsUseCase: GetProductsUseCase,
) : ViewModel() {

    private val _products = MutableStateFlow<List<Product>>(emptyList())
    val products: StateFlow<List<Product>> = _products

    init {
        loadProducts()
    }

    private fun loadProducts() {
        viewModelScope.launch {
            getProductsUseCase().onSuccess {
                _products.value = it.products
                println(it.products)
            }.onFailure {
                println(it.message)
            }
        }
    }
}