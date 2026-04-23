package com.ryckluk.mylibrary.data

import com.ryckluk.mylibrary.R
import com.ryckluk.mylibrary.model.Book

object BookDataSource {
    fun loadBooks() = listOf(
        Book(
            R.string.book1,
            R.string.author1,
            R.string.desc1,
            R.drawable.book1
        ),
        Book(
            R.string.book2,
            R.string.author2,
            R.string.desc2,
            R.drawable.book2
        ),
        Book(
            R.string.book3,
            R.string.author3,
            R.string.desc3,
            R.drawable.book3
        ),
        Book(
            R.string.book4,
            R.string.author4,
            R.string.desc4,
            R.drawable.book4
        ),
        Book(
            R.string.book5,
            R.string.author5,
            R.string.desc5,
            R.drawable.book5
        )
    )
}