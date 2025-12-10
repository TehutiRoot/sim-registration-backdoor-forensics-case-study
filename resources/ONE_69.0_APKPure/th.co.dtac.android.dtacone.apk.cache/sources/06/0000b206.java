package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class Rate {

    /* renamed from: a */
    public long f56291a;

    /* renamed from: b */
    public long f56292b;

    /* renamed from: c */
    public TimeUnit f56293c;

    /* renamed from: com.google.firebase.perf.util.Rate$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8570a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f56294a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f56294a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56294a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56294a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public Rate(long j, long j2, TimeUnit timeUnit) {
        this.f56291a = j;
        this.f56292b = j2;
        this.f56293c = timeUnit;
    }

    public double getTokensPerSeconds() {
        int i = C8570a.f56294a[this.f56293c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return this.f56291a / this.f56293c.toSeconds(this.f56292b);
                }
                return (this.f56291a / this.f56292b) * TimeUnit.SECONDS.toMillis(1L);
            }
            return (this.f56291a / this.f56292b) * TimeUnit.SECONDS.toMicros(1L);
        }
        return (this.f56291a / this.f56292b) * TimeUnit.SECONDS.toNanos(1L);
    }
}