package com.google.android.gms.internal.firebase_ml;

import kotlin.p023io.encoding.Base64;

/* loaded from: classes3.dex */
public abstract class zzip {

    /* renamed from: a */
    public final byte f45877a;

    /* renamed from: b */
    public final int f45878b;

    /* renamed from: c */
    public final int f45879c;

    /* renamed from: d */
    public final int f45880d;
    protected final byte zzagx;
    protected final int zzaha;

    public zzip(int i, int i2, int i3, int i4) {
        this(3, 4, i3, i4, Base64.padSymbol);
    }

    public static byte[] zza(int i, Wx2 wx2) {
        byte[] bArr = wx2.f7344b;
        if (bArr == null || bArr.length < wx2.f7345c + i) {
            if (bArr == null) {
                wx2.f7344b = new byte[8192];
                wx2.f7345c = 0;
                wx2.f7346d = 0;
            } else {
                byte[] bArr2 = new byte[bArr.length << 1];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                wx2.f7344b = bArr2;
            }
            return wx2.f7344b;
        }
        return bArr;
    }

    /* renamed from: a */
    public abstract void mo47895a(byte[] bArr, int i, int i2, Wx2 wx2);

    public abstract boolean zza(byte b);

    public final long zzc(byte[] bArr) {
        int length = bArr.length;
        int i = this.f45878b;
        long j = (((length + i) - 1) / i) * this.f45879c;
        int i2 = this.zzaha;
        if (i2 > 0) {
            return j + ((((i2 + j) - 1) / i2) * this.f45880d);
        }
        return j;
    }

    public zzip(int i, int i2, int i3, int i4, byte b) {
        this.f45877a = Base64.padSymbol;
        this.f45878b = 3;
        this.f45879c = 4;
        this.zzaha = (i3 <= 0 || i4 <= 0) ? 0 : (i3 / 4) << 2;
        this.f45880d = i4;
        this.zzagx = Base64.padSymbol;
    }
}
