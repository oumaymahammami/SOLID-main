package com.directi.training.ocp.tp;

public interface Resource {
    int allocate();
    void free(int resourceId);
}

