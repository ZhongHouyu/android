package com.example.administrator.mvp01.service.manager;

import android.content.Context;


import com.example.administrator.mvp01.service.entity.Book;
import com.example.administrator.mvp01.service.view.RetrofitHelper;
import com.example.administrator.mvp01.service.view.RetrofitService;

import rx.Observable;

/**
 * Created by Administrator on 2017/2/28.
 */

public class DataManager {
    private RetrofitService mRetrofitService;
    public DataManager(Context context){
        this.mRetrofitService = RetrofitHelper.getInstance(context).getServer();
    }
    public Observable<Book> getSearchBooks(String name, String tag, int start, int count){
        return mRetrofitService.getSearchBook(name,tag,start,count);
    }
}
