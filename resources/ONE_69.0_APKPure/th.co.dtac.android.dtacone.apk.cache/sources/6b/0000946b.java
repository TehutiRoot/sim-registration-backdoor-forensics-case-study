package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzac extends AbstractC23024xM2 {
    public zzac() {
        super(4);
    }

    public final zzac zzb(Object obj) {
        obj.getClass();
        int i = this.f108733b + 1;
        Object[] objArr = this.f108732a;
        int length = objArr.length;
        if (length < i) {
            this.f108732a = Arrays.copyOf(objArr, zzaa.m47150a(length, i));
            this.f108734c = false;
        } else if (this.f108734c) {
            this.f108732a = (Object[]) objArr.clone();
            this.f108734c = false;
        }
        Object[] objArr2 = this.f108732a;
        int i2 = this.f108733b;
        this.f108733b = i2 + 1;
        objArr2[i2] = obj;
        return this;
    }

    public final zzaf zzc() {
        this.f108734c = true;
        return zzaf.zzg(this.f108732a, this.f108733b);
    }
}