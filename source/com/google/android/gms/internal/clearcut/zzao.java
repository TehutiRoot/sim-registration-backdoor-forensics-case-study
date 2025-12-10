package com.google.android.gms.internal.clearcut;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class zzao {

    /* renamed from: a */
    public final String f45525a;

    /* renamed from: b */
    public final Uri f45526b;

    /* renamed from: c */
    public final String f45527c;

    /* renamed from: d */
    public final String f45528d;

    /* renamed from: e */
    public final boolean f45529e;

    /* renamed from: f */
    public final boolean f45530f;

    public zzao(Uri uri) {
        this(null, uri, "", "", false, false);
    }

    public final <T> zzae<T> zza(String str, T t, zzan<T> zzanVar) {
        return zzae.m48197f(this, str, t, zzanVar);
    }

    public final zzae<Boolean> zzc(String str, boolean z) {
        return zzae.m48195h(this, str, false);
    }

    public final zzao zzd(String str) {
        return new zzao(this.f45525a, this.f45526b, this.f45527c, str, this.f45529e, this.f45530f);
    }

    public zzao(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.f45525a = str;
        this.f45526b = uri;
        this.f45527c = str2;
        this.f45528d = str3;
        this.f45529e = z;
        this.f45530f = z2;
    }

    public final zzae<String> zza(String str, String str2) {
        return zzae.m48196g(this, str, null);
    }

    public final zzao zzc(String str) {
        boolean z = this.f45529e;
        if (z) {
            throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        return new zzao(this.f45525a, this.f45526b, str, this.f45528d, z, this.f45530f);
    }
}
