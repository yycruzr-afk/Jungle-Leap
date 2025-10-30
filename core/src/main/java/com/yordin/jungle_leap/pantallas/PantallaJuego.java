package com.yordin.jungle_leap.pantallas;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.yordin.jungle_leap.Core;
import com.yordin.jungle_leap.recursos.Texturas;

public class PantallaJuego implements Screen {
    private Core game;
    private SpriteBatch batch;
    private BitmapFont font;
    private ShapeRenderer shape;

    public PantallaJuego(Core game){
        this.game = game;
        batch = new SpriteBatch();
        font = new BitmapFont();
        shape = new ShapeRenderer();


    }
    @Override
    public void render(float v) {
        logic();
        input();
        draw();
    }

    private void draw(){
        Gdx.gl.glClearColor(0.1f,0.1f,0.1f,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        batch.draw(Texturas.fondoTextura, 0,0,1920,1080);
        batch.end();


        shape.begin(ShapeRenderer.ShapeType.Line);
        shape.rect(500,500, 100,100);
        shape.end();
    }
    private void logic(){

    }

    private void input(){
        if(Gdx.input.isKeyPressed(Input.Keys.BACKSPACE)) game.setScreen(new PantallaMenu(game));
    }
    @Override
    public void dispose() {
        batch.dispose();
        font.dispose();
        shape.dispose();
    }

    @Override public void show(){}
    @Override public void resize(int i, int i1){}
    @Override public void pause(){}
    @Override public void resume(){}
    @Override public void hide(){}
}
