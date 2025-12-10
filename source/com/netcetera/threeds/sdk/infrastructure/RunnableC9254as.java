package com.netcetera.threeds.sdk.infrastructure;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.as */
/* loaded from: classes5.dex */
public class RunnableC9254as implements Runnable {
    private final String get;
    private final C9256au valueOf;

    public RunnableC9254as(C9256au c9256au, String str) {
        this.valueOf = c9256au;
        this.get = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        C9256au.values(this.valueOf, this.get);
    }
}
