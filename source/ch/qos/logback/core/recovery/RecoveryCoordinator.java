package ch.qos.logback.core.recovery;

/* loaded from: classes.dex */
public class RecoveryCoordinator {
    public static final long BACKOFF_COEFFICIENT_MIN = 20;

    /* renamed from: d */
    public static long f40010d = 327680;

    /* renamed from: e */
    public static long f40011e = 4;

    /* renamed from: f */
    public static long f40012f = -1;

    /* renamed from: a */
    public long f40013a;

    /* renamed from: b */
    public long f40014b;

    /* renamed from: c */
    public long f40015c;

    public RecoveryCoordinator() {
        this.f40013a = 20L;
        this.f40014b = f40012f;
        this.f40015c = m51408b() + m51409a();
    }

    /* renamed from: a */
    public final long m51409a() {
        long j = this.f40013a;
        if (j < f40010d) {
            this.f40013a = f40011e * j;
        }
        return j;
    }

    /* renamed from: b */
    public final long m51408b() {
        long j = this.f40014b;
        return j != f40012f ? j : System.currentTimeMillis();
    }

    public boolean isTooSoon() {
        long m51408b = m51408b();
        if (m51408b > this.f40015c) {
            this.f40015c = m51408b + m51409a();
            return false;
        }
        return true;
    }

    public RecoveryCoordinator(long j) {
        this.f40013a = 20L;
        this.f40014b = j;
        this.f40015c = m51408b() + m51409a();
    }
}
