package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzg {

    /* renamed from: a */
    public final zzax f46271a;

    /* renamed from: b */
    public final Map f46272b = new HashMap();

    /* renamed from: c */
    public final Map f46273c = new HashMap();
    public final zzg zza;

    public zzg(zzg zzgVar, zzax zzaxVar) {
        this.zza = zzgVar;
        this.f46271a = zzaxVar;
    }

    public final zzg zza() {
        return new zzg(this, this.f46271a);
    }

    public final zzap zzb(zzap zzapVar) {
        return this.f46271a.zza(this, zzapVar);
    }

    public final zzap zzc(zzae zzaeVar) {
        zzap zzapVar = zzap.zzf;
        Iterator zzk = zzaeVar.zzk();
        while (zzk.hasNext()) {
            zzapVar = this.f46271a.zza(this, zzaeVar.zze(((Integer) zzk.next()).intValue()));
            if (zzapVar instanceof zzag) {
                break;
            }
        }
        return zzapVar;
    }

    public final zzap zzd(String str) {
        if (this.f46272b.containsKey(str)) {
            return (zzap) this.f46272b.get(str);
        }
        zzg zzgVar = this.zza;
        if (zzgVar != null) {
            return zzgVar.zzd(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    public final void zze(String str, zzap zzapVar) {
        if (this.f46273c.containsKey(str)) {
            return;
        }
        if (zzapVar == null) {
            this.f46272b.remove(str);
        } else {
            this.f46272b.put(str, zzapVar);
        }
    }

    public final void zzf(String str, zzap zzapVar) {
        zze(str, zzapVar);
        this.f46273c.put(str, Boolean.TRUE);
    }

    public final void zzg(String str, zzap zzapVar) {
        zzg zzgVar;
        if (!this.f46272b.containsKey(str) && (zzgVar = this.zza) != null && zzgVar.zzh(str)) {
            this.zza.zzg(str, zzapVar);
        } else if (this.f46273c.containsKey(str)) {
        } else {
            if (zzapVar == null) {
                this.f46272b.remove(str);
            } else {
                this.f46272b.put(str, zzapVar);
            }
        }
    }

    public final boolean zzh(String str) {
        if (this.f46272b.containsKey(str)) {
            return true;
        }
        zzg zzgVar = this.zza;
        if (zzgVar != null) {
            return zzgVar.zzh(str);
        }
        return false;
    }
}
