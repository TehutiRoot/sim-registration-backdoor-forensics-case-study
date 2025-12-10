package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public final class zzv {

    /* renamed from: a */
    public final String f47260a;

    /* renamed from: b */
    public final XJ2 f47261b;

    /* renamed from: c */
    public XJ2 f47262c;

    public /* synthetic */ zzv(String str, AbstractC22086sJ2 abstractC22086sJ2) {
        XJ2 xj2 = new XJ2(null);
        this.f47261b = xj2;
        this.f47262c = xj2;
        this.f47260a = str;
    }

    /* renamed from: a */
    public final zzv m46725a(String str, Object obj) {
        IJ2 ij2 = new IJ2(null);
        this.f47262c.f7454c = ij2;
        this.f47262c = ij2;
        ij2.f7453b = obj;
        ij2.f7452a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f47260a);
        sb.append('{');
        XJ2 xj2 = this.f47261b.f7454c;
        String str = "";
        while (xj2 != null) {
            Object obj = xj2.f7453b;
            sb.append(str);
            String str2 = xj2.f7452a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb.append(obj);
            }
            xj2 = xj2.f7454c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzv zza(String str, float f) {
        m46725a(str, String.valueOf(f));
        return this;
    }

    public final zzv zzb(String str, int i) {
        m46725a(str, String.valueOf(i));
        return this;
    }

    public final zzv zzc(String str, @CheckForNull Object obj) {
        XJ2 xj2 = new XJ2(null);
        this.f47262c.f7454c = xj2;
        this.f47262c = xj2;
        xj2.f7453b = obj;
        xj2.f7452a = str;
        return this;
    }

    public final zzv zzd(String str, boolean z) {
        m46725a("trackingEnabled", String.valueOf(z));
        return this;
    }
}
