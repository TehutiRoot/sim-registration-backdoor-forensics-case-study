package com.google.android.gms.internal.firebase_ml;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class zzxl {

    /* renamed from: a */
    public static final Charset f46112a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Charset f46113b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final ByteBuffer f46114c;

    /* renamed from: d */
    public static final zzwp f46115d;
    public static final byte[] zzcpk;

    static {
        byte[] bArr = new byte[0];
        zzcpk = bArr;
        f46114c = ByteBuffer.wrap(bArr);
        f46115d = zzwp.m47443a(bArr, 0, bArr.length, false);
    }

    /* renamed from: a */
    public static Object m47422a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: b */
    public static Object m47421b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: c */
    public static int m47420c(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: d */
    public static Object m47419d(Object obj, Object obj2) {
        return ((zzys) obj).zzvf().zza((zzys) obj2).zzvm();
    }

    /* renamed from: e */
    public static boolean m47418e(zzys zzysVar) {
        boolean z = zzysVar instanceof zzvv;
        return false;
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int m47420c = m47420c(length, bArr, 0, length);
        if (m47420c == 0) {
            return 1;
        }
        return m47420c;
    }

    public static int zzaf(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int zzaz(boolean z) {
        return z ? 1231 : 1237;
    }

    public static boolean zzi(byte[] bArr) {
        return AbstractC6464b.m47966l(bArr);
    }

    public static String zzj(byte[] bArr) {
        return new String(bArr, f46112a);
    }
}
