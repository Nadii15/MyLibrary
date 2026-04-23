package com.ryckluk.mylibrary.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Book(
    @StringRes val titleId: Int,
    @StringRes val authorId: Int,
    @StringRes val descriptionId: Int,
    @DrawableRes val coverId: Int
)
