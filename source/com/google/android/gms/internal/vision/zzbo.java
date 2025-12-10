package com.google.android.gms.internal.vision;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class zzbo {

    /* renamed from: a */
    public final String f47580a;

    /* renamed from: b */
    public final Uri f47581b;

    /* renamed from: c */
    public final String f47582c;

    /* renamed from: d */
    public final String f47583d;

    /* renamed from: e */
    public final boolean f47584e;

    /* renamed from: f */
    public final boolean f47585f;

    /* renamed from: g */
    public final boolean f47586g;

    /* renamed from: h */
    public final boolean f47587h;

    /* renamed from: i */
    public final zzcw f47588i;

    public zzbo(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final zzbo zza(String str) {
        boolean z = this.f47584e;
        if (!z) {
            return new zzbo(this.f47580a, this.f47581b, str, this.f47583d, z, this.f47585f, this.f47586g, this.f47587h, this.f47588i);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public zzbo(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, zzcw zzcwVar) {
        this.f47580a = str;
        this.f47581b = uri;
        this.f47582c = str2;
        this.f47583d = str3;
        this.f47584e = z;
        this.f47585f = z2;
        this.f47586g = z3;
        this.f47587h = z4;
        this.f47588i = zzcwVar;
    }

    public final <T> zzbi<T> zza(String str, T t, zzbp<T> zzbpVar) {
        zzbi<T> m46554f;
        m46554f = zzbi.m46554f(this, str, t, zzbpVar, true);
        return m46554f;
    }
}
