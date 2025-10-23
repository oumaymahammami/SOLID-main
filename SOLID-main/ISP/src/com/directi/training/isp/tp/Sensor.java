package com.directi.training.isp.tp;

import java.util.Random;

public class Sensor
{
    private static final Random RANDOM = new Random();

    public void register(ProximityDoorCallback callback)
    {
        while (true) {
            if (isPersonClose()) {
                callback.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return RANDOM.nextBoolean();
    }
}
