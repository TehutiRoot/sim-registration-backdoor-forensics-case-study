package com.google.api.client.util;

/* loaded from: classes4.dex */
public interface NanoClock {
    public static final NanoClock SYSTEM = new C7315a();

    /* renamed from: com.google.api.client.util.NanoClock$a */
    /* loaded from: classes4.dex */
    public static class C7315a implements NanoClock {
        @Override // com.google.api.client.util.NanoClock
        public long nanoTime() {
            return System.nanoTime();
        }
    }

    long nanoTime();
}
