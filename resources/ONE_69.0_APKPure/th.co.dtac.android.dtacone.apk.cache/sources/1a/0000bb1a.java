package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.aw */
/* loaded from: classes5.dex */
class RunnableC9247aw implements Runnable {
    private final C9245au get;
    private final String values;

    public RunnableC9247aw(C9245au c9245au, String str) {
        this.get = c9245au;
        this.values = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        C9245au.ThreeDS2Service(this.get, this.values);
    }
}