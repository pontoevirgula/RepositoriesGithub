package com.chsl.repositoriesgithub.model

import com.chsl.repositoriesgithub.data.entity.repository.RepositoryResponse
import io.reactivex.Observable

interface RepositoryModelContract {

    interface RepositoryUseCase {
        fun getRepository(page: Int = 1) :Observable<RepositoryResponse>
    }
}