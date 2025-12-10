package ch.qos.logback.core.recovery;

/* loaded from: classes.dex */
public class RecoveryCoordinator {
    public static final long BACKOFF_COEFFICIENT_MIN = 20;

    /* renamed from: d */
    public static long f40008d = 327680;

    /* renamed from: e */
    public static long f40009e = 4;

    /* renamed from: f */
    public static long f40010f = -1;

    /* renamed from: a */
    public long f40011a;

    /* renamed from: b */
    public long f40012b;

    /* renamed from: c */
    public long f40013c;

    public RecoveryCoordinator() {
        this.f40011a = 20L;
        this.f40012b = f40010f;
        this.f40013c = m51403b() + m51404a();
    }

    /* renamed from: a */
    public final long m51404a() {
        long j = this.f40011a;
        if (j < f40008d) {
            this.f40011a = f40009e * j;
        }
        return j;
    }

    /* renamed from: b */
    public final long m51403b() {
        long j = this.f40012b;
        return j != f40010f ? j : System.currentTimeMillis();
    }

    public boolean isTooSoon() {
        long m51403b = m51403b();
        if (m51403b > this.f40013c) {
            this.f40013c = m51403b + m51404a();
            return false;
        }
        return true;
    }

    public RecoveryCoordinator(long j) {
        this.f40011a = 20L;
        this.f40012b = j;
        this.f40013c = m51403b() + m51404a();
    }
}