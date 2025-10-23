package com.directi.training.isp.tp;

import java.util.TimerTask;

public class Timer
{
    public void register(long timeOut, final TimedDoorCallback callback)
    {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                callback.timeOutCallback();
            }
        }, timeOut);
    }
}
