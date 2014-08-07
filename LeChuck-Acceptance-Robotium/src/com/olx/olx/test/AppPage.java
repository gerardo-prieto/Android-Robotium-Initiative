package com.olx.olx.test;

import com.robotium.solo.Solo;

public abstract class AppPage {

    private Solo solo;

    public AppPage(Solo solo) {
        this.solo = solo;
    }

    public Solo getSolo() {
        return this.solo;
    }   
}