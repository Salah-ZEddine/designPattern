package emi.conception.adapter.videogame;

public class Clavier {
    public Key keyPressed(){
        System.out.println("Key pressed from keyboard");
        return Key.ARROW_LEFT;
    }
}
