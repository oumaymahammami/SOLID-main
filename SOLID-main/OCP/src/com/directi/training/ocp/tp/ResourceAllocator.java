package com.directi.training.ocp.tp;

public class ResourceAllocator {
    private static final int INVALID_RESOURCE_ID = -1;

    public int allocate(Resource resource) {
        if (resource == null) return INVALID_RESOURCE_ID;
        return resource.allocate();
    }

    public void free(Resource resource, int resourceId) {
        if (resource != null) resource.free(resourceId);
    }
}

