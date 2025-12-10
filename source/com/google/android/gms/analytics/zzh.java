package com.google.android.gms.analytics;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import ch.qos.logback.core.spi.ComponentTracker;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzh {

    /* renamed from: a */
    public final zzk f44405a;

    /* renamed from: b */
    public final Clock f44406b;

    /* renamed from: c */
    public boolean f44407c;

    /* renamed from: d */
    public long f44408d;

    /* renamed from: e */
    public long f44409e;

    /* renamed from: f */
    public long f44410f;

    /* renamed from: g */
    public long f44411g;

    /* renamed from: h */
    public long f44412h;

    /* renamed from: i */
    public boolean f44413i;

    /* renamed from: j */
    public final Map f44414j;

    /* renamed from: k */
    public final List f44415k;

    public zzh(zzh zzhVar) {
        this.f44405a = zzhVar.f44405a;
        this.f44406b = zzhVar.f44406b;
        this.f44408d = zzhVar.f44408d;
        this.f44409e = zzhVar.f44409e;
        this.f44410f = zzhVar.f44410f;
        this.f44411g = zzhVar.f44411g;
        this.f44412h = zzhVar.f44412h;
        this.f44415k = new ArrayList(zzhVar.f44415k);
        this.f44414j = new HashMap(zzhVar.f44414j.size());
        for (Map.Entry entry : zzhVar.f44414j.entrySet()) {
            zzj m48731e = m48731e((Class) entry.getKey());
            ((zzj) entry.getValue()).zzc(m48731e);
            this.f44414j.put((Class) entry.getKey(), m48731e);
        }
    }

    /* renamed from: e */
    public static zzj m48731e(Class cls) {
        try {
            return (zzj) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception e) {
            if (!(e instanceof InstantiationException)) {
                if (!(e instanceof IllegalAccessException)) {
                    if (e instanceof ReflectiveOperationException) {
                        throw new IllegalArgumentException("Linkage exception", e);
                    }
                    throw new RuntimeException(e);
                }
                throw new IllegalArgumentException("dataType default constructor is not accessible", e);
            }
            throw new IllegalArgumentException("dataType doesn't have default constructor", e);
        }
    }

    /* renamed from: a */
    public final zzk m48735a() {
        return this.f44405a;
    }

    /* renamed from: b */
    public final void m48734b() {
        this.f44413i = true;
    }

    /* renamed from: c */
    public final void m48733c() {
        this.f44410f = this.f44406b.elapsedRealtime();
        long j = this.f44409e;
        if (j != 0) {
            this.f44408d = j;
        } else {
            this.f44408d = this.f44406b.currentTimeMillis();
        }
        this.f44407c = true;
    }

    /* renamed from: d */
    public final boolean m48732d() {
        return this.f44413i;
    }

    @VisibleForTesting
    public final long zza() {
        return this.f44408d;
    }

    @VisibleForTesting
    public final zzj zzb(Class cls) {
        zzj zzjVar = (zzj) this.f44414j.get(cls);
        if (zzjVar == null) {
            zzj m48731e = m48731e(cls);
            this.f44414j.put(cls, m48731e);
            return m48731e;
        }
        return zzjVar;
    }

    @Nullable
    @VisibleForTesting
    public final zzj zzc(Class cls) {
        return (zzj) this.f44414j.get(cls);
    }

    @VisibleForTesting
    public final Collection zze() {
        return this.f44414j.values();
    }

    public final List zzf() {
        return this.f44415k;
    }

    @VisibleForTesting
    public final void zzg(zzj zzjVar) {
        Preconditions.checkNotNull(zzjVar);
        Class<?> cls = zzjVar.getClass();
        if (cls.getSuperclass() == zzj.class) {
            zzjVar.zzc(zzb(cls));
            return;
        }
        throw new IllegalArgumentException();
    }

    @VisibleForTesting
    public final void zzj(long j) {
        this.f44409e = j;
    }

    @VisibleForTesting
    public final void zzk() {
        this.f44405a.zzm().m48727c(this);
    }

    @VisibleForTesting
    public final boolean zzm() {
        return this.f44407c;
    }

    public zzh(zzk zzkVar, Clock clock) {
        Preconditions.checkNotNull(zzkVar);
        Preconditions.checkNotNull(clock);
        this.f44405a = zzkVar;
        this.f44406b = clock;
        this.f44411g = ComponentTracker.DEFAULT_TIMEOUT;
        this.f44412h = 3024000000L;
        this.f44414j = new HashMap();
        this.f44415k = new ArrayList();
    }
}
