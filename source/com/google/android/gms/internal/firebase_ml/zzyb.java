package com.google.android.gms.internal.firebase_ml;

/* loaded from: classes3.dex */
public class zzyb {

    /* renamed from: d */
    public static final zzww f46119d = zzww.zzuo();

    /* renamed from: a */
    public zzwd f46120a;

    /* renamed from: b */
    public volatile zzys f46121b;

    /* renamed from: c */
    public volatile zzwd f46122c;

    /* renamed from: a */
    public final zzys m47416a(zzys zzysVar) {
        if (this.f46121b == null) {
            synchronized (this) {
                if (this.f46121b == null) {
                    try {
                        this.f46121b = zzysVar;
                        this.f46122c = zzwd.zzcks;
                    } catch (zzxs unused) {
                        this.f46121b = zzysVar;
                        this.f46122c = zzwd.zzcks;
                    }
                }
            }
        }
        return this.f46121b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzyb)) {
            return false;
        }
        zzyb zzybVar = (zzyb) obj;
        zzys zzysVar = this.f46121b;
        zzys zzysVar2 = zzybVar.f46121b;
        if (zzysVar == null && zzysVar2 == null) {
            return zzts().equals(zzybVar.zzts());
        }
        if (zzysVar != null && zzysVar2 != null) {
            return zzysVar.equals(zzysVar2);
        }
        if (zzysVar != null) {
            return zzysVar.equals(zzybVar.m47416a(zzysVar.zzvh()));
        }
        return m47416a(zzysVar2.zzvh()).equals(zzysVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzys zzi(zzys zzysVar) {
        zzys zzysVar2 = this.f46121b;
        this.f46120a = null;
        this.f46122c = null;
        this.f46121b = zzysVar;
        return zzysVar2;
    }

    public final zzwd zzts() {
        if (this.f46122c != null) {
            return this.f46122c;
        }
        synchronized (this) {
            try {
                if (this.f46122c != null) {
                    return this.f46122c;
                }
                if (this.f46121b == null) {
                    this.f46122c = zzwd.zzcks;
                } else {
                    this.f46122c = this.f46121b.zzts();
                }
                return this.f46122c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int zzva() {
        if (this.f46122c != null) {
            return this.f46122c.size();
        }
        if (this.f46121b != null) {
            return this.f46121b.zzva();
        }
        return 0;
    }
}
