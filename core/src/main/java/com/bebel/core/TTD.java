package com.bebel.core;

import com.bebel.api.BebelGame;
import com.bebel.api.manager.SceneManager;
import com.bebel.api.resources.ResourceManager;
import com.bebel.core.scenes.Scenes;

public class TTD extends BebelGame {
    @Override
    public void create() {
        super.create();
        ResourceManager.getInstance().finishLoading();

        SceneManager.getInstance().select(Scenes.SCENE1);
    }
}
