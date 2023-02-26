package com.jie.newBean;

public class ColorCar {
    private BossCar bossCar;

    public ColorCar(BossCar bossCar) {
        this.bossCar = bossCar;
    }

    public BossCar getBossCar() {
        return bossCar;
    }

    public void setBossCar(BossCar bossCar) {
        this.bossCar = bossCar;
    }

    @Override
    public String toString() {
        return "ColorCar{" +
                "bossCar=" + bossCar +
                '}';
    }
}
