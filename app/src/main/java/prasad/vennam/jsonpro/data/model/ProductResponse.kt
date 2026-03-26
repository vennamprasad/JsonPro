package prasad.vennam.jsonpro.data.model

import com.google.gson.annotations.SerializedName


data class ProductResponse(
    @SerializedName("products") var products: ArrayList<Product> = arrayListOf(),
)