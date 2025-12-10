package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;

/* renamed from: com.google.android.datatransport.runtime.backends.b */
/* loaded from: classes3.dex */
public final class C6262b extends BackendResponse {

    /* renamed from: a */
    public final BackendResponse.Status f44093a;

    /* renamed from: b */
    public final long f44094b;

    public C6262b(BackendResponse.Status status, long j) {
        if (status != null) {
            this.f44093a = status;
            this.f44094b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        if (this.f44093a.equals(backendResponse.getStatus()) && this.f44094b == backendResponse.getNextRequestWaitMillis()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public long getNextRequestWaitMillis() {
        return this.f44094b;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    public BackendResponse.Status getStatus() {
        return this.f44093a;
    }

    public int hashCode() {
        long j = this.f44094b;
        return ((this.f44093a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f44093a + ", nextRequestWaitMillis=" + this.f44094b + "}";
    }
}