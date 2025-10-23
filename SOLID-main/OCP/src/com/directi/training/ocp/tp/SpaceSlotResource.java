package com.directi.training.ocp.tp;

public class SpaceSlotResource implements Resource {
    @Override
    public int allocate() {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    private void markSpaceSlotBusy(int resourceId) { }
    private void markSpaceSlotFree(int resourceId) { }
    private int findFreeSpaceSlot() { return 0; }
}
