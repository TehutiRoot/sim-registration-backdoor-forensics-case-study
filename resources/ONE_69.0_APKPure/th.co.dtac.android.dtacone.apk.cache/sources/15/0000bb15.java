package com.netcetera.threeds.sdk.infrastructure;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.as */
/* loaded from: classes5.dex */
public class RunnableC9243as implements Runnable {
    private final String get;
    private final C9245au valueOf;

    public RunnableC9243as(C9245au c9245au, String str) {
        this.valueOf = c9245au;
        this.get = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        C9245au.values(this.valueOf, this.get);
    }
}