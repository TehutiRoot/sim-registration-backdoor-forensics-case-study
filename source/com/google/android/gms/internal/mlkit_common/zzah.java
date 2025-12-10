package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzah {

    /* renamed from: a */
    public Object[] f46393a = new Object[8];

    /* renamed from: b */
    public int f46394b = 0;

    /* renamed from: c */
    public C17458Db2 f46395c;

    public final zzah zza(Object obj, Object obj2) {
        int i = this.f46394b + 1;
        Object[] objArr = this.f46393a;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.f46393a = Arrays.copyOf(objArr, zzaa.m47141a(length, i2));
        }
        AbstractC22605vK2.m1049a(obj, obj2);
        Object[] objArr2 = this.f46393a;
        int i3 = this.f46394b;
        int i4 = i3 + i3;
        objArr2[i4] = obj;
        objArr2[i4 + 1] = obj2;
        this.f46394b = i3 + 1;
        return this;
    }

    public final zzai zzb() {
        C17458Db2 c17458Db2 = this.f46395c;
        if (c17458Db2 == null) {
            zzaq zzg = zzaq.zzg(this.f46394b, this.f46393a, this);
            C17458Db2 c17458Db22 = this.f46395c;
            if (c17458Db22 == null) {
                return zzg;
            }
            throw c17458Db22.m68598a();
        }
        throw c17458Db2.m68598a();
    }
}
