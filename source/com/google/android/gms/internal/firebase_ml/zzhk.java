package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class zzhk {

    /* renamed from: a */
    public long f45842a = -1;

    /* renamed from: b */
    public String f45843b;

    /* renamed from: c */
    public String f45844c;

    /* renamed from: d */
    public zzjq f45845d;

    public abstract void addHeader(String str, String str2) throws IOException;

    public final String getContentEncoding() {
        return this.f45843b;
    }

    public final long getContentLength() {
        return this.f45842a;
    }

    public final String getContentType() {
        return this.f45844c;
    }

    public final void setContentEncoding(String str) throws IOException {
        this.f45843b = str;
    }

    public final void setContentLength(long j) throws IOException {
        this.f45842a = j;
    }

    public final void setContentType(String str) throws IOException {
        this.f45844c = str;
    }

    public void zza(int i, int i2) throws IOException {
    }

    public final zzjq zzgr() {
        return this.f45845d;
    }

    public abstract zzhj zzgs() throws IOException;

    public final void zza(zzjq zzjqVar) throws IOException {
        this.f45845d = zzjqVar;
    }
}
