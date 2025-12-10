package com.google.android.datatransport;

import com.google.android.datatransport.EventContext;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.a */
/* loaded from: classes3.dex */
public final class C6214a extends EventContext {

    /* renamed from: a */
    public final String f43869a;

    /* renamed from: b */
    public final byte[] f43870b;

    /* renamed from: c */
    public final byte[] f43871c;

    /* renamed from: com.google.android.datatransport.a$b */
    /* loaded from: classes3.dex */
    public static final class C6216b extends EventContext.Builder {

        /* renamed from: a */
        public String f43872a;

        /* renamed from: b */
        public byte[] f43873b;

        /* renamed from: c */
        public byte[] f43874c;

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext build() {
            return new C6214a(this.f43872a, this.f43873b, this.f43874c);
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setExperimentIdsClear(byte[] bArr) {
            this.f43873b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setExperimentIdsEncrypted(byte[] bArr) {
            this.f43874c = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setPseudonymousId(String str) {
            this.f43872a = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        byte[] experimentIdsClear;
        byte[] experimentIdsEncrypted;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventContext)) {
            return false;
        }
        EventContext eventContext = (EventContext) obj;
        String str = this.f43869a;
        if (str != null ? str.equals(eventContext.getPseudonymousId()) : eventContext.getPseudonymousId() == null) {
            byte[] bArr = this.f43870b;
            boolean z = eventContext instanceof C6214a;
            if (z) {
                experimentIdsClear = ((C6214a) eventContext).f43870b;
            } else {
                experimentIdsClear = eventContext.getExperimentIdsClear();
            }
            if (Arrays.equals(bArr, experimentIdsClear)) {
                byte[] bArr2 = this.f43871c;
                if (z) {
                    experimentIdsEncrypted = ((C6214a) eventContext).f43871c;
                } else {
                    experimentIdsEncrypted = eventContext.getExperimentIdsEncrypted();
                }
                if (Arrays.equals(bArr2, experimentIdsEncrypted)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.EventContext
    public byte[] getExperimentIdsClear() {
        return this.f43870b;
    }

    @Override // com.google.android.datatransport.EventContext
    public byte[] getExperimentIdsEncrypted() {
        return this.f43871c;
    }

    @Override // com.google.android.datatransport.EventContext
    public String getPseudonymousId() {
        return this.f43869a;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f43869a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f43870b)) * 1000003) ^ Arrays.hashCode(this.f43871c);
    }

    public String toString() {
        return "EventContext{pseudonymousId=" + this.f43869a + ", experimentIdsClear=" + Arrays.toString(this.f43870b) + ", experimentIdsEncrypted=" + Arrays.toString(this.f43871c) + "}";
    }

    public C6214a(String str, byte[] bArr, byte[] bArr2) {
        this.f43869a = str;
        this.f43870b = bArr;
        this.f43871c = bArr2;
    }
}
