package com.netcetera.threeds.sdk.infrastructure;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.cg */
/* loaded from: classes5.dex */
public class RunnableC9301cg implements Runnable {
    private final C9302ch get;
    private final setAllCaps valueOf;

    public RunnableC9301cg(C9302ch c9302ch, setAllCaps setallcaps) {
        this.get = c9302ch;
        this.valueOf = setallcaps;
    }

    @Override // java.lang.Runnable
    public void run() {
        C9302ch.values(this.get, this.valueOf);
    }
}
