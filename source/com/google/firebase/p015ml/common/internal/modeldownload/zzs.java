package com.google.firebase.p015ml.common.internal.modeldownload;

import androidx.annotation.Nullable;

/* renamed from: com.google.firebase.ml.common.internal.modeldownload.zzs */
/* loaded from: classes4.dex */
public final class zzs {
    public static final zzs zzboj = new zzs(zzr.OK, null);

    /* renamed from: a */
    public final zzr f55777a;

    /* renamed from: b */
    public final String f55778b;

    public zzs(zzr zzrVar, @Nullable String str) {
        this.f55777a = zzrVar;
        this.f55778b = str;
    }

    public final boolean isValid() {
        if (this.f55777a == zzr.OK) {
            return true;
        }
        return false;
    }

    public final zzr zzpj() {
        return this.f55777a;
    }
}
