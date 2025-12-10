package p000;

import com.google.firebase.sessions.settings.RemoteSettings;

/* renamed from: Im0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17809Im0 {

    /* renamed from: a */
    public final long f2589a;

    /* renamed from: b */
    public final long f2590b;

    public C17809Im0(long j, long j2) {
        this.f2589a = j;
        this.f2590b = j2;
    }

    /* renamed from: a */
    public long m67873a() {
        return this.f2590b;
    }

    /* renamed from: b */
    public long m67872b() {
        return this.f2589a;
    }

    /* renamed from: c */
    public double m67871c() {
        return this.f2589a / this.f2590b;
    }

    public String toString() {
        return this.f2589a + RemoteSettings.FORWARD_SLASH_STRING + this.f2590b;
    }

    public C17809Im0(double d) {
        this((long) (d * 10000.0d), 10000L);
    }
}
