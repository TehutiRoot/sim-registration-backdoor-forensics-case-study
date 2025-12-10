package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzab {

    /* renamed from: a */
    public zzaa f46228a;

    /* renamed from: b */
    public zzaa f46229b;

    /* renamed from: c */
    public final List f46230c;

    public zzab() {
        this.f46228a = new zzaa("", 0L, null);
        this.f46229b = new zzaa("", 0L, null);
        this.f46230c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzab zzabVar = new zzab(this.f46228a.clone());
        for (zzaa zzaaVar : this.f46230c) {
            zzabVar.f46230c.add(zzaaVar.clone());
        }
        return zzabVar;
    }

    public final zzaa zza() {
        return this.f46228a;
    }

    public final zzaa zzb() {
        return this.f46229b;
    }

    public final List zzc() {
        return this.f46230c;
    }

    public final void zzd(zzaa zzaaVar) {
        this.f46228a = zzaaVar;
        this.f46229b = zzaaVar.clone();
        this.f46230c.clear();
    }

    public final void zze(String str, long j, Map map) {
        this.f46230c.add(new zzaa(str, j, map));
    }

    public final void zzf(zzaa zzaaVar) {
        this.f46229b = zzaaVar;
    }

    public zzab(zzaa zzaaVar) {
        this.f46228a = zzaaVar;
        this.f46229b = zzaaVar.clone();
        this.f46230c = new ArrayList();
    }
}
