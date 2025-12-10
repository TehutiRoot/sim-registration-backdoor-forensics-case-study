package com.google.api.client.util;

/* loaded from: classes4.dex */
public interface Sleeper {
    public static final Sleeper DEFAULT = new C7307a();

    /* renamed from: com.google.api.client.util.Sleeper$a */
    /* loaded from: classes4.dex */
    public static class C7307a implements Sleeper {
        @Override // com.google.api.client.util.Sleeper
        public void sleep(long j) {
            Thread.sleep(j);
        }
    }

    void sleep(long j) throws InterruptedException;
}