package com.google.mlkit.common.internal.model;

import com.google.mlkit.common.internal.model.ModelUtils;

/* renamed from: com.google.mlkit.common.internal.model.b */
/* loaded from: classes4.dex */
public final class C8817b extends ModelUtils.ModelLoggingInfo {

    /* renamed from: a */
    public final long f56874a;

    /* renamed from: b */
    public final String f56875b;

    /* renamed from: c */
    public final boolean f56876c;

    public C8817b(long j, String str, boolean z) {
        this.f56874a = j;
        this.f56875b = str;
        this.f56876c = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ModelUtils.ModelLoggingInfo) {
            ModelUtils.ModelLoggingInfo modelLoggingInfo = (ModelUtils.ModelLoggingInfo) obj;
            if (this.f56874a == modelLoggingInfo.getSize() && this.f56875b.equals(modelLoggingInfo.getHash()) && this.f56876c == modelLoggingInfo.isManifestModel()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    public String getHash() {
        return this.f56875b;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    public long getSize() {
        return this.f56874a;
    }

    public final int hashCode() {
        int i;
        long j = this.f56874a;
        int i2 = (int) (j ^ (j >>> 32));
        int hashCode = this.f56875b.hashCode() ^ ((i2 ^ 1000003) * 1000003);
        if (true != this.f56876c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo
    public boolean isManifestModel() {
        return this.f56876c;
    }

    public final String toString() {
        return "ModelLoggingInfo{size=" + this.f56874a + ", hash=" + this.f56875b + ", manifestModel=" + this.f56876c + "}";
    }
}
