package com.rndspell.game.screens;

import com.badlogic.gdx.Screen;

public class MenuScreen implements Screen {
    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {
        ScreenManager.getInstance().show(CustomScreen.GAME);
    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
