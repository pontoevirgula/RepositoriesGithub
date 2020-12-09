package com.chsl.repositoriesgithub.presentation

import com.chsl.repositoriesgithub.core.bases.BaseContract
import com.chsl.repositoriesgithub.data.entity.pullsrequests.PullsRequestsResponse

interface PullsRequestsPresentationContract {

    interface PullsRequestsListView {
        fun populatePullsRequests(itemList: List<PullsRequestsResponse>)
        fun success()
        fun loading()
        fun error()
    }

    interface PullsRequestsPresenter : BaseContract.Presenter {
        fun fetchPullsRequests(creator: String, repository: String)
    }
}