package com.netcetera.threeds.sdk.infrastructure;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.netcetera.threeds.sdk.infrastructure.cg */
/* loaded from: classes5.dex */
public class RunnableC9290cg implements Runnable {
    private final C9291ch get;
    private final setAllCaps valueOf;

    public RunnableC9290cg(C9291ch c9291ch, setAllCaps setallcaps) {
        this.get = c9291ch;
        this.valueOf = setallcaps;
    }

    @Override // java.lang.Runnable
    public void run() {
        C9291ch.values(this.get, this.valueOf);
    }
}