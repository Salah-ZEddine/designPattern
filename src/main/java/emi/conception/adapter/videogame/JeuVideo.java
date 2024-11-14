package emi.conception.adapter.videogame;

public class JeuVideo {
    private Manette manette;
    public JeuVideo(Manette manette) {
        this.manette = manette;
    }
    public void loopGame(){
        if (manette.isLeft()){
            System.out.println("gameloop pressing is left");
        }else if (manette.isRight()){
            System.out.println("gameloop pressing is right");
        }
    }
}
