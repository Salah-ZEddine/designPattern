package emi.conception.builder;

public class Director {

    public void buildBugatti(Builder builder){
        builder.brand("Bugatti")
                .model("2010")
                .color("red")
                .doorNo(2)
                .screen(0)
                .height(1)
                .weight(2300);

    }

}
