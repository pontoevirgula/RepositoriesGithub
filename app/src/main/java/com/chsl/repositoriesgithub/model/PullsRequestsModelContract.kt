package com.chsl.repositoriesgithub.model

import com.chsl.repositoriesgithub.data.entity.pullsrequests.PullsRequestsResponse
import io.reactivex.Observable

interface PullsRequestsModelContract {

    interface PullsRequestsUseCase {
        fun getAllPullsRequests(creator: String, repository: String) : Observable<List<PullsRequestsResponse>>
    }
}