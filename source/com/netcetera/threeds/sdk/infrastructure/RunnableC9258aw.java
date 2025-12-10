package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.aw */
/* loaded from: classes5.dex */
class RunnableC9258aw implements Runnable {
    private final C9256au get;
    private final String values;

    public RunnableC9258aw(C9256au c9256au, String str) {
        this.get = c9256au;
        this.values = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        C9256au.ThreeDS2Service(this.get, this.values);
    }
}
