package emi.conception.adapter.videogame;

public class Client {
    public static void main(String[] args) {

        Manette clavierAdapter = new ClavierAdapter();
        JeuVideo jeuVideo = new JeuVideo(clavierAdapter);
        jeuVideo.loopGame();
    }
}
