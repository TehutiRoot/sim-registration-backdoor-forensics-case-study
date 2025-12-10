package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzaa {

    /* renamed from: a */
    public String f46225a;

    /* renamed from: b */
    public final long f46226b;

    /* renamed from: c */
    public final Map f46227c;

    public zzaa(String str, long j, Map map) {
        this.f46225a = str;
        this.f46226b = j;
        HashMap hashMap = new HashMap();
        this.f46227c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return false;
        }
        zzaa zzaaVar = (zzaa) obj;
        if (this.f46226b != zzaaVar.f46226b || !this.f46225a.equals(zzaaVar.f46225a)) {
            return false;
        }
        return this.f46227c.equals(zzaaVar.f46227c);
    }

    public final int hashCode() {
        int hashCode = this.f46225a.hashCode();
        long j = this.f46226b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f46227c.hashCode();
    }

    public final String toString() {
        String str = this.f46225a;
        long j = this.f46226b;
        String obj = this.f46227c.toString();
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + obj + "}";
    }

    public final long zza() {
        return this.f46226b;
    }

    /* renamed from: zzb */
    public final zzaa clone() {
        return new zzaa(this.f46225a, this.f46226b, new HashMap(this.f46227c));
    }

    public final Object zzc(String str) {
        if (this.f46227c.containsKey(str)) {
            return this.f46227c.get(str);
        }
        return null;
    }

    public final String zzd() {
        return this.f46225a;
    }

    public final Map zze() {
        return this.f46227c;
    }

    public final void zzf(String str) {
        this.f46225a = str;
    }

    public final void zzg(String str, Object obj) {
        if (obj == null) {
            this.f46227c.remove(str);
        } else {
            this.f46227c.put(str, obj);
        }
    }
}
