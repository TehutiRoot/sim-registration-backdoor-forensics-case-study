package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.ExperimentIds;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.cct.internal.d */
/* loaded from: classes3.dex */
public final class C6226d extends ExperimentIds {

    /* renamed from: a */
    public final byte[] f43974a;

    /* renamed from: b */
    public final byte[] f43975b;

    /* renamed from: com.google.android.datatransport.cct.internal.d$b */
    /* loaded from: classes3.dex */
    public static final class C6228b extends ExperimentIds.Builder {

        /* renamed from: a */
        public byte[] f43976a;

        /* renamed from: b */
        public byte[] f43977b;

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public ExperimentIds build() {
            return new C6226d(this.f43976a, this.f43977b);
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public ExperimentIds.Builder setClearBlob(byte[] bArr) {
            this.f43976a = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.internal.ExperimentIds.Builder
        public ExperimentIds.Builder setEncryptedBlob(byte[] bArr) {
            this.f43977b = bArr;
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
        byte[] bArr = this.f43974a;
        boolean z = experimentIds instanceof C6226d;
        if (z) {
            clearBlob = ((C6226d) experimentIds).f43974a;
        } else {
            clearBlob = experimentIds.getClearBlob();
        }
        if (Arrays.equals(bArr, clearBlob)) {
            byte[] bArr2 = this.f43975b;
            if (z) {
                encryptedBlob = ((C6226d) experimentIds).f43975b;
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
        return this.f43974a;
    }

    @Override // com.google.android.datatransport.cct.internal.ExperimentIds
    public byte[] getEncryptedBlob() {
        return this.f43975b;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f43974a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f43975b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f43974a) + ", encryptedBlob=" + Arrays.toString(this.f43975b) + "}";
    }

    public C6226d(byte[] bArr, byte[] bArr2) {
        this.f43974a = bArr;
        this.f43975b = bArr2;
    }
}