package com.netcetera.threeds.sdk.infrastructure;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.ab */
/* loaded from: classes5.dex */
public class RunnableC9224ab implements Runnable {
    private final String valueOf;
    private final AbstractC9749y values;

    public RunnableC9224ab(AbstractC9749y abstractC9749y, String str) {
        this.values = abstractC9749y;
        this.valueOf = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC9749y.valueOf(this.values, this.valueOf);
    }
}