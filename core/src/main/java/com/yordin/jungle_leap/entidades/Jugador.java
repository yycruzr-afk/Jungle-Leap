package com.yordin.jungle_leap.entidades;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.yordin.jungle_leap.recursos.Texturas;


public class Jugador {
    private Texture texture;
    private Vector2 posicion;
    private Vector2 velocidad;
    private float velocidadModulo;
    private Rectangle hitBox;

    public Jugador(float x, float y){
        texture = Texturas.texturePlayer;
        posicion = new Vector2(x,y);
        velocidad = new Vector2(0,0);
        velocidadModulo = 150;
        hitBox = new Rectangle(posicion.x, posicion.y, texture.getWidth(), texture.getHeight());
    }

    public void update(float delta){
        posicion.mulAdd(velocidad, delta);
    }
    public void mover(){
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) velocidad.x = velocidadModulo;
        else if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) velocidad.x = -velocidadModulo;
        else velocidad.x = 0;
    }

    public void dibujar(SpriteBatch batch){
        batch.draw(texture, posicion.x, posicion.y);
    }
}
