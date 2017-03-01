package com.example.administrator.mvp01.service.view;

import com.example.administrator.mvp01.service.entity.Book;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2017/2/28.
 */

public interface RetrofitService {
        @GET("book/search")
        Observable<Book> getSearchBook(@Query("q")String name,
                                      @Query("tag")String tag,
                                      @Query("start")int start,
                                      @Query("count")int count);

}
