package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzea {

    /* renamed from: h */
    public static final Object f48271h = new Object();

    /* renamed from: a */
    public final String f48272a;

    /* renamed from: b */
    public final InterfaceC18378Rj2 f48273b;

    /* renamed from: c */
    public final Object f48274c;

    /* renamed from: d */
    public final Object f48275d;

    /* renamed from: e */
    public final Object f48276e = new Object();

    /* renamed from: f */
    public volatile Object f48277f = null;

    /* renamed from: g */
    public volatile Object f48278g = null;

    public /* synthetic */ zzea(String str, Object obj, Object obj2, InterfaceC18378Rj2 interfaceC18378Rj2, zzdz zzdzVar) {
        this.f48272a = str;
        this.f48274c = obj;
        this.f48275d = obj2;
        this.f48273b = interfaceC18378Rj2;
    }

    public final Object zza(Object obj) {
        Object obj2;
        synchronized (this.f48276e) {
        }
        if (obj != null) {
            return obj;
        }
        if (AbstractC18698Wj2.f7280a == null) {
            return this.f48274c;
        }
        synchronized (f48271h) {
            try {
                if (zzab.zza()) {
                    if (this.f48278g == null) {
                        obj2 = this.f48274c;
                    } else {
                        obj2 = this.f48278g;
                    }
                    return obj2;
                }
                try {
                    for (zzea zzeaVar : zzeb.m46332b()) {
                        if (!zzab.zza()) {
                            Object obj3 = null;
                            try {
                                InterfaceC18378Rj2 interfaceC18378Rj2 = zzeaVar.f48273b;
                                if (interfaceC18378Rj2 != null) {
                                    obj3 = interfaceC18378Rj2.zza();
                                }
                            } catch (IllegalStateException unused) {
                            }
                            synchronized (f48271h) {
                                zzeaVar.f48278g = obj3;
                            }
                        } else {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                    }
                } catch (SecurityException unused2) {
                }
                InterfaceC18378Rj2 interfaceC18378Rj22 = this.f48273b;
                if (interfaceC18378Rj22 == null) {
                    return this.f48274c;
                }
                try {
                    return interfaceC18378Rj22.zza();
                } catch (IllegalStateException unused3) {
                    return this.f48274c;
                } catch (SecurityException unused4) {
                    return this.f48274c;
                }
            } finally {
            }
        }
    }

    public final String zzb() {
        return this.f48272a;
    }
}
