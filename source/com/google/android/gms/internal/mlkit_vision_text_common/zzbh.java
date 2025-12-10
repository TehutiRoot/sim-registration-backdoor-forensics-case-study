package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzbh extends AbstractC18872Zd2 {
    public zzbh() {
        super(4);
    }

    public final zzbh zza(Object obj) {
        obj.getClass();
        int i = this.f8085b;
        int i2 = i + 1;
        Object[] objArr = this.f8084a;
        int length = objArr.length;
        if (length < i2) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.f8084a = Arrays.copyOf(objArr, i3);
            this.f8086c = false;
        } else if (this.f8086c) {
            this.f8084a = (Object[]) objArr.clone();
            this.f8086c = false;
        }
        Object[] objArr2 = this.f8084a;
        int i4 = this.f8085b;
        this.f8085b = i4 + 1;
        objArr2[i4] = obj;
        return this;
    }

    public final zzbk zzb() {
        this.f8086c = true;
        return zzbk.zzg(this.f8084a, this.f8085b);
    }
}
