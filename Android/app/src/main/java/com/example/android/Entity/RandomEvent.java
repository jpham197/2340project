package com.example.android.Entity;

public class RandomEvent {

    /**
     * @return dog
     */
    private int randomEvent() {
        int randomE = (int) (Math.random() * 10);
        if (randomE < 1) {
            return 0;
        } else if (randomE > 8) {
            return 1;
        } else {
            return -1;
        }
    }

    public boolean eventOccured() {
        return  (randomEvent() != 0);
    }

    /**
     *
     */
    public int randomMoney(int current, boolean occur) {
        if (occur) {
            if (randomEvent() == 1) {
                return (int) (Math.random() * 100 + 1) + current;
            } else {
                return current - (int) (Math.random() * 100 * -1);
            }
        }
        return current;
    }

    /**
     *
     * @return dog
     */
    public int randomFuel(int current, boolean occur) {
        if (occur) {
            if (randomEvent() == 1) {
                return current;
            } else {
                return (int) ((Math.random() * 9 + 1) * -1) + current;
            }
        }
        return current;
    }

//    public double randomMarketMultiplier() {
//        if (randomEvent() ==  0) {
//            return 1;
//        } else if (randomEvent() == 1) {
//            return ((Math.random() * 100 + 1)/ 101) + 1;
//        } else {
//            return (Math.random() * 100 + 1) / 101;
//        }
//    }


}
