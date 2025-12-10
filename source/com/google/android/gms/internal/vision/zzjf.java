package com.google.android.gms.internal.vision;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class zzjf {

    /* renamed from: a */
    public static final Charset f47644a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Charset f47645b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final ByteBuffer f47646c;

    /* renamed from: d */
    public static final zzif f47647d;
    public static final byte[] zzb;

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        f47646c = ByteBuffer.wrap(bArr);
        f47647d = zzif.m46445a(bArr, 0, bArr.length, false);
    }

    /* renamed from: a */
    public static int m46422a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: b */
    public static Object m46421b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m46420c(Object obj, Object obj2) {
        return ((zzkk) obj).zzp().zza((zzkk) obj2).zze();
    }

    /* renamed from: d */
    public static Object m46419d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    public static boolean m46418e(zzkk zzkkVar) {
        boolean z = zzkkVar instanceof zzhh;
        return false;
    }

    public static int zza(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static String zzb(byte[] bArr) {
        return new String(bArr, f47644a);
    }

    public static int zzc(byte[] bArr) {
        int length = bArr.length;
        int m46422a = m46422a(length, bArr, 0, length);
        if (m46422a == 0) {
            return 1;
        }
        return m46422a;
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static boolean zza(byte[] bArr) {
        return AbstractC6621F.m46602f(bArr);
    }
}
