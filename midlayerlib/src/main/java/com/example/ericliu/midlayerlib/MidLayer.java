package com.example.ericliu.midlayerlib;

import com.example.mylibrary.Injection;

/**
 * Created by ericliu on 1/09/2016.
 */

public class MidLayer {

    public String playLib(){
        return new Injection().provideProductFlavor();

    }
}
