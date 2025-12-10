package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ExperimentIds;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.cct.internal.d */
/* loaded from: classes3.dex */
public final class C6237d extends ExperimentIds {

    /* renamed from: a */
    public final byte[] f43962a;

    /* renamed from: b */
    public final byte[] f43963b;

    /* renamed from: com.google.android.datatransport.cct.internal.d$b */
    /* loaded from: classes3.dex */
    public static final class C6239b extends ExperimentIds.Builder {

        /* renamed from: a */
        public byte[] f43964a;

        /* renamed from: b */
        public byte[] f43965b;

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public ExperimentIds build() {
            return new C6237d(this.f43964a, this.f43965b);
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public ExperimentIds.Builder setClearBlob(byte[] bArr) {
            this.f43964a = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public ExperimentIds.Builder setEncryptedBlob(byte[] bArr) {
            this.f43965b = bArr;
            return this;
        }
    }

    public boolean equals(Object obj) {
        byte[] clearBlob;
        byte[] encryptedBlob;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExperimentIds)) {
            return false;
        }
        ExperimentIds experimentIds = (ExperimentIds) obj;
        byte[] bArr = this.f43962a;
        boolean z = experimentIds instanceof C6237d;
        if (z) {
            clearBlob = ((C6237d) experimentIds).f43962a;
        } else {
            clearBlob = experimentIds.getClearBlob();
        }
        if (Arrays.equals(bArr, clearBlob)) {
            byte[] bArr2 = this.f43963b;
            if (z) {
                encryptedBlob = ((C6237d) experimentIds).f43963b;
            } else {
                encryptedBlob = experimentIds.getEncryptedBlob();
            }
            if (Arrays.equals(bArr2, encryptedBlob)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    public byte[] getClearBlob() {
        return this.f43962a;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    public byte[] getEncryptedBlob() {
        return this.f43963b;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f43962a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f43963b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f43962a) + ", encryptedBlob=" + Arrays.toString(this.f43963b) + "}";
    }

    public C6237d(byte[] bArr, byte[] bArr2) {
        this.f43962a = bArr;
        this.f43963b = bArr2;
    }
}
