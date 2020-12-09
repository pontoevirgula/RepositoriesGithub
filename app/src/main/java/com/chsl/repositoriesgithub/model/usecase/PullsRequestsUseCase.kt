package com.chsl.repositoriesgithub.model.usecase

import com.chsl.repositoriesgithub.data.entity.pullsrequests.PullsRequestsResponse
import com.chsl.repositoriesgithub.data.service.Api
import com.chsl.repositoriesgithub.data.service.Requester
import com.chsl.repositoriesgithub.model.PullsRequestsModelContract
import io.reactivex.Observable

class PullsRequestsUseCase : PullsRequestsModelContract.PullsRequestsUseCase {

    override fun getAllPullsRequests(creator: String, repository: String): Observable<List<PullsRequestsResponse>> {
        return Requester.service.create(Api::class.java).allPullsRequests(creator, repository)
    }

}