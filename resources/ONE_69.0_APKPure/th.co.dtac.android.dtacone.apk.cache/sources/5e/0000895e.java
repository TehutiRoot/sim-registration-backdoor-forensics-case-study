package com.google.android.datatransport;

import com.google.android.datatransport.EventContext;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.a */
/* loaded from: classes3.dex */
public final class C6203a extends EventContext {

    /* renamed from: a */
    public final String f43881a;

    /* renamed from: b */
    public final byte[] f43882b;

    /* renamed from: c */
    public final byte[] f43883c;

    /* renamed from: com.google.android.datatransport.a$b */
    /* loaded from: classes3.dex */
    public static final class C6205b extends EventContext.Builder {

        /* renamed from: a */
        public String f43884a;

        /* renamed from: b */
        public byte[] f43885b;

        /* renamed from: c */
        public byte[] f43886c;

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext build() {
            return new C6203a(this.f43884a, this.f43885b, this.f43886c);
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setExperimentIdsClear(byte[] bArr) {
            this.f43885b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setExperimentIdsEncrypted(byte[] bArr) {
            this.f43886c = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.EventContext.Builder
        public EventContext.Builder setPseudonymousId(String str) {
            this.f43884a = str;
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
        String str = this.f43881a;
        if (str != null ? str.equals(eventContext.getPseudonymousId()) : eventContext.getPseudonymousId() == null) {
            byte[] bArr = this.f43882b;
            boolean z = eventContext instanceof C6203a;
            if (z) {
                experimentIdsClear = ((C6203a) eventContext).f43882b;
            } else {
                experimentIdsClear = eventContext.getExperimentIdsClear();
            }
            if (Arrays.equals(bArr, experimentIdsClear)) {
                byte[] bArr2 = this.f43883c;
                if (z) {
                    experimentIdsEncrypted = ((C6203a) eventContext).f43883c;
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
        return this.f43882b;
    }

    @Override // com.google.android.datatransport.EventContext
    public byte[] getExperimentIdsEncrypted() {
        return this.f43883c;
    }

    @Override // com.google.android.datatransport.EventContext
    public String getPseudonymousId() {
        return this.f43881a;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f43881a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f43882b)) * 1000003) ^ Arrays.hashCode(this.f43883c);
    }

    public String toString() {
        return "EventContext{pseudonymousId=" + this.f43881a + ", experimentIdsClear=" + Arrays.toString(this.f43882b) + ", experimentIdsEncrypted=" + Arrays.toString(this.f43883c) + "}";
    }

    public C6203a(String str, byte[] bArr, byte[] bArr2) {
        this.f43881a = str;
        this.f43882b = bArr;
        this.f43883c = bArr2;
    }
}