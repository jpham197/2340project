package com.example.android.Entity;

public class RandomEvent {

    /**
     * @return
     */
    public int randomEvent() {
        int randomE = (int) (Math.random() * 10);
        if (randomE < 3) {
            return 0;
        } else if (randomE >= 3 && randomE < 6) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     *
     */
    public int randomMoney(int current) {
        if (randomEvent() ==  0) {
            return current;
        } else if (randomEvent() == 1) {
            return (int) Math.random() * 1000;
        } else {
            return (int) Math.random() * 1000 * -1;
        }
    }

    /**
     *
     * @return
     */
    public int randomFuel(int current) {
        if (randomEvent() ==  0) {
            return current;
        } else if (randomEvent() == 1) {
            return 0;
        } else {
            return (int) (Math.random() * 9 + 1) * -1;
        }
    }

}
