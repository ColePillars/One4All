package com.cse.one4all.scene;

import com.cse.one4all.base.BaseScene;

import org.andengine.entity.scene.background.Background;
import org.andengine.entity.text.Text;
import org.andengine.util.adt.color.Color;

public class LoadingScene extends BaseScene {

    private Text loading;

    @Override
    public void createScene() {
        setBackground(new Background(Color.BLACK));

        loading = new Text(camera.getCenterX(), camera.getCenterY(), resourcesManager.font, "Loading...", vbom);

        attachChild(loading);
    }

    @Override
    public void populateScene() {

    }

    @Override
    public void onBackKeyPressed() {
        return;
    }

    @Override
    public SceneType getSceneType() {
        return SceneType.LOADING;
    }

    @Override
    public void disposeScene() {
        loading.detachSelf();
        loading.dispose();
        this.detachSelf();
        this.dispose();
    }
}
