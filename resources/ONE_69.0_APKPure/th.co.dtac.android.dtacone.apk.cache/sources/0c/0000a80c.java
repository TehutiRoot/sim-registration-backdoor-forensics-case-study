package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.cache.LocalCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

@GwtIncompatible
/* loaded from: classes4.dex */
public final class CacheBuilderSpec {

    /* renamed from: o */
    public static final Splitter f52855o = Splitter.m41278on(',').trimResults();

    /* renamed from: p */
    public static final Splitter f52856p = Splitter.m41278on('=').trimResults();

    /* renamed from: q */
    public static final ImmutableMap f52857q;

    /* renamed from: a */
    public Integer f52858a;

    /* renamed from: b */
    public Long f52859b;

    /* renamed from: c */
    public Long f52860c;

    /* renamed from: d */
    public Integer f52861d;

    /* renamed from: e */
    public LocalCache.Strength f52862e;

    /* renamed from: f */
    public LocalCache.Strength f52863f;

    /* renamed from: g */
    public Boolean f52864g;

    /* renamed from: h */
    public long f52865h;

    /* renamed from: i */
    public TimeUnit f52866i;

    /* renamed from: j */
    public long f52867j;

    /* renamed from: k */
    public TimeUnit f52868k;

    /* renamed from: l */
    public long f52869l;

    /* renamed from: m */
    public TimeUnit f52870m;

    /* renamed from: n */
    public final String f52871n;

    /* renamed from: com.google.common.cache.CacheBuilderSpec$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C7452a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52872a;

        static {
            int[] iArr = new int[LocalCache.Strength.values().length];
            f52872a = iArr;
            try {
                iArr[LocalCache.Strength.WEAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52872a[LocalCache.Strength.SOFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$b */
    /* loaded from: classes4.dex */
    public static class C7453b extends AbstractC7455d {
        @Override // com.google.common.cache.CacheBuilderSpec.AbstractC7455d
        /* renamed from: b */
        public void mo41194b(CacheBuilderSpec cacheBuilderSpec, long j, TimeUnit timeUnit) {
            boolean z;
            if (cacheBuilderSpec.f52868k == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "expireAfterAccess already set");
            cacheBuilderSpec.f52867j = j;
            cacheBuilderSpec.f52868k = timeUnit;
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$c */
    /* loaded from: classes4.dex */
    public static class C7454c extends AbstractC7457f {
        @Override // com.google.common.cache.CacheBuilderSpec.AbstractC7457f
        /* renamed from: b */
        public void mo41197b(CacheBuilderSpec cacheBuilderSpec, int i) {
            boolean z;
            Integer num = cacheBuilderSpec.f52861d;
            if (num == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "concurrency level was already set to %s", num);
            cacheBuilderSpec.f52861d = Integer.valueOf(i);
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$d */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7455d implements InterfaceC7464m {
        @Override // com.google.common.cache.CacheBuilderSpec.InterfaceC7464m
        /* renamed from: a */
        public void mo41195a(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            TimeUnit timeUnit;
            if (!Strings.isNullOrEmpty(str2)) {
                try {
                    char charAt = str2.charAt(str2.length() - 1);
                    if (charAt != 'd') {
                        if (charAt != 'h') {
                            if (charAt != 'm') {
                                if (charAt == 's') {
                                    timeUnit = TimeUnit.SECONDS;
                                } else {
                                    throw new IllegalArgumentException(CacheBuilderSpec.m41199c("key %s invalid unit: was %s, must end with one of [dhms]", str, str2));
                                }
                            } else {
                                timeUnit = TimeUnit.MINUTES;
                            }
                        } else {
                            timeUnit = TimeUnit.HOURS;
                        }
                    } else {
                        timeUnit = TimeUnit.DAYS;
                    }
                    mo41194b(cacheBuilderSpec, Long.parseLong(str2.substring(0, str2.length() - 1)), timeUnit);
                    return;
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(CacheBuilderSpec.m41199c("key %s value set to %s, must be integer", str, str2));
                }
            }
            throw new IllegalArgumentException("value of key " + str + " omitted");
        }

        /* renamed from: b */
        public abstract void mo41194b(CacheBuilderSpec cacheBuilderSpec, long j, TimeUnit timeUnit);
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$e */
    /* loaded from: classes4.dex */
    public static class C7456e extends AbstractC7457f {
        @Override // com.google.common.cache.CacheBuilderSpec.AbstractC7457f
        /* renamed from: b */
        public void mo41197b(CacheBuilderSpec cacheBuilderSpec, int i) {
            boolean z;
            Integer num = cacheBuilderSpec.f52858a;
            if (num == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "initial capacity was already set to %s", num);
            cacheBuilderSpec.f52858a = Integer.valueOf(i);
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$f */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7457f implements InterfaceC7464m {
        @Override // com.google.common.cache.CacheBuilderSpec.InterfaceC7464m
        /* renamed from: a */
        public void mo41195a(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            if (!Strings.isNullOrEmpty(str2)) {
                try {
                    mo41197b(cacheBuilderSpec, Integer.parseInt(str2));
                    return;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException(CacheBuilderSpec.m41199c("key %s value set to %s, must be integer", str, str2), e);
                }
            }
            throw new IllegalArgumentException("value of key " + str + " omitted");
        }

        /* renamed from: b */
        public abstract void mo41197b(CacheBuilderSpec cacheBuilderSpec, int i);
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$g */
    /* loaded from: classes4.dex */
    public static class C7458g implements InterfaceC7464m {

        /* renamed from: a */
        public final LocalCache.Strength f52873a;

        public C7458g(LocalCache.Strength strength) {
            this.f52873a = strength;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.InterfaceC7464m
        /* renamed from: a */
        public void mo41195a(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            boolean z;
            boolean z2 = false;
            if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "key %s does not take values", str);
            LocalCache.Strength strength = cacheBuilderSpec.f52862e;
            if (strength == null) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "%s was already set to %s", str, strength);
            cacheBuilderSpec.f52862e = this.f52873a;
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$h */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7459h implements InterfaceC7464m {
        @Override // com.google.common.cache.CacheBuilderSpec.InterfaceC7464m
        /* renamed from: a */
        public void mo41195a(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            if (!Strings.isNullOrEmpty(str2)) {
                try {
                    mo41196b(cacheBuilderSpec, Long.parseLong(str2));
                    return;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException(CacheBuilderSpec.m41199c("key %s value set to %s, must be integer", str, str2), e);
                }
            }
            throw new IllegalArgumentException("value of key " + str + " omitted");
        }

        /* renamed from: b */
        public abstract void mo41196b(CacheBuilderSpec cacheBuilderSpec, long j);
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$i */
    /* loaded from: classes4.dex */
    public static class C7460i extends AbstractC7459h {
        @Override // com.google.common.cache.CacheBuilderSpec.AbstractC7459h
        /* renamed from: b */
        public void mo41196b(CacheBuilderSpec cacheBuilderSpec, long j) {
            boolean z;
            Long l = cacheBuilderSpec.f52859b;
            boolean z2 = false;
            if (l == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "maximum size was already set to %s", l);
            Long l2 = cacheBuilderSpec.f52860c;
            if (l2 == null) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "maximum weight was already set to %s", l2);
            cacheBuilderSpec.f52859b = Long.valueOf(j);
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$j */
    /* loaded from: classes4.dex */
    public static class C7461j extends AbstractC7459h {
        @Override // com.google.common.cache.CacheBuilderSpec.AbstractC7459h
        /* renamed from: b */
        public void mo41196b(CacheBuilderSpec cacheBuilderSpec, long j) {
            boolean z;
            Long l = cacheBuilderSpec.f52860c;
            boolean z2 = false;
            if (l == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "maximum weight was already set to %s", l);
            Long l2 = cacheBuilderSpec.f52859b;
            if (l2 == null) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "maximum size was already set to %s", l2);
            cacheBuilderSpec.f52860c = Long.valueOf(j);
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$k */
    /* loaded from: classes4.dex */
    public static class C7462k implements InterfaceC7464m {
        @Override // com.google.common.cache.CacheBuilderSpec.InterfaceC7464m
        /* renamed from: a */
        public void mo41195a(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            boolean z;
            boolean z2 = false;
            if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "recordStats does not take values");
            if (cacheBuilderSpec.f52864g == null) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "recordStats already set");
            cacheBuilderSpec.f52864g = Boolean.TRUE;
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$l */
    /* loaded from: classes4.dex */
    public static class C7463l extends AbstractC7455d {
        @Override // com.google.common.cache.CacheBuilderSpec.AbstractC7455d
        /* renamed from: b */
        public void mo41194b(CacheBuilderSpec cacheBuilderSpec, long j, TimeUnit timeUnit) {
            boolean z;
            if (cacheBuilderSpec.f52870m == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "refreshAfterWrite already set");
            cacheBuilderSpec.f52869l = j;
            cacheBuilderSpec.f52870m = timeUnit;
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$m */
    /* loaded from: classes4.dex */
    public interface InterfaceC7464m {
        /* renamed from: a */
        void mo41195a(CacheBuilderSpec cacheBuilderSpec, String str, String str2);
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$n */
    /* loaded from: classes4.dex */
    public static class C7465n implements InterfaceC7464m {

        /* renamed from: a */
        public final LocalCache.Strength f52874a;

        public C7465n(LocalCache.Strength strength) {
            this.f52874a = strength;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.InterfaceC7464m
        /* renamed from: a */
        public void mo41195a(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            boolean z;
            boolean z2 = false;
            if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "key %s does not take values", str);
            LocalCache.Strength strength = cacheBuilderSpec.f52863f;
            if (strength == null) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "%s was already set to %s", str, strength);
            cacheBuilderSpec.f52863f = this.f52874a;
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$o */
    /* loaded from: classes4.dex */
    public static class C7466o extends AbstractC7455d {
        @Override // com.google.common.cache.CacheBuilderSpec.AbstractC7455d
        /* renamed from: b */
        public void mo41194b(CacheBuilderSpec cacheBuilderSpec, long j, TimeUnit timeUnit) {
            boolean z;
            if (cacheBuilderSpec.f52866i == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "expireAfterWrite already set");
            cacheBuilderSpec.f52865h = j;
            cacheBuilderSpec.f52866i = timeUnit;
        }
    }

    static {
        ImmutableMap.Builder put = ImmutableMap.builder().put("initialCapacity", new C7456e()).put("maximumSize", new C7460i()).put("maximumWeight", new C7461j()).put("concurrencyLevel", new C7454c());
        LocalCache.Strength strength = LocalCache.Strength.WEAK;
        f52857q = put.put("weakKeys", new C7458g(strength)).put("softValues", new C7465n(LocalCache.Strength.SOFT)).put("weakValues", new C7465n(strength)).put("recordStats", new C7462k()).put("expireAfterAccess", new C7453b()).put("expireAfterWrite", new C7466o()).put("refreshAfterWrite", new C7463l()).put("refreshInterval", new C7463l()).buildOrThrow();
    }

    public CacheBuilderSpec(String str) {
        this.f52871n = str;
    }

    /* renamed from: b */
    public static Long m41200b(long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            return null;
        }
        return Long.valueOf(timeUnit.toNanos(j));
    }

    /* renamed from: c */
    public static String m41199c(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public static CacheBuilderSpec disableCaching() {
        return parse("maximumSize=0");
    }

    public static CacheBuilderSpec parse(String str) {
        boolean z;
        String str2;
        CacheBuilderSpec cacheBuilderSpec = new CacheBuilderSpec(str);
        if (!str.isEmpty()) {
            for (String str3 : f52855o.split(str)) {
                ImmutableList copyOf = ImmutableList.copyOf(f52856p.split(str3));
                Preconditions.checkArgument(!copyOf.isEmpty(), "blank key-value pair");
                boolean z2 = false;
                if (copyOf.size() <= 2) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z, "key-value pair %s with more than one equals sign", str3);
                String str4 = (String) copyOf.get(0);
                InterfaceC7464m interfaceC7464m = (InterfaceC7464m) f52857q.get(str4);
                if (interfaceC7464m != null) {
                    z2 = true;
                }
                Preconditions.checkArgument(z2, "unknown key %s", str4);
                if (copyOf.size() == 1) {
                    str2 = null;
                } else {
                    str2 = (String) copyOf.get(1);
                }
                interfaceC7464m.mo41195a(cacheBuilderSpec, str4, str2);
            }
        }
        return cacheBuilderSpec;
    }

    /* renamed from: d */
    public CacheBuilder m41198d() {
        CacheBuilder<Object, Object> newBuilder = CacheBuilder.newBuilder();
        Integer num = this.f52858a;
        if (num != null) {
            newBuilder.initialCapacity(num.intValue());
        }
        Long l = this.f52859b;
        if (l != null) {
            newBuilder.maximumSize(l.longValue());
        }
        Long l2 = this.f52860c;
        if (l2 != null) {
            newBuilder.maximumWeight(l2.longValue());
        }
        Integer num2 = this.f52861d;
        if (num2 != null) {
            newBuilder.concurrencyLevel(num2.intValue());
        }
        LocalCache.Strength strength = this.f52862e;
        if (strength != null) {
            if (C7452a.f52872a[strength.ordinal()] == 1) {
                newBuilder.weakKeys();
            } else {
                throw new AssertionError();
            }
        }
        LocalCache.Strength strength2 = this.f52863f;
        if (strength2 != null) {
            int i = C7452a.f52872a[strength2.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    newBuilder.softValues();
                } else {
                    throw new AssertionError();
                }
            } else {
                newBuilder.weakValues();
            }
        }
        Boolean bool = this.f52864g;
        if (bool != null && bool.booleanValue()) {
            newBuilder.recordStats();
        }
        TimeUnit timeUnit = this.f52866i;
        if (timeUnit != null) {
            newBuilder.expireAfterWrite(this.f52865h, timeUnit);
        }
        TimeUnit timeUnit2 = this.f52868k;
        if (timeUnit2 != null) {
            newBuilder.expireAfterAccess(this.f52867j, timeUnit2);
        }
        TimeUnit timeUnit3 = this.f52870m;
        if (timeUnit3 != null) {
            newBuilder.refreshAfterWrite(this.f52869l, timeUnit3);
        }
        return newBuilder;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheBuilderSpec)) {
            return false;
        }
        CacheBuilderSpec cacheBuilderSpec = (CacheBuilderSpec) obj;
        if (Objects.equal(this.f52858a, cacheBuilderSpec.f52858a) && Objects.equal(this.f52859b, cacheBuilderSpec.f52859b) && Objects.equal(this.f52860c, cacheBuilderSpec.f52860c) && Objects.equal(this.f52861d, cacheBuilderSpec.f52861d) && Objects.equal(this.f52862e, cacheBuilderSpec.f52862e) && Objects.equal(this.f52863f, cacheBuilderSpec.f52863f) && Objects.equal(this.f52864g, cacheBuilderSpec.f52864g) && Objects.equal(m41200b(this.f52865h, this.f52866i), m41200b(cacheBuilderSpec.f52865h, cacheBuilderSpec.f52866i)) && Objects.equal(m41200b(this.f52867j, this.f52868k), m41200b(cacheBuilderSpec.f52867j, cacheBuilderSpec.f52868k)) && Objects.equal(m41200b(this.f52869l, this.f52870m), m41200b(cacheBuilderSpec.f52869l, cacheBuilderSpec.f52870m))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f52858a, this.f52859b, this.f52860c, this.f52861d, this.f52862e, this.f52863f, this.f52864g, m41200b(this.f52865h, this.f52866i), m41200b(this.f52867j, this.f52868k), m41200b(this.f52869l, this.f52870m));
    }

    public String toParsableString() {
        return this.f52871n;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).addValue(toParsableString()).toString();
    }
}