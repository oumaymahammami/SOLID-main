package com.directi.training.ocp.tp;

public class TimeSlotResource implements Resource {
    @Override
    public int allocate() {
        int resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markTimeSlotFree(resourceId);
    }

    private void markTimeSlotBusy(int resourceId) { }
    private void markTimeSlotFree(int resourceId) { }
    private int findFreeTimeSlot() { return 0; }
}

