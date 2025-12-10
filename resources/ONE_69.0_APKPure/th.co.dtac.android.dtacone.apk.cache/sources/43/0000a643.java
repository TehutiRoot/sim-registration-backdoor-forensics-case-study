package com.google.api.client.util;

import java.io.IOException;

/* loaded from: classes4.dex */
public interface BackOff {
    public static final long STOP = -1;
    public static final BackOff ZERO_BACKOFF = new C7296a();
    public static final BackOff STOP_BACKOFF = new C7297b();

    /* renamed from: com.google.api.client.util.BackOff$a */
    /* loaded from: classes4.dex */
    public static class C7296a implements BackOff {
        @Override // com.google.api.client.util.BackOff
        public long nextBackOffMillis() {
            return 0L;
        }

        @Override // com.google.api.client.util.BackOff
        public void reset() {
        }
    }

    /* renamed from: com.google.api.client.util.BackOff$b */
    /* loaded from: classes4.dex */
    public static class C7297b implements BackOff {
        @Override // com.google.api.client.util.BackOff
        public long nextBackOffMillis() {
            return -1L;
        }

        @Override // com.google.api.client.util.BackOff
        public void reset() {
        }
    }

    long nextBackOffMillis() throws IOException;

    void reset() throws IOException;
}