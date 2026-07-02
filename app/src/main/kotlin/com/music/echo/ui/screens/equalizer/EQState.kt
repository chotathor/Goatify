package com.goatify.music.ui.screens.equalizer

import com.goatify.music.eq.data.SavedEQProfile


data class EQState(
    val profiles: List<SavedEQProfile> = emptyList(),
    val activeProfileId: String? = null,
    val importStatus: String? = null,
    val error: String? = null
)