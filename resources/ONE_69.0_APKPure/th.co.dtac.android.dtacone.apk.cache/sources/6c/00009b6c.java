package com.google.android.gms.internal.vision;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class zzbo {

    /* renamed from: a */
    public final String f47592a;

    /* renamed from: b */
    public final Uri f47593b;

    /* renamed from: c */
    public final String f47594c;

    /* renamed from: d */
    public final String f47595d;

    /* renamed from: e */
    public final boolean f47596e;

    /* renamed from: f */
    public final boolean f47597f;

    /* renamed from: g */
    public final boolean f47598g;

    /* renamed from: h */
    public final boolean f47599h;

    /* renamed from: i */
    public final zzcw f47600i;

    public zzbo(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final zzbo zza(String str) {
        boolean z = this.f47596e;
        if (!z) {
            return new zzbo(this.f47592a, this.f47593b, str, this.f47595d, z, this.f47597f, this.f47598g, this.f47599h, this.f47600i);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public zzbo(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, zzcw zzcwVar) {
        this.f47592a = str;
        this.f47593b = uri;
        this.f47594c = str2;
        this.f47595d = str3;
        this.f47596e = z;
        this.f47597f = z2;
        this.f47598g = z3;
        this.f47599h = z4;
        this.f47600i = zzcwVar;
    }

    public final <T> zzbi<T> zza(String str, T t, zzbp<T> zzbpVar) {
        zzbi<T> m46540f;
        m46540f = zzbi.m46540f(this, str, t, zzbpVar, true);
        return m46540f;
    }
}