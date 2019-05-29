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

package com.sky.xposed.rimet.data.model;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by sky on 2019-05-27.
 */
public class ConfigModel implements Serializable {

    private Map<Integer, String> versionConfig;

    public Map<Integer, String> getVersionConfig() {
        return versionConfig;
    }

    public void setVersionConfig(Map<Integer, String> versionConfig) {
        this.versionConfig = versionConfig;
    }
}
