package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class zzci {

    /* renamed from: a */
    public static final Charset f45573a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Charset f45574b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final ByteBuffer f45575c;

    /* renamed from: d */
    public static final zzbk f45576d;
    public static final byte[] zzkt;

    static {
        byte[] bArr = new byte[0];
        zzkt = bArr;
        f45575c = ByteBuffer.wrap(bArr);
        f45576d = zzbk.m48182a(bArr, 0, bArr.length, false);
    }

    /* renamed from: a */
    public static Object m48160a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: b */
    public static int m48159b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: c */
    public static Object m48158c(Object obj, Object obj2) {
        return ((zzdo) obj).zzbc().zza((zzdo) obj2).zzbi();
    }

    /* renamed from: d */
    public static Object m48157d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    public static boolean m48156e(zzdo zzdoVar) {
        return false;
    }

    public static int hashCode(byte[] bArr) {
        int length = bArr.length;
        int m48159b = m48159b(length, bArr, 0, length);
        if (m48159b == 0) {
            return 1;
        }
        return m48159b;
    }

    public static int zzc(boolean z) {
        return z ? 1231 : 1237;
    }

    public static boolean zze(byte[] bArr) {
        return AbstractC6403k.m48223h(bArr);
    }

    public static String zzf(byte[] bArr) {
        return new String(bArr, f45573a);
    }

    public static int zzl(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
