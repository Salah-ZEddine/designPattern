package emi.conception.adapter.videogame;

public class ClavierAdapter extends Clavier implements Manette{
    @Override
    public boolean isLeft() {
        System.out.println("isLeft from ClavierAdapter");
        Key key=super.keyPressed();
        return key==Key.ARROW_LEFT;
    }

    @Override
    public boolean isRight() {
        System.out.println("isRight from ClavierAdapter");
        Key key=super.keyPressed();
        return key==Key.ARROW_RIGHT;
    }
}
