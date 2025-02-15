package org.softeer_2nd.caArt.model.data

import com.google.gson.annotations.SerializedName
import org.softeer_2nd.caArt.model.data.dto.ExteriorColor
import org.softeer_2nd.caArt.model.data.dto.InteriorColor

data class ChoiceColorItem(
    val tag: String = "",
    val colorName: String,
    val trimPrice: Long,
    val trimId: Int = 0,
    @SerializedName("colorPreview")
    val preview: String = "",
    @SerializedName("colorImage")
    val imgUrl: String = "",
    val trimName: String = "",
    val recommendationMessage: String? = null,
    val colorPrice: Long? = null
) {
    companion object {
        fun ChoiceColorItem.toExteriorColor(): ExteriorColor =
            ExteriorColor(0, colorName, imgUrl, trimPrice, 0, listOf(preview))

        fun ChoiceColorItem.toInteriorColor(): InteriorColor =
            InteriorColor(0, colorName, imgUrl, trimPrice, 0, preview)
    }
}
