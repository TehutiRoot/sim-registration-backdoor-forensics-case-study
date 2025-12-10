package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzaa {

    /* renamed from: a */
    public String f46237a;

    /* renamed from: b */
    public final long f46238b;

    /* renamed from: c */
    public final Map f46239c;

    public zzaa(String str, long j, Map map) {
        this.f46237a = str;
        this.f46238b = j;
        HashMap hashMap = new HashMap();
        this.f46239c = hashMap;
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
        if (this.f46238b != zzaaVar.f46238b || !this.f46237a.equals(zzaaVar.f46237a)) {
            return false;
        }
        return this.f46239c.equals(zzaaVar.f46239c);
    }

    public final int hashCode() {
        int hashCode = this.f46237a.hashCode();
        long j = this.f46238b;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f46239c.hashCode();
    }

    public final String toString() {
        String str = this.f46237a;
        long j = this.f46238b;
        String obj = this.f46239c.toString();
        return "Event{name='" + str + "', timestamp=" + j + ", params=" + obj + "}";
    }

    public final long zza() {
        return this.f46238b;
    }

    /* renamed from: zzb */
    public final zzaa clone() {
        return new zzaa(this.f46237a, this.f46238b, new HashMap(this.f46239c));
    }

    public final Object zzc(String str) {
        if (this.f46239c.containsKey(str)) {
            return this.f46239c.get(str);
        }
        return null;
    }

    public final String zzd() {
        return this.f46237a;
    }

    public final Map zze() {
        return this.f46239c;
    }

    public final void zzf(String str) {
        this.f46237a = str;
    }

    public final void zzg(String str, Object obj) {
        if (obj == null) {
            this.f46239c.remove(str);
        } else {
            this.f46239c.put(str, obj);
        }
    }
}