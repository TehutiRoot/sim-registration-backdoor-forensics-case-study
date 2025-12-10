package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzab {

    /* renamed from: a */
    public zzaa f46240a;

    /* renamed from: b */
    public zzaa f46241b;

    /* renamed from: c */
    public final List f46242c;

    public zzab() {
        this.f46240a = new zzaa("", 0L, null);
        this.f46241b = new zzaa("", 0L, null);
        this.f46242c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzab zzabVar = new zzab(this.f46240a.clone());
        for (zzaa zzaaVar : this.f46242c) {
            zzabVar.f46242c.add(zzaaVar.clone());
        }
        return zzabVar;
    }

    public final zzaa zza() {
        return this.f46240a;
    }

    public final zzaa zzb() {
        return this.f46241b;
    }

    public final List zzc() {
        return this.f46242c;
    }

    public final void zzd(zzaa zzaaVar) {
        this.f46240a = zzaaVar;
        this.f46241b = zzaaVar.clone();
        this.f46242c.clear();
    }

    public final void zze(String str, long j, Map map) {
        this.f46242c.add(new zzaa(str, j, map));
    }

    public final void zzf(zzaa zzaaVar) {
        this.f46241b = zzaaVar;
    }

    public zzab(zzaa zzaaVar) {
        this.f46240a = zzaaVar;
        this.f46241b = zzaaVar.clone();
        this.f46242c = new ArrayList();
    }
}