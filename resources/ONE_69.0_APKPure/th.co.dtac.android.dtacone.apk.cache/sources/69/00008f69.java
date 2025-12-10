package com.google.android.gms.internal.firebase_ml;

import kotlin.p023io.encoding.Base64;

/* loaded from: classes3.dex */
public abstract class zzip {

    /* renamed from: a */
    public final byte f45889a;

    /* renamed from: b */
    public final int f45890b;

    /* renamed from: c */
    public final int f45891c;

    /* renamed from: d */
    public final int f45892d;
    protected final byte zzagx;
    protected final int zzaha;

    public zzip(int i, int i2, int i3, int i4) {
        this(3, 4, i3, i4, Base64.padSymbol);
    }

    public static byte[] zza(int i, Ty2 ty2) {
        byte[] bArr = ty2.f6470b;
        if (bArr == null || bArr.length < ty2.f6471c + i) {
            if (bArr == null) {
                ty2.f6470b = new byte[8192];
                ty2.f6471c = 0;
                ty2.f6472d = 0;
            } else {
                byte[] bArr2 = new byte[bArr.length << 1];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                ty2.f6470b = bArr2;
            }
            return ty2.f6470b;
        }
        return bArr;
    }

    /* renamed from: a */
    public abstract void mo47904a(byte[] bArr, int i, int i2, Ty2 ty2);

    public abstract boolean zza(byte b);

    public final long zzc(byte[] bArr) {
        int length = bArr.length;
        int i = this.f45890b;
        long j = (((length + i) - 1) / i) * this.f45891c;
        int i2 = this.zzaha;
        if (i2 > 0) {
            return j + ((((i2 + j) - 1) / i2) * this.f45892d);
        }
        return j;
    }

    public zzip(int i, int i2, int i3, int i4, byte b) {
        this.f45889a = Base64.padSymbol;
        this.f45890b = 3;
        this.f45891c = 4;
        this.zzaha = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / 4) << 2;
        this.f45892d = i4;
        this.zzagx = Base64.padSymbol;
    }
}