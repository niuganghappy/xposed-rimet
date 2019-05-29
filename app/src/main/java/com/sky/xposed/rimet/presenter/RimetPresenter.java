/*
 * Copyright (c) 2019 The sky Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sky.xposed.rimet.presenter;

import android.annotation.SuppressLint;

import com.sky.xposed.rimet.contract.RimetContract;
import com.sky.xposed.rimet.data.source.IRimetSource;
import com.sky.xposed.rimet.plugin.interfaces.XPluginManager;

/**
 * Created by sky on 2019-05-28.
 */
public class RimetPresenter extends AbstractPresenter implements RimetContract.Presenter {

    private IRimetSource mRimetSource;
    private RimetContract.View mView;

    public RimetPresenter(XPluginManager xPluginManager, RimetContract.View view) {
        super(xPluginManager);
        mView = view;
        mRimetSource = getRepositoryFactory().createRimetSource();
    }

    @SuppressLint("CheckResult")
    @Override
    public void checkUpdate() {

        ioToMain(mRimetSource.checkUpdate())
                .subscribe(model -> {

                });
    }

    @Override
    public void getSupportVersion() {

    }

    @Override
    public void getVersionConfig(String versionCode) {

    }
}
