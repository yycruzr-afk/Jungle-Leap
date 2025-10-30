package com.yordin.jungle_leap.pantallas;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.yordin.jungle_leap.Core;
import com.yordin.jungle_leap.recursos.Texturas;

public class PantallaMenu implements Screen {
    private Core game;
    private SpriteBatch batch;
    private BitmapFont font;

    public PantallaMenu(Core game){
        this.game = game;
        batch = new SpriteBatch();
        font = new BitmapFont();
    }

    @Override
    public void render(float delta){
        logic();
        input();
        draw();
    }
    private void draw(){
        Gdx.gl.glClearColor(0.1f,0.1f,0.1f,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        font.getData().setScale(5f);

        batch.draw(Texturas.fondoTextura, 0,0, 1920,1080);


        font.draw(batch, "Menu principal", 760,740);
        font.draw(batch, "Menu principal", 760,540);
        font.draw(batch, "Menu principal", 760,340);
        batch.end();
    }
    private void logic(){

    }
    private void input(){
        if(Gdx.input.isKeyPressed(Input.Keys.ENTER)){
            game.setScreen(new PantallaJuego(game));
        }
        if(Gdx.input.isKeyPressed(Input.Keys.ESCAPE)){
            Gdx.app.exit();
        }
    }

    @Override
    public void dispose(){
        batch.dispose();
        font.dispose();
    }

    @Override public void show(){}
    @Override public void resize(int width, int height){}
    @Override public void pause(){}
    @Override public void resume(){}
    @Override public void hide(){}
}
