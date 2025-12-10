package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
class setRendererPriorityPolicy implements Runnable {
    private final setMotionEventSplittingEnabled ThreeDS2Service;

    public setRendererPriorityPolicy(setMotionEventSplittingEnabled setmotioneventsplittingenabled) {
        this.ThreeDS2Service = setmotioneventsplittingenabled;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.ThreeDS2Service.values();
    }
}