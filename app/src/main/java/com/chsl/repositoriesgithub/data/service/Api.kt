package com.chsl.repositoriesgithub.data.service


import com.chsl.repositoriesgithub.data.entity.pullsrequests.PullsRequestsResponse
import com.chsl.repositoriesgithub.data.entity.repository.RepositoryResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface Api {

    @GET("search/repositories?q=language:kotlin&sort=stars&")
    //https://api.github.com/search/repositories?q=language:kotlin&sort=stars&page=1
    fun allRepository(@Query("page") page: Int = 1): Observable<RepositoryResponse>

    @GET("repos/{criador}/{repositorio}/pulls")
    fun allPullsRequests(@Path("criador") creator: String,
                         @Path("repositorio") repository: String): Observable<List<PullsRequestsResponse>>
}