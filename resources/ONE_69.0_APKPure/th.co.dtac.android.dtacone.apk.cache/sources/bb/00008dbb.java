package com.google.android.gms.internal.clearcut;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class zzao {

    /* renamed from: a */
    public final String f45537a;

    /* renamed from: b */
    public final Uri f45538b;

    /* renamed from: c */
    public final String f45539c;

    /* renamed from: d */
    public final String f45540d;

    /* renamed from: e */
    public final boolean f45541e;

    /* renamed from: f */
    public final boolean f45542f;

    public zzao(Uri uri) {
        this(null, uri, "", "", false, false);
    }

    public final <T> zzae<T> zza(String str, T t, zzan<T> zzanVar) {
        return zzae.m48194f(this, str, t, zzanVar);
    }

    public final zzae<Boolean> zzc(String str, boolean z) {
        return zzae.m48192h(this, str, false);
    }

    public final zzao zzd(String str) {
        return new zzao(this.f45537a, this.f45538b, this.f45539c, str, this.f45541e, this.f45542f);
    }

    public zzao(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.f45537a = str;
        this.f45538b = uri;
        this.f45539c = str2;
        this.f45540d = str3;
        this.f45541e = z;
        this.f45542f = z2;
    }

    public final zzae<String> zza(String str, String str2) {
        return zzae.m48193g(this, str, null);
    }

    public final zzao zzc(String str) {
        boolean z = this.f45541e;
        if (z) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new zzao(this.f45537a, this.f45538b, str, this.f45540d, z, this.f45542f);
    }
}