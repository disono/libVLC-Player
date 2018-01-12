package com.webmons.disono.vlc;

public interface VlcListener {
    void onPlayVlc();

    void onPauseVlc();

    void onStopVlc();

    void onVideoEnd();

    void onError();
}
