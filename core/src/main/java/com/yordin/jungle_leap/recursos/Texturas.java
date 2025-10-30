package com.yordin.jungle_leap.recursos;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.sun.org.apache.xerces.internal.util.TeeXMLDocumentFilterImpl;

public class Texturas {
    public static Texture fondoTextura;

    public static Texture texturePlayer;



    public static void cargar(){
        fondoTextura = new Texture("BG/BG.png");
        texturePlayer = new Texture("animaciones/inactivo/Idle (1).png");
    }


    public static void dispose(){
        fondoTextura.dispose();
    }
}
