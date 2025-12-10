package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class zzar {

    /* renamed from: a */
    public final String f48261a;

    /* renamed from: b */
    public final String f48262b;

    /* renamed from: c */
    public final String f48263c;

    /* renamed from: d */
    public final long f48264d;

    /* renamed from: e */
    public final long f48265e;

    /* renamed from: f */
    public final zzau f48266f;

    public zzar(zzfy zzfyVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzau zzauVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.f48261a = str2;
        this.f48262b = str3;
        this.f48263c = true == TextUtils.isEmpty(str) ? null : str;
        this.f48264d = j;
        this.f48265e = j2;
        if (j2 != 0 && j2 > j) {
            zzfyVar.zzay().zzk().zzb("Event created with reverse previous/current timestamps. appId", zzeo.zzn(str2));
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzfyVar.zzay().zzd().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object m46110b = zzfyVar.zzv().m46110b(next, bundle2.get(next));
                    if (m46110b == null) {
                        zzfyVar.zzay().zzk().zzb("Param value can't be null", zzfyVar.zzj().zze(next));
                        it.remove();
                    } else {
                        zzfyVar.zzv().m46100l(bundle2, next, m46110b);
                    }
                }
            }
            zzauVar = new zzau(bundle2);
        } else {
            zzauVar = new zzau(new Bundle());
        }
        this.f48266f = zzauVar;
    }

    /* renamed from: a */
    public final zzar m46346a(zzfy zzfyVar, long j) {
        return new zzar(zzfyVar, this.f48263c, this.f48261a, this.f48262b, this.f48264d, j, this.f48266f);
    }

    public final String toString() {
        String str = this.f48261a;
        String str2 = this.f48262b;
        String obj = this.f48266f.toString();
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + obj + "}";
    }

    public zzar(zzfy zzfyVar, String str, String str2, String str3, long j, long j2, zzau zzauVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzauVar);
        this.f48261a = str2;
        this.f48262b = str3;
        this.f48263c = true == TextUtils.isEmpty(str) ? null : str;
        this.f48264d = j;
        this.f48265e = j2;
        if (j2 != 0 && j2 > j) {
            zzfyVar.zzay().zzk().zzc("Event created with reverse previous/current timestamps. appId, name", zzeo.zzn(str2), zzeo.zzn(str3));
        }
        this.f48266f = zzauVar;
    }
}
