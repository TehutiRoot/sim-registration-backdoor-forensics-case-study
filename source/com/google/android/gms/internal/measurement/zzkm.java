package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class zzkm {

    /* renamed from: a */
    public static final Charset f46330a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f46331b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final Charset f46332c = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzjh zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i = zzjh.zza;
        Wz2 wz2 = new Wz2(bArr, 0, 0, false, null);
        try {
            wz2.m65546a(0);
            zzf = wz2;
        } catch (zzko e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m47153a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: b */
    public static Object m47152b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m47151c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static Object m47150d(Object obj, Object obj2) {
        return ((zzll) obj).zzbG().zzay((zzll) obj2).zzaG();
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        int m47153a = m47153a(length, bArr, 0, length);
        if (m47153a == 0) {
            return 1;
        }
        return m47153a;
    }

    public static int zzc(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, f46331b);
    }

    public static boolean zzi(byte[] bArr) {
        return AbstractC6534h.m47344e(bArr);
    }
}
