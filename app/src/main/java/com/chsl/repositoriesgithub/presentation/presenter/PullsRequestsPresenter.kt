package com.chsl.repositoriesgithub.presentation.presenter

import com.chsl.repositoriesgithub.core.bases.BasePresenter
import com.chsl.repositoriesgithub.model.usecase.PullsRequestsUseCase
import com.chsl.repositoriesgithub.presentation.PullsRequestsPresentationContract
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class PullsRequestsPresenter(private val view: PullsRequestsPresentationContract.PullsRequestsListView) : BasePresenter(),
    PullsRequestsPresentationContract.PullsRequestsPresenter {

    private val pullsRequestsUseCase = PullsRequestsUseCase()

    override fun fetchPullsRequests(creator: String, repository: String) {
        view.loading()
        val disposable = pullsRequestsUseCase.getAllPullsRequests(creator, repository)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                it?.let {
                    if(it.isNotEmpty()) {
                        view.populatePullsRequests(it)
                        view.success()
                    } else {
                        view.error()
                    }
                }
            },
                { view.error() })
        compositeDisposable!!.add(disposable)
    }
}
