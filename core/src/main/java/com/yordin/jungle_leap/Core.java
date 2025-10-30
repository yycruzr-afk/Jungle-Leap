package com.yordin.jungle_leap;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.yordin.jungle_leap.pantallas.PantallaMenu;
import com.yordin.jungle_leap.recursos.Texturas;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Core extends Game {
    private SpriteBatch batch;
    private Texture image;

    @Override
    public void create() {
        Texturas.cargar();
        setScreen(new PantallaMenu(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        if(getScreen() != null) getScreen().dispose();
    }
}
