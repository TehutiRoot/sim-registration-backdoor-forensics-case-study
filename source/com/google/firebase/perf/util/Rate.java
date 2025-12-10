package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class Rate {

    /* renamed from: a */
    public long f56279a;

    /* renamed from: b */
    public long f56280b;

    /* renamed from: c */
    public TimeUnit f56281c;

    /* renamed from: com.google.firebase.perf.util.Rate$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8581a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56282a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f56282a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56282a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56282a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Rate(long j, long j2, TimeUnit timeUnit) {
        this.f56279a = j;
        this.f56280b = j2;
        this.f56281c = timeUnit;
    }

    public double getTokensPerSeconds() {
        int i = C8581a.f56282a[this.f56281c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return this.f56279a / this.f56281c.toSeconds(this.f56280b);
                }
                return (this.f56279a / this.f56280b) * TimeUnit.SECONDS.toMillis(1L);
            }
            return (this.f56279a / this.f56280b) * TimeUnit.SECONDS.toMicros(1L);
        }
        return (this.f56279a / this.f56280b) * TimeUnit.SECONDS.toNanos(1L);
    }
}
