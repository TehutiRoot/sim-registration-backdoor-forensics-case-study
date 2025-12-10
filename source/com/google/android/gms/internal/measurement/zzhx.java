package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class zzhx {

    /* renamed from: a */
    public final String f46299a;

    /* renamed from: b */
    public final Uri f46300b;

    /* renamed from: c */
    public final String f46301c;

    /* renamed from: d */
    public final String f46302d;

    /* renamed from: e */
    public final boolean f46303e;

    /* renamed from: f */
    public final boolean f46304f;

    /* renamed from: g */
    public final boolean f46305g;

    /* renamed from: h */
    public final boolean f46306h;

    /* renamed from: i */
    public final zzie f46307i;

    public zzhx(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, zzie zzieVar) {
        this.f46299a = null;
        this.f46300b = uri;
        this.f46301c = "";
        this.f46302d = "";
        this.f46303e = z;
        this.f46304f = false;
        this.f46305g = z3;
        this.f46306h = false;
        this.f46307i = null;
    }

    public final zzhx zza() {
        return new zzhx(null, this.f46300b, this.f46301c, this.f46302d, this.f46303e, false, true, false, null);
    }

    public final zzhx zzb() {
        if (this.f46301c.isEmpty()) {
            return new zzhx(null, this.f46300b, this.f46301c, this.f46302d, true, false, this.f46305g, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzia zzc(String str, double d) {
        return new Jv2(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final zzia zzd(String str, long j) {
        return new C22874wv2(this, str, Long.valueOf(j), true);
    }

    public final zzia zze(String str, String str2) {
        return new Pv2(this, str, str2, true);
    }

    public final zzia zzf(String str, boolean z) {
        return new C23046xv2(this, str, Boolean.valueOf(z), true);
    }

    public zzhx(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
