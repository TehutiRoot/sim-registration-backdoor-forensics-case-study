package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class zzem {

    /* renamed from: a */
    public static final Charset f46969a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f46970b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final Charset f46971c = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzdf zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i = zzdf.zza;
        C19567di2 c19567di2 = new C19567di2(bArr, 0, 0, false, null);
        try {
            c19567di2.m31792a(0);
            zzf = c19567di2;
        } catch (zzeo e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static int m46871a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: b */
    public static Object m46870b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, f46970b);
    }
}
