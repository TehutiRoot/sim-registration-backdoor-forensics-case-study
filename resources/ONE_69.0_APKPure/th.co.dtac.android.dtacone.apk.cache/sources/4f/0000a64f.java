package com.google.api.client.util;

/* loaded from: classes4.dex */
public interface Clock {
    public static final Clock SYSTEM = new C7300a();

    /* renamed from: com.google.api.client.util.Clock$a */
    /* loaded from: classes4.dex */
    public static class C7300a implements Clock {
        @Override // com.google.api.client.util.Clock
        public long currentTimeMillis() {
            return System.currentTimeMillis();
        }
    }

    long currentTimeMillis();
}