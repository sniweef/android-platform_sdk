/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.hierarchyviewerlib;

import com.android.hierarchyviewerlib.models.DeviceSelectionModel;
import com.android.hierarchyviewerlib.models.PixelPerfectModel;
import com.android.hierarchyviewerlib.models.TreeViewModel;

/**
 * This is the central point for getting access to the various parts of the
 * Hierarchy Viewer. Components register themselves with the class using the
 * setters and can be accessed using the getters.
 */
public class ComponentRegistry {

    private static HierarchyViewerDirector director;

    private static DeviceSelectionModel deviceSelectionModel;

    private static PixelPerfectModel pixelPerfectModel;

    private static TreeViewModel treeViewModel;

    public static HierarchyViewerDirector getDirector() {
        return director;
    }

    public static void setDirector(HierarchyViewerDirector director) {
        ComponentRegistry.director = director;
    }

    public static DeviceSelectionModel getDeviceSelectionModel() {
        return deviceSelectionModel;
    }

    public static void setDeviceSelectionModel(DeviceSelectionModel deviceSelectionModel) {
        ComponentRegistry.deviceSelectionModel = deviceSelectionModel;
    }

    public static void setPixelPerfectModel(PixelPerfectModel pixelPerfectModel) {
        ComponentRegistry.pixelPerfectModel = pixelPerfectModel;
    }

    public static PixelPerfectModel getPixelPerfectModel() {
        return pixelPerfectModel;
    }

    public static void setTreeViewModel(TreeViewModel treeViewModel) {
        ComponentRegistry.treeViewModel = treeViewModel;
    }

    public static TreeViewModel getTreeViewModel() {
        return treeViewModel;
    }
}