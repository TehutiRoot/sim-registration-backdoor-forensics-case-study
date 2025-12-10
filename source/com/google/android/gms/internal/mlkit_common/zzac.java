package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzac extends AL2 {
    public zzac() {
        super(4);
    }

    public final zzac zzb(Object obj) {
        obj.getClass();
        int i = this.f87b + 1;
        Object[] objArr = this.f86a;
        int length = objArr.length;
        if (length < i) {
            this.f86a = Arrays.copyOf(objArr, zzaa.m47141a(length, i));
            this.f88c = false;
        } else if (this.f88c) {
            this.f86a = (Object[]) objArr.clone();
            this.f88c = false;
        }
        Object[] objArr2 = this.f86a;
        int i2 = this.f87b;
        this.f87b = i2 + 1;
        objArr2[i2] = obj;
        return this;
    }

    public final zzaf zzc() {
        this.f88c = true;
        return zzaf.zzg(this.f86a, this.f87b);
    }
}
