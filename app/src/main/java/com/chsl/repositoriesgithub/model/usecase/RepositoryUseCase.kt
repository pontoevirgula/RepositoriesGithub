package com.chsl.repositoriesgithub.model.usecase

import com.chsl.repositoriesgithub.data.entity.repository.RepositoryResponse
import com.chsl.repositoriesgithub.data.service.Api
import com.chsl.repositoriesgithub.data.service.Requester
import com.chsl.repositoriesgithub.model.RepositoryModelContract
import io.reactivex.Observable

class RepositoryUseCase : RepositoryModelContract.RepositoryUseCase {

    override fun getRepository(page: Int): Observable<RepositoryResponse> {
        return Requester.service.create(Api::class.java).allRepository(page)
    }

}