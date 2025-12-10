package com.google.common.util.concurrent;

import com.google.common.math.LongMath;
import com.google.common.util.concurrent.RateLimiter;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.h */
/* loaded from: classes4.dex */
public abstract class AbstractC8315h extends RateLimiter {

    /* renamed from: c */
    public double f54484c;

    /* renamed from: d */
    public double f54485d;

    /* renamed from: e */
    public double f54486e;

    /* renamed from: f */
    public long f54487f;

    /* renamed from: com.google.common.util.concurrent.h$b */
    /* loaded from: classes4.dex */
    public static final class C8317b extends AbstractC8315h {

        /* renamed from: g */
        public final double f54488g;

        public C8317b(RateLimiter.AbstractC8266a abstractC8266a, double d) {
            super(abstractC8266a);
            this.f54488g = d;
        }

        @Override // com.google.common.util.concurrent.AbstractC8315h
        /* renamed from: l */
        public double mo39346l() {
            return this.f54486e;
        }

        @Override // com.google.common.util.concurrent.AbstractC8315h
        /* renamed from: m */
        public void mo39345m(double d, double d2) {
            double d3 = this.f54485d;
            double d4 = this.f54488g * d;
            this.f54485d = d4;
            if (d3 == Double.POSITIVE_INFINITY) {
                this.f54484c = d4;
                return;
            }
            double d5 = 0.0d;
            if (d3 != 0.0d) {
                d5 = (this.f54484c * d4) / d3;
            }
            this.f54484c = d5;
        }

        @Override // com.google.common.util.concurrent.AbstractC8315h
        /* renamed from: o */
        public long mo39344o(double d, double d2) {
            return 0L;
        }
    }

    /* renamed from: com.google.common.util.concurrent.h$c */
    /* loaded from: classes4.dex */
    public static final class C8318c extends AbstractC8315h {

        /* renamed from: g */
        public final long f54489g;

        /* renamed from: h */
        public double f54490h;

        /* renamed from: i */
        public double f54491i;

        /* renamed from: j */
        public double f54492j;

        public C8318c(RateLimiter.AbstractC8266a abstractC8266a, long j, TimeUnit timeUnit, double d) {
            super(abstractC8266a);
            this.f54489g = timeUnit.toMicros(j);
            this.f54492j = d;
        }

        @Override // com.google.common.util.concurrent.AbstractC8315h
        /* renamed from: l */
        public double mo39346l() {
            return this.f54489g / this.f54485d;
        }

        @Override // com.google.common.util.concurrent.AbstractC8315h
        /* renamed from: m */
        public void mo39345m(double d, double d2) {
            double d3 = this.f54485d;
            double d4 = this.f54492j * d2;
            long j = this.f54489g;
            double d5 = (j * 0.5d) / d2;
            this.f54491i = d5;
            double d6 = ((j * 2.0d) / (d2 + d4)) + d5;
            this.f54485d = d6;
            this.f54490h = (d4 - d2) / (d6 - d5);
            if (d3 == Double.POSITIVE_INFINITY) {
                this.f54484c = 0.0d;
                return;
            }
            if (d3 != 0.0d) {
                d6 = (this.f54484c * d6) / d3;
            }
            this.f54484c = d6;
        }

        @Override // com.google.common.util.concurrent.AbstractC8315h
        /* renamed from: o */
        public long mo39344o(double d, double d2) {
            long j;
            double d3 = d - this.f54491i;
            if (d3 > 0.0d) {
                double min = Math.min(d3, d2);
                j = (long) (((m39343p(d3) + m39343p(d3 - min)) * min) / 2.0d);
                d2 -= min;
            } else {
                j = 0;
            }
            return j + ((long) (this.f54486e * d2));
        }

        /* renamed from: p */
        public final double m39343p(double d) {
            return this.f54486e + (d * this.f54490h);
        }
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    /* renamed from: e */
    public final double mo39351e() {
        return TimeUnit.SECONDS.toMicros(1L) / this.f54486e;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    /* renamed from: f */
    public final void mo39350f(double d, long j) {
        m39347n(j);
        double micros = TimeUnit.SECONDS.toMicros(1L) / d;
        this.f54486e = micros;
        mo39345m(d, micros);
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    /* renamed from: h */
    public final long mo39349h(long j) {
        return this.f54487f;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    /* renamed from: k */
    public final long mo39348k(int i, long j) {
        m39347n(j);
        long j2 = this.f54487f;
        double d = i;
        double min = Math.min(d, this.f54484c);
        this.f54487f = LongMath.saturatedAdd(this.f54487f, mo39344o(this.f54484c, min) + ((long) ((d - min) * this.f54486e)));
        this.f54484c -= min;
        return j2;
    }

    /* renamed from: l */
    public abstract double mo39346l();

    /* renamed from: m */
    public abstract void mo39345m(double d, double d2);

    /* renamed from: n */
    public void m39347n(long j) {
        long j2 = this.f54487f;
        if (j > j2) {
            this.f54484c = Math.min(this.f54485d, this.f54484c + ((j - j2) / mo39346l()));
            this.f54487f = j;
        }
    }

    /* renamed from: o */
    public abstract long mo39344o(double d, double d2);

    public AbstractC8315h(RateLimiter.AbstractC8266a abstractC8266a) {
        super(abstractC8266a);
        this.f54487f = 0L;
    }
}
