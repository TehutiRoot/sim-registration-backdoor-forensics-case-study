package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.runtime.c */
/* loaded from: classes3.dex */
public final class C6263c extends TransportContext {

    /* renamed from: a */
    public final String f44095a;

    /* renamed from: b */
    public final byte[] f44096b;

    /* renamed from: c */
    public final Priority f44097c;

    /* renamed from: com.google.android.datatransport.runtime.c$b */
    /* loaded from: classes3.dex */
    public static final class C6265b extends TransportContext.Builder {

        /* renamed from: a */
        public String f44098a;

        /* renamed from: b */
        public byte[] f44099b;

        /* renamed from: c */
        public Priority f44100c;

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext build() {
            String str = "";
            if (this.f44098a == null) {
                str = " backendName";
            }
            if (this.f44100c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C6263c(this.f44098a, this.f44099b, this.f44100c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setBackendName(String str) {
            if (str != null) {
                this.f44098a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setExtras(byte[] bArr) {
            this.f44099b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setPriority(Priority priority) {
            if (priority != null) {
                this.f44100c = priority;
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
        if (this.f44095a.equals(transportContext.getBackendName())) {
            byte[] bArr = this.f44096b;
            if (transportContext instanceof C6263c) {
                extras = ((C6263c) transportContext).f44096b;
            } else {
                extras = transportContext.getExtras();
            }
            if (Arrays.equals(bArr, extras) && this.f44097c.equals(transportContext.getPriority())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public String getBackendName() {
        return this.f44095a;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public byte[] getExtras() {
        return this.f44096b;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public Priority getPriority() {
        return this.f44097c;
    }

    public int hashCode() {
        return ((((this.f44095a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f44096b)) * 1000003) ^ this.f44097c.hashCode();
    }

    public C6263c(String str, byte[] bArr, Priority priority) {
        this.f44095a = str;
        this.f44096b = bArr;
        this.f44097c = priority;
    }
}