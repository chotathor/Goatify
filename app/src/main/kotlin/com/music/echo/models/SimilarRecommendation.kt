

package com.goatify.music.models

import com.music.innertube.models.YTItem
import com.goatify.music.db.entities.LocalItem

data class SimilarRecommendation(
    val title: LocalItem,
    val items: List<YTItem>,
)
