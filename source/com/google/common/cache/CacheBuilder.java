package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.base.Ticker;
import com.google.common.cache.AbstractCache;
import com.google.common.cache.LocalCache;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class CacheBuilder<K, V> {

    /* renamed from: q */
    public static final Supplier f52822q = Suppliers.ofInstance(new C7459a());

    /* renamed from: r */
    public static final CacheStats f52823r = new CacheStats(0, 0, 0, 0, 0, 0);

    /* renamed from: s */
    public static final Supplier f52824s = new C7460b();

    /* renamed from: t */
    public static final Ticker f52825t = new C7461c();

    /* renamed from: f */
    public Weigher f52831f;

    /* renamed from: g */
    public LocalCache.Strength f52832g;

    /* renamed from: h */
    public LocalCache.Strength f52833h;

    /* renamed from: l */
    public Equivalence f52837l;

    /* renamed from: m */
    public Equivalence f52838m;

    /* renamed from: n */
    public RemovalListener f52839n;

    /* renamed from: o */
    public Ticker f52840o;

    /* renamed from: a */
    public boolean f52826a = true;

    /* renamed from: b */
    public int f52827b = -1;

    /* renamed from: c */
    public int f52828c = -1;

    /* renamed from: d */
    public long f52829d = -1;

    /* renamed from: e */
    public long f52830e = -1;

    /* renamed from: i */
    public long f52834i = -1;

    /* renamed from: j */
    public long f52835j = -1;

    /* renamed from: k */
    public long f52836k = -1;

    /* renamed from: p */
    public Supplier f52841p = f52822q;

    /* loaded from: classes4.dex */
    public enum NullListener implements RemovalListener<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.RemovalListener
        public void onRemoval(RemovalNotification<Object, Object> removalNotification) {
        }
    }

    /* loaded from: classes4.dex */
    public enum OneWeigher implements Weigher<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.Weigher
        public int weigh(Object obj, Object obj2) {
            return 1;
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilder$a */
    /* loaded from: classes4.dex */
    public class C7459a implements AbstractCache.StatsCounter {
        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordEviction() {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordHits(int i) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadException(long j) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadSuccess(long j) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordMisses(int i) {
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public CacheStats snapshot() {
            return CacheBuilder.f52823r;
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilder$b */
    /* loaded from: classes4.dex */
    public class C7460b implements Supplier {
        @Override // com.google.common.base.Supplier
        /* renamed from: a */
        public AbstractCache.StatsCounter get() {
            return new AbstractCache.SimpleStatsCounter();
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilder$c */
    /* loaded from: classes4.dex */
    public class C7461c extends Ticker {
        @Override // com.google.common.base.Ticker
        public long read() {
            return 0L;
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilder$d */
    /* loaded from: classes4.dex */
    public static final class C7462d {

        /* renamed from: a */
        public static final Logger f52842a = Logger.getLogger(CacheBuilder.class.getName());
    }

    @GwtIncompatible
    public static CacheBuilder<Object, Object> from(CacheBuilderSpec cacheBuilderSpec) {
        return cacheBuilderSpec.m41209d().m41218r();
    }

    public static CacheBuilder<Object, Object> newBuilder() {
        return new CacheBuilder<>();
    }

    /* renamed from: u */
    public static long m41215u(Duration duration) {
        boolean isNegative;
        long nanos;
        try {
            nanos = duration.toNanos();
            return nanos;
        } catch (ArithmeticException unused) {
            isNegative = duration.isNegative();
            if (isNegative) {
                return Long.MIN_VALUE;
            }
            return Long.MAX_VALUE;
        }
    }

    /* renamed from: a */
    public final void m41235a() {
        boolean z;
        if (this.f52836k == -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "refreshAfterWrite requires a LoadingCache");
    }

    /* renamed from: b */
    public final void m41234b() {
        boolean z = false;
        if (this.f52831f == null) {
            if (this.f52830e == -1) {
                z = true;
            }
            Preconditions.checkState(z, "maximumWeight requires weigher");
        } else if (this.f52826a) {
            if (this.f52830e != -1) {
                z = true;
            }
            Preconditions.checkState(z, "weigher requires maximumWeight");
        } else if (this.f52830e == -1) {
            C7462d.f52842a.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    public <K1 extends K, V1 extends V> LoadingCache<K1, V1> build(CacheLoader<? super K1, V1> cacheLoader) {
        m41234b();
        return new LocalCache.LocalLoadingCache(this, cacheLoader);
    }

    /* renamed from: c */
    public int m41233c() {
        int i = this.f52828c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    @CanIgnoreReturnValue
    public CacheBuilder<K, V> concurrencyLevel(int i) {
        boolean z;
        int i2 = this.f52828c;
        boolean z2 = false;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "concurrency level was already set to %s", i2);
        if (i > 0) {
            z2 = true;
        }
        Preconditions.checkArgument(z2);
        this.f52828c = i;
        return this;
    }

    /* renamed from: d */
    public long m41232d() {
        long j = this.f52835j;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    /* renamed from: e */
    public long m41231e() {
        long j = this.f52834i;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public CacheBuilder<K, V> expireAfterAccess(Duration duration) {
        return expireAfterAccess(m41215u(duration), TimeUnit.NANOSECONDS);
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public CacheBuilder<K, V> expireAfterWrite(Duration duration) {
        return expireAfterWrite(m41215u(duration), TimeUnit.NANOSECONDS);
    }

    /* renamed from: f */
    public int m41230f() {
        int i = this.f52827b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    /* renamed from: g */
    public Equivalence m41229g() {
        return (Equivalence) MoreObjects.firstNonNull(this.f52837l, m41228h().defaultEquivalence());
    }

    /* renamed from: h */
    public LocalCache.Strength m41228h() {
        return (LocalCache.Strength) MoreObjects.firstNonNull(this.f52832g, LocalCache.Strength.STRONG);
    }

    /* renamed from: i */
    public long m41227i() {
        if (this.f52834i == 0 || this.f52835j == 0) {
            return 0L;
        }
        if (this.f52831f == null) {
            return this.f52829d;
        }
        return this.f52830e;
    }

    @CanIgnoreReturnValue
    public CacheBuilder<K, V> initialCapacity(int i) {
        boolean z;
        int i2 = this.f52827b;
        boolean z2 = false;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "initial capacity was already set to %s", i2);
        if (i >= 0) {
            z2 = true;
        }
        Preconditions.checkArgument(z2);
        this.f52827b = i;
        return this;
    }

    /* renamed from: j */
    public long m41226j() {
        long j = this.f52836k;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    /* renamed from: k */
    public RemovalListener m41225k() {
        return (RemovalListener) MoreObjects.firstNonNull(this.f52839n, NullListener.INSTANCE);
    }

    /* renamed from: l */
    public Supplier m41224l() {
        return this.f52841p;
    }

    /* renamed from: m */
    public Ticker m41223m(boolean z) {
        Ticker ticker = this.f52840o;
        if (ticker != null) {
            return ticker;
        }
        if (z) {
            return Ticker.systemTicker();
        }
        return f52825t;
    }

    @CanIgnoreReturnValue
    public CacheBuilder<K, V> maximumSize(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        long j2 = this.f52829d;
        boolean z4 = false;
        if (j2 == -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "maximum size was already set to %s", j2);
        long j3 = this.f52830e;
        if (j3 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkState(z2, "maximum weight was already set to %s", j3);
        if (this.f52831f == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkState(z3, "maximum size can not be combined with weigher");
        if (j >= 0) {
            z4 = true;
        }
        Preconditions.checkArgument(z4, "maximum size must not be negative");
        this.f52829d = j;
        return this;
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public CacheBuilder<K, V> maximumWeight(long j) {
        boolean z;
        boolean z2;
        long j2 = this.f52830e;
        boolean z3 = false;
        if (j2 == -1) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "maximum weight was already set to %s", j2);
        long j3 = this.f52829d;
        if (j3 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkState(z2, "maximum size was already set to %s", j3);
        if (j >= 0) {
            z3 = true;
        }
        Preconditions.checkArgument(z3, "maximum weight must not be negative");
        this.f52830e = j;
        return this;
    }

    /* renamed from: n */
    public Equivalence m41222n() {
        return (Equivalence) MoreObjects.firstNonNull(this.f52838m, m41221o().defaultEquivalence());
    }

    /* renamed from: o */
    public LocalCache.Strength m41221o() {
        return (LocalCache.Strength) MoreObjects.firstNonNull(this.f52833h, LocalCache.Strength.STRONG);
    }

    /* renamed from: p */
    public Weigher m41220p() {
        return (Weigher) MoreObjects.firstNonNull(this.f52831f, OneWeigher.INSTANCE);
    }

    /* renamed from: q */
    public CacheBuilder m41219q(Equivalence equivalence) {
        boolean z;
        Equivalence equivalence2 = this.f52837l;
        if (equivalence2 == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "key equivalence was already set to %s", equivalence2);
        this.f52837l = (Equivalence) Preconditions.checkNotNull(equivalence);
        return this;
    }

    /* renamed from: r */
    public CacheBuilder m41218r() {
        this.f52826a = false;
        return this;
    }

    @CanIgnoreReturnValue
    public CacheBuilder<K, V> recordStats() {
        this.f52841p = f52824s;
        return this;
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public CacheBuilder<K, V> refreshAfterWrite(Duration duration) {
        return refreshAfterWrite(m41215u(duration), TimeUnit.NANOSECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> removalListener(RemovalListener<? super K1, ? super V1> removalListener) {
        boolean z;
        if (this.f52839n == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        this.f52839n = (RemovalListener) Preconditions.checkNotNull(removalListener);
        return this;
    }

    /* renamed from: s */
    public CacheBuilder m41217s(LocalCache.Strength strength) {
        boolean z;
        LocalCache.Strength strength2 = this.f52832g;
        if (strength2 == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Key strength was already set to %s", strength2);
        this.f52832g = (LocalCache.Strength) Preconditions.checkNotNull(strength);
        return this;
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public CacheBuilder<K, V> softValues() {
        return m41216t(LocalCache.Strength.SOFT);
    }

    /* renamed from: t */
    public CacheBuilder m41216t(LocalCache.Strength strength) {
        boolean z;
        LocalCache.Strength strength2 = this.f52833h;
        if (strength2 == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Value strength was already set to %s", strength2);
        this.f52833h = (LocalCache.Strength) Preconditions.checkNotNull(strength);
        return this;
    }

    @CanIgnoreReturnValue
    public CacheBuilder<K, V> ticker(Ticker ticker) {
        boolean z;
        if (this.f52840o == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        this.f52840o = (Ticker) Preconditions.checkNotNull(ticker);
        return this;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        int i = this.f52827b;
        if (i != -1) {
            stringHelper.add("initialCapacity", i);
        }
        int i2 = this.f52828c;
        if (i2 != -1) {
            stringHelper.add("concurrencyLevel", i2);
        }
        long j = this.f52829d;
        if (j != -1) {
            stringHelper.add("maximumSize", j);
        }
        long j2 = this.f52830e;
        if (j2 != -1) {
            stringHelper.add("maximumWeight", j2);
        }
        if (this.f52834i != -1) {
            stringHelper.add("expireAfterWrite", this.f52834i + "ns");
        }
        if (this.f52835j != -1) {
            stringHelper.add("expireAfterAccess", this.f52835j + "ns");
        }
        LocalCache.Strength strength = this.f52832g;
        if (strength != null) {
            stringHelper.add("keyStrength", Ascii.toLowerCase(strength.toString()));
        }
        LocalCache.Strength strength2 = this.f52833h;
        if (strength2 != null) {
            stringHelper.add("valueStrength", Ascii.toLowerCase(strength2.toString()));
        }
        if (this.f52837l != null) {
            stringHelper.addValue("keyEquivalence");
        }
        if (this.f52838m != null) {
            stringHelper.addValue("valueEquivalence");
        }
        if (this.f52839n != null) {
            stringHelper.addValue("removalListener");
        }
        return stringHelper.toString();
    }

    /* renamed from: v */
    public CacheBuilder m41214v(Equivalence equivalence) {
        boolean z;
        Equivalence equivalence2 = this.f52838m;
        if (equivalence2 == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "value equivalence was already set to %s", equivalence2);
        this.f52838m = (Equivalence) Preconditions.checkNotNull(equivalence);
        return this;
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public CacheBuilder<K, V> weakKeys() {
        return m41217s(LocalCache.Strength.WEAK);
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public CacheBuilder<K, V> weakValues() {
        return m41216t(LocalCache.Strength.WEAK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CanIgnoreReturnValue
    @GwtIncompatible
    public <K1 extends K, V1 extends V> CacheBuilder<K1, V1> weigher(Weigher<? super K1, ? super V1> weigher) {
        boolean z;
        boolean z2 = false;
        if (this.f52831f == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (this.f52826a) {
            long j = this.f52829d;
            if (j == -1) {
                z2 = true;
            }
            Preconditions.checkState(z2, "weigher can not be combined with maximum size (%s provided)", j);
        }
        this.f52831f = (Weigher) Preconditions.checkNotNull(weigher);
        return this;
    }

    @GwtIncompatible
    public static CacheBuilder<Object, Object> from(String str) {
        return from(CacheBuilderSpec.parse(str));
    }

    @CanIgnoreReturnValue
    public CacheBuilder<K, V> expireAfterAccess(long j, TimeUnit timeUnit) {
        long j2 = this.f52835j;
        Preconditions.checkState(j2 == -1, "expireAfterAccess was already set to %s ns", j2);
        Preconditions.checkArgument(j >= 0, "duration cannot be negative: %s %s", j, timeUnit);
        this.f52835j = timeUnit.toNanos(j);
        return this;
    }

    @CanIgnoreReturnValue
    public CacheBuilder<K, V> expireAfterWrite(long j, TimeUnit timeUnit) {
        long j2 = this.f52834i;
        Preconditions.checkState(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
        Preconditions.checkArgument(j >= 0, "duration cannot be negative: %s %s", j, timeUnit);
        this.f52834i = timeUnit.toNanos(j);
        return this;
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    public CacheBuilder<K, V> refreshAfterWrite(long j, TimeUnit timeUnit) {
        Preconditions.checkNotNull(timeUnit);
        long j2 = this.f52836k;
        Preconditions.checkState(j2 == -1, "refresh was already set to %s ns", j2);
        Preconditions.checkArgument(j > 0, "duration must be positive: %s %s", j, timeUnit);
        this.f52836k = timeUnit.toNanos(j);
        return this;
    }

    public <K1 extends K, V1 extends V> Cache<K1, V1> build() {
        m41234b();
        m41235a();
        return new LocalCache.LocalManualCache(this);
    }
}
