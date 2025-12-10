package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendRequest;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.runtime.backends.a */
/* loaded from: classes3.dex */
public final class C6259a extends BackendRequest {

    /* renamed from: a */
    public final Iterable f44089a;

    /* renamed from: b */
    public final byte[] f44090b;

    /* renamed from: com.google.android.datatransport.runtime.backends.a$b */
    /* loaded from: classes3.dex */
    public static final class C6261b extends BackendRequest.Builder {

        /* renamed from: a */
        public Iterable f44091a;

        /* renamed from: b */
        public byte[] f44092b;

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest build() {
            String str = "";
            if (this.f44091a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C6259a(this.f44091a, this.f44092b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest.Builder setEvents(Iterable iterable) {
            if (iterable != null) {
                this.f44091a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest.Builder setExtras(byte[] bArr) {
            this.f44092b = bArr;
            return this;
        }
    }

    public boolean equals(Object obj) {
        byte[] extras;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendRequest)) {
            return false;
        }
        BackendRequest backendRequest = (BackendRequest) obj;
        if (this.f44089a.equals(backendRequest.getEvents())) {
            byte[] bArr = this.f44090b;
            if (backendRequest instanceof C6259a) {
                extras = ((C6259a) backendRequest).f44090b;
            } else {
                extras = backendRequest.getExtras();
            }
            if (Arrays.equals(bArr, extras)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public Iterable getEvents() {
        return this.f44089a;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public byte[] getExtras() {
        return this.f44090b;
    }

    public int hashCode() {
        return ((this.f44089a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f44090b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f44089a + ", extras=" + Arrays.toString(this.f44090b) + "}";
    }

    public C6259a(Iterable iterable, byte[] bArr) {
        this.f44089a = iterable;
        this.f44090b = bArr;
    }
}