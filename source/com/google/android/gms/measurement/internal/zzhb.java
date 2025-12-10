package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzhb {

    /* renamed from: a */
    public final Context f48398a;

    /* renamed from: b */
    public String f48399b;

    /* renamed from: c */
    public String f48400c;

    /* renamed from: d */
    public String f48401d;

    /* renamed from: e */
    public Boolean f48402e;

    /* renamed from: f */
    public long f48403f;

    /* renamed from: g */
    public com.google.android.gms.internal.measurement.zzcl f48404g;

    /* renamed from: h */
    public boolean f48405h;

    /* renamed from: i */
    public final Long f48406i;

    /* renamed from: j */
    public String f48407j;

    @VisibleForTesting
    public zzhb(Context context, @Nullable com.google.android.gms.internal.measurement.zzcl zzclVar, @Nullable Long l) {
        this.f48405h = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.f48398a = applicationContext;
        this.f48406i = l;
        if (zzclVar != null) {
            this.f48404g = zzclVar;
            this.f48399b = zzclVar.zzf;
            this.f48400c = zzclVar.zze;
            this.f48401d = zzclVar.zzd;
            this.f48405h = zzclVar.zzc;
            this.f48403f = zzclVar.zzb;
            this.f48407j = zzclVar.zzh;
            Bundle bundle = zzclVar.zzg;
            if (bundle != null) {
                this.f48402e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
