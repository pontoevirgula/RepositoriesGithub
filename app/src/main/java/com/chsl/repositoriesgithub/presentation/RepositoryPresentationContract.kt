package com.chsl.repositoriesgithub.presentation

import com.chsl.repositoriesgithub.core.bases.BaseContract
import com.chsl.repositoriesgithub.data.entity.repository.Items

interface RepositoryPresentationContract {

    interface RepositoryListView {
        fun populateRepository(itemList: List<Items>)
        fun success()
        fun loading()
        fun error()
    }

    interface RepositoryListPresenter : BaseContract.Presenter {
        fun fetchRepository(page: Int = 1)
    }
}