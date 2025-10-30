package com.yordin.jungle_leap.recursos;

import com.badlogic.gdx.graphics.Texture;

public class Texturas {
    public static Texture fondoTextura;

    public static void cargar(){
        fondoTextura = new Texture("BG/BG.png");
    }


    public static void dispose(){
        fondoTextura.dispose();
    }
}
