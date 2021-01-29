package com.bebel.core.scenes;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.bebel.api.elements.basique.DrawableElement;
import com.bebel.api.elements.basique.GroupElement;
import com.bebel.api.manager.BebelScene;
import com.bebel.core.resources.Assets;

public class Scene1 extends BebelScene {
    protected GroupElement backgroundGroup;

    public Scene1() {
        super("Premiere Scene");
        backgroundGroup = new GroupElement("backgroundGroup", 100, 100);
    }

    @Override
    protected void createImpl() {
        super.createImpl();

        final GroupElement popup = new GroupElement("popup", 100, 100);
        final DrawableElement element = popup.background(Assets.Coffre.BACKGROUND);
        add(popup);

        popup.debugMe();
    }

    @Override
    protected void paintImpl(SpriteBatch batch) {
        super.paintImpl(batch);
    }
}
