package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.runtime.c */
/* loaded from: classes3.dex */
public final class C6274c extends TransportContext {

    /* renamed from: a */
    public final String f44083a;

    /* renamed from: b */
    public final byte[] f44084b;

    /* renamed from: c */
    public final Priority f44085c;

    /* renamed from: com.google.android.datatransport.runtime.c$b */
    /* loaded from: classes3.dex */
    public static final class C6276b extends TransportContext.Builder {

        /* renamed from: a */
        public String f44086a;

        /* renamed from: b */
        public byte[] f44087b;

        /* renamed from: c */
        public Priority f44088c;

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext build() {
            String str = "";
            if (this.f44086a == null) {
                str = " backendName";
            }
            if (this.f44088c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C6274c(this.f44086a, this.f44087b, this.f44088c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setBackendName(String str) {
            if (str != null) {
                this.f44086a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setExtras(byte[] bArr) {
            this.f44087b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setPriority(Priority priority) {
            if (priority != null) {
                this.f44088c = priority;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }

    public boolean equals(Object obj) {
        byte[] extras;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransportContext)) {
            return false;
        }
        TransportContext transportContext = (TransportContext) obj;
        if (this.f44083a.equals(transportContext.getBackendName())) {
            byte[] bArr = this.f44084b;
            if (transportContext instanceof C6274c) {
                extras = ((C6274c) transportContext).f44084b;
            } else {
                extras = transportContext.getExtras();
            }
            if (Arrays.equals(bArr, extras) && this.f44085c.equals(transportContext.getPriority())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public String getBackendName() {
        return this.f44083a;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public byte[] getExtras() {
        return this.f44084b;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public Priority getPriority() {
        return this.f44085c;
    }

    public int hashCode() {
        return ((((this.f44083a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f44084b)) * 1000003) ^ this.f44085c.hashCode();
    }

    public C6274c(String str, byte[] bArr, Priority priority) {
        this.f44083a = str;
        this.f44084b = bArr;
        this.f44085c = priority;
    }
}
