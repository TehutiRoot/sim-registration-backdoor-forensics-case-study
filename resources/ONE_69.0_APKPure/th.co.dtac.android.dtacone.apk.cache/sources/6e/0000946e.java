package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzah {

    /* renamed from: a */
    public Object[] f46405a = new Object[8];

    /* renamed from: b */
    public int f46406b = 0;

    /* renamed from: c */
    public C17292Ac2 f46407c;

    public final zzah zza(Object obj, Object obj2) {
        int i = this.f46406b + 1;
        Object[] objArr = this.f46405a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.f46405a = Arrays.copyOf(objArr, zzaa.m47150a(length, i2));
        }
        AbstractC22156sL2.m22821a(obj, obj2);
        Object[] objArr2 = this.f46405a;
        int i3 = this.f46406b;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.f46406b = i3 + 1;
        return this;
    }

    public final zzai zzb() {
        C17292Ac2 c17292Ac2 = this.f46407c;
        if (c17292Ac2 == null) {
            zzaq zzg = zzaq.zzg(this.f46406b, this.f46405a, this);
            C17292Ac2 c17292Ac22 = this.f46407c;
            if (c17292Ac22 == null) {
                return zzg;
            }
            throw c17292Ac22.m69213a();
        }
        throw c17292Ac2.m69213a();
    }
}