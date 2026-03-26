package prasad.vennam.jsonpro.data.model

import com.google.gson.annotations.SerializedName


data class Product(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("description") var description: String? = null,
)