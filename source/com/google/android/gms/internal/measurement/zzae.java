package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes3.dex */
public final class zzae implements Iterable, zzap, zzal {

    /* renamed from: a */
    public final SortedMap f46231a;

    /* renamed from: b */
    public final Map f46232b;

    public zzae() {
        this.f46231a = new TreeMap();
        this.f46232b = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        if (zzc() != zzaeVar.zzc()) {
            return false;
        }
        if (this.f46231a.isEmpty()) {
            return zzaeVar.f46231a.isEmpty();
        }
        for (int intValue = ((Integer) this.f46231a.firstKey()).intValue(); intValue <= ((Integer) this.f46231a.lastKey()).intValue(); intValue++) {
            if (!zze(intValue).equals(zzaeVar.zze(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f46231a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C20406ib2(this);
    }

    public final String toString() {
        return zzj(",");
    }

    public final int zzb() {
        return this.f46231a.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbN(String str, zzg zzgVar, List list) {
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return zzaj.zza(this, new zzat(str), zzgVar, list);
        }
        return zzbb.zza(str, this, zzgVar, list);
    }

    public final int zzc() {
        if (this.f46231a.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f46231a.lastKey()).intValue() + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        zzae zzaeVar = new zzae();
        for (Map.Entry entry : this.f46231a.entrySet()) {
            if (entry.getValue() instanceof zzal) {
                zzaeVar.f46231a.put((Integer) entry.getKey(), (zzap) entry.getValue());
            } else {
                zzaeVar.f46231a.put((Integer) entry.getKey(), ((zzap) entry.getValue()).zzd());
            }
        }
        return zzaeVar;
    }

    public final zzap zze(int i) {
        zzap zzapVar;
        if (i < zzc()) {
            if (zzs(i) && (zzapVar = (zzap) this.f46231a.get(Integer.valueOf(i))) != null) {
                return zzapVar;
            }
            return zzap.zzf;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String str) {
        zzap zzapVar;
        if ("length".equals(str)) {
            return new zzah(Double.valueOf(zzc()));
        }
        if (zzt(str) && (zzapVar = (zzap) this.f46232b.get(str)) != null) {
            return zzapVar;
        }
        return zzap.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.f46231a.size() == 1) {
            return zze(0).zzh();
        }
        if (this.f46231a.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return zzj(",");
    }

    public final String zzj(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f46231a.isEmpty()) {
            for (int i = 0; i < zzc(); i++) {
                zzap zze = zze(i);
                sb.append(str);
                if (!(zze instanceof zzau) && !(zze instanceof zzan)) {
                    sb.append(zze.zzi());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final Iterator zzk() {
        return this.f46231a.keySet().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new C19374cb2(this, this.f46231a.keySet().iterator(), this.f46232b.keySet().iterator());
    }

    public final List zzm() {
        ArrayList arrayList = new ArrayList(zzc());
        for (int i = 0; i < zzc(); i++) {
            arrayList.add(zze(i));
        }
        return arrayList;
    }

    public final void zzn() {
        this.f46231a.clear();
    }

    public final void zzo(int i, zzap zzapVar) {
        if (i >= 0) {
            if (i >= zzc()) {
                zzq(i, zzapVar);
                return;
            }
            for (int intValue = ((Integer) this.f46231a.lastKey()).intValue(); intValue >= i; intValue--) {
                SortedMap sortedMap = this.f46231a;
                Integer valueOf = Integer.valueOf(intValue);
                zzap zzapVar2 = (zzap) sortedMap.get(valueOf);
                if (zzapVar2 != null) {
                    zzq(intValue + 1, zzapVar2);
                    this.f46231a.remove(valueOf);
                }
            }
            zzq(i, zzapVar);
            return;
        }
        throw new IllegalArgumentException("Invalid value index: " + i);
    }

    public final void zzp(int i) {
        int intValue = ((Integer) this.f46231a.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            this.f46231a.remove(Integer.valueOf(i));
            if (i == intValue) {
                SortedMap sortedMap = this.f46231a;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!sortedMap.containsKey(valueOf) && i2 >= 0) {
                    this.f46231a.put(valueOf, zzap.zzf);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) this.f46231a.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.f46231a;
                    Integer valueOf2 = Integer.valueOf(i);
                    zzap zzapVar = (zzap) sortedMap2.get(valueOf2);
                    if (zzapVar != null) {
                        this.f46231a.put(Integer.valueOf(i - 1), zzapVar);
                        this.f46231a.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    @RequiresNonNull({"elements"})
    public final void zzq(int i, zzap zzapVar) {
        if (i <= 32468) {
            if (i >= 0) {
                if (zzapVar == null) {
                    this.f46231a.remove(Integer.valueOf(i));
                    return;
                } else {
                    this.f46231a.put(Integer.valueOf(i), zzapVar);
                    return;
                }
            }
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        }
        throw new IllegalStateException("Array too large");
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String str, zzap zzapVar) {
        if (zzapVar == null) {
            this.f46232b.remove(str);
        } else {
            this.f46232b.put(str, zzapVar);
        }
    }

    public final boolean zzs(int i) {
        if (i >= 0 && i <= ((Integer) this.f46231a.lastKey()).intValue()) {
            return this.f46231a.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String str) {
        if (!"length".equals(str) && !this.f46232b.containsKey(str)) {
            return false;
        }
        return true;
    }

    public zzae(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                zzq(i, (zzap) list.get(i));
            }
        }
    }
}
