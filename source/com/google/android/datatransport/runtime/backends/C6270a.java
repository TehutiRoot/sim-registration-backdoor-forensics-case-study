package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendRequest;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.runtime.backends.a */
/* loaded from: classes3.dex */
public final class C6270a extends BackendRequest {

    /* renamed from: a */
    public final Iterable f44077a;

    /* renamed from: b */
    public final byte[] f44078b;

    /* renamed from: com.google.android.datatransport.runtime.backends.a$b */
    /* loaded from: classes3.dex */
    public static final class C6272b extends BackendRequest.Builder {

        /* renamed from: a */
        public Iterable f44079a;

        /* renamed from: b */
        public byte[] f44080b;

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest build() {
            String str = "";
            if (this.f44079a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C6270a(this.f44079a, this.f44080b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest.Builder setEvents(Iterable iterable) {
            if (iterable != null) {
                this.f44079a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // com.google.android.datatransport.runtime.backends.BackendRequest.Builder
        public BackendRequest.Builder setExtras(byte[] bArr) {
            this.f44080b = bArr;
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
        if (this.f44077a.equals(backendRequest.getEvents())) {
            byte[] bArr = this.f44078b;
            if (backendRequest instanceof C6270a) {
                extras = ((C6270a) backendRequest).f44078b;
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
        return this.f44077a;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRequest
    public byte[] getExtras() {
        return this.f44078b;
    }

    public int hashCode() {
        return ((this.f44077a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f44078b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f44077a + ", extras=" + Arrays.toString(this.f44078b) + "}";
    }

    public C6270a(Iterable iterable, byte[] bArr) {
        this.f44077a = iterable;
        this.f44078b = bArr;
    }
}
