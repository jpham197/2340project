package com.example.android.Entity;

public class RandomEvent {

    /**
     * @return
     */
    public int randomEvent() {
        int randomE = (int) (Math.random() * 10);
        if (randomE < 3) {
            return 0;
        } else if (randomE < 6 && randomE >= 3) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     *
     */
    public int randomTravel() {
        if (randomEvent() ==  0) {
            return 0;
        } else if (randomEvent() == 1) {
            return randomEvent() * 100;
        } else {
            return randomEvent() * 100 * -1;
        }
    }

    /**
     *
     * @return
     */
    public int randomFuel() {
        if (randomEvent() ==  0) {
            return 0;
        } else if (randomEvent() == 1) {
            return randomEvent() * 100;
        } else {
            return randomEvent() * 100 * -1;
        }
    }

}
