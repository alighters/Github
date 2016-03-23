/*
 * Copyright (C) 2016 david.wei (lighters)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lighters.github.ui.repo.view;

import com.lighters.github.data.model.net.RepoEntity;
import com.lighters.github.ui.base.IBaseView;
import java.util.List;

/**
 * Created by david on 16/3/23.
 * Email: huangdiv5@gmail.com
 * GitHub: https://github.com/david-wei
 */
public interface IRepoListView extends IBaseView {

    /**
     * Render the repo list to the UI.
     * @param list
     */
    void renderRepoList(List<RepoEntity> list);
}
