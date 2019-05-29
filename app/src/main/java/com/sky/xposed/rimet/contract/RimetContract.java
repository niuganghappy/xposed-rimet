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

package com.sky.xposed.rimet.contract;

import com.sky.xposed.rimet.base.BasePresenter;
import com.sky.xposed.rimet.base.BaseView;
import com.sky.xposed.rimet.data.model.UpdateModel;

/**
 * Created by sky on 2019-05-28.
 */
public interface RimetContract {

    interface View extends BaseView {

        void onUpdate(UpdateModel model);

        void onUpdateFailed(String msg);

    }

    interface Presenter extends BasePresenter {

        /**
         * 检测更新
         */
        void checkUpdate();

        /**
         * 获取运行的版本
         */
        void getSupportVersion();

        /**
         * 获取版本的配置
         * @param versionCode
         */
        void getVersionConfig(String versionCode);
    }
}
