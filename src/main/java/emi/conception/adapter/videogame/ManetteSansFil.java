package emi.conception.adapter.videogame;

public class ManetteSansFil implements Manette{
    @Override
    public boolean isLeft() {
        System.out.println("isLeft");
        return true;
    }

    @Override
    public boolean isRight() {
        System.out.println("isRight");
        return false;
    }
}
