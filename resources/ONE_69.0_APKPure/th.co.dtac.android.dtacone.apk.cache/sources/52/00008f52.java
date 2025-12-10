package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class zzhk {

    /* renamed from: a */
    public long f45854a = -1;

    /* renamed from: b */
    public String f45855b;

    /* renamed from: c */
    public String f45856c;

    /* renamed from: d */
    public zzjq f45857d;

    public abstract void addHeader(String str, String str2) throws IOException;

    public final String getContentEncoding() {
        return this.f45855b;
    }

    public final long getContentLength() {
        return this.f45854a;
    }

    public final String getContentType() {
        return this.f45856c;
    }

    public final void setContentEncoding(String str) throws IOException {
        this.f45855b = str;
    }

    public final void setContentLength(long j) throws IOException {
        this.f45854a = j;
    }

    public final void setContentType(String str) throws IOException {
        this.f45856c = str;
    }

    public void zza(int i, int i2) throws IOException {
    }

    public final zzjq zzgr() {
        return this.f45857d;
    }

    public abstract zzhj zzgs() throws IOException;

    public final void zza(zzjq zzjqVar) throws IOException {
        this.f45857d = zzjqVar;
    }
}