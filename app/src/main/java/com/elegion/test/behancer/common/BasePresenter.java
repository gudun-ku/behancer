package com.elegion.test.behancer.common;

import io.reactivex.disposables.CompositeDisposable;

public class BasePresenter {

    protected CompositeDisposable mCompositeDisposable = new CompositeDisposable();

    public void disposeAll() {
        mCompositeDisposable.clear();
    }
}
