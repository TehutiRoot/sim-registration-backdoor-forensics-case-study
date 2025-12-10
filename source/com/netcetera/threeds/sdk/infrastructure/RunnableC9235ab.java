package com.netcetera.threeds.sdk.infrastructure;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.ab */
/* loaded from: classes5.dex */
public class RunnableC9235ab implements Runnable {
    private final String valueOf;
    private final AbstractC9760y values;

    public RunnableC9235ab(AbstractC9760y abstractC9760y, String str) {
        this.values = abstractC9760y;
        this.valueOf = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC9760y.valueOf(this.values, this.valueOf);
    }
}
