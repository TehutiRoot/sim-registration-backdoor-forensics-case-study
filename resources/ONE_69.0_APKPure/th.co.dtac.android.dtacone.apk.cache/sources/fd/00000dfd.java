package p000;

import com.google.firebase.sessions.settings.RemoteSettings;

/* renamed from: Om0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18230Om0 {

    /* renamed from: a */
    public final long f4528a;

    /* renamed from: b */
    public final long f4529b;

    public C18230Om0(long j, long j2) {
        this.f4528a = j;
        this.f4529b = j2;
    }

    /* renamed from: a */
    public long m67085a() {
        return this.f4529b;
    }

    /* renamed from: b */
    public long m67084b() {
        return this.f4528a;
    }

    /* renamed from: c */
    public double m67083c() {
        return this.f4528a / this.f4529b;
    }

    public String toString() {
        return this.f4528a + RemoteSettings.FORWARD_SLASH_STRING + this.f4529b;
    }

    public C18230Om0(double d) {
        this((long) (d * 10000.0d), 10000L);
    }
}