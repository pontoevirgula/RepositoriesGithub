package com.chsl.repositoriesgithub.data.entity.repository

import com.google.gson.annotations.SerializedName

data class RepositoryResponse(
    val totalCount: Int? = null,
    val incompleteResults: Boolean? = null,
    @SerializedName("items")
    val items: List<Items>
)
