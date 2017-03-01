package com.example.administrator.mvp01.service.view;

import com.example.administrator.mvp01.service.entity.Book;

/**
 * Created by Administrator on 2017/2/28.
 */

public interface BookView extends View {
    void onSuccess(Book mBook);
    void onError(String result);
}