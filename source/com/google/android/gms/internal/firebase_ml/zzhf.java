package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzhf {

    /* renamed from: a */
    public int f45835a;

    /* renamed from: b */
    public String f45836b;

    /* renamed from: c */
    public zzgx f45837c;

    /* renamed from: d */
    public String f45838d;

    /* renamed from: e */
    public String f45839e;

    public zzhf(int i, String str, zzgx zzgxVar) {
        zzml.checkArgument(i >= 0);
        this.f45835a = i;
        this.f45836b = str;
        this.f45837c = (zzgx) zzml.checkNotNull(zzgxVar);
    }

    public final zzhf zzah(String str) {
        this.f45839e = str;
        return this;
    }

    public final zzhf zzai(String str) {
        this.f45838d = str;
        return this;
    }

    public zzhf(zzhd zzhdVar) {
        this(zzhdVar.getStatusCode(), zzhdVar.getStatusMessage(), zzhdVar.zzgg());
        try {
            String zzgn = zzhdVar.zzgn();
            this.f45838d = zzgn;
            if (zzgn.length() == 0) {
                this.f45838d = null;
            }
        } catch (IOException e) {
            zznf.zzb(e);
        }
        StringBuilder zzc = zzhg.zzc(zzhdVar);
        if (this.f45838d != null) {
            zzc.append(zzjt.zzajh);
            zzc.append(this.f45838d);
        }
        this.f45839e = zzc.toString();
    }
}
