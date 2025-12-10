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
    public static final Splitter f52843o = Splitter.m41291on(',').trimResults();

    /* renamed from: p */
    public static final Splitter f52844p = Splitter.m41291on('=').trimResults();

    /* renamed from: q */
    public static final ImmutableMap f52845q;

    /* renamed from: a */
    public Integer f52846a;

    /* renamed from: b */
    public Long f52847b;

    /* renamed from: c */
    public Long f52848c;

    /* renamed from: d */
    public Integer f52849d;

    /* renamed from: e */
    public LocalCache.Strength f52850e;

    /* renamed from: f */
    public LocalCache.Strength f52851f;

    /* renamed from: g */
    public Boolean f52852g;

    /* renamed from: h */
    public long f52853h;

    /* renamed from: i */
    public TimeUnit f52854i;

    /* renamed from: j */
    public long f52855j;

    /* renamed from: k */
    public TimeUnit f52856k;

    /* renamed from: l */
    public long f52857l;

    /* renamed from: m */
    public TimeUnit f52858m;

    /* renamed from: n */
    public final String f52859n;

    /* renamed from: com.google.common.cache.CacheBuilderSpec$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C7463a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52860a;

        static {
            int[] iArr = new int[LocalCache.Strength.values().length];
            f52860a = iArr;
            try {
                iArr[LocalCache.Strength.WEAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52860a[LocalCache.Strength.SOFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$b */
    /* loaded from: classes4.dex */
    public static class C7464b extends AbstractC7466d {
        @Override // com.google.common.cache.CacheBuilderSpec.AbstractC7466d
        /* renamed from: b */
        public void mo41205b(CacheBuilderSpec cacheBuilderSpec, long j, TimeUnit timeUnit) {
            boolean z;
            if (cacheBuilderSpec.f52856k == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "expireAfterAccess already set");
            cacheBuilderSpec.f52855j = j;
            cacheBuilderSpec.f52856k = timeUnit;
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$c */
    /* loaded from: classes4.dex */
    public static class C7465c extends AbstractC7468f {
        @Override // com.google.common.cache.CacheBuilderSpec.AbstractC7468f
        /* renamed from: b */
        public void mo41208b(CacheBuilderSpec cacheBuilderSpec, int i) {
            boolean z;
            Integer num = cacheBuilderSpec.f52849d;
            if (num == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "concurrency level was already set to %s", num);
            cacheBuilderSpec.f52849d = Integer.valueOf(i);
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$d */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7466d implements InterfaceC7475m {
        @Override // com.google.common.cache.CacheBuilderSpec.InterfaceC7475m
        /* renamed from: a */
        public void mo41206a(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
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
                                    throw new IllegalArgumentException(CacheBuilderSpec.m41210c("key %s invalid unit: was %s, must end with one of [dhms]", str, str2));
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
                    mo41205b(cacheBuilderSpec, Long.parseLong(str2.substring(0, str2.length() - 1)), timeUnit);
                    return;
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(CacheBuilderSpec.m41210c("key %s value set to %s, must be integer", str, str2));
                }
            }
            throw new IllegalArgumentException("value of key " + str + " omitted");
        }

        /* renamed from: b */
        public abstract void mo41205b(CacheBuilderSpec cacheBuilderSpec, long j, TimeUnit timeUnit);
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$e */
    /* loaded from: classes4.dex */
    public static class C7467e extends AbstractC7468f {
        @Override // com.google.common.cache.CacheBuilderSpec.AbstractC7468f
        /* renamed from: b */
        public void mo41208b(CacheBuilderSpec cacheBuilderSpec, int i) {
            boolean z;
            Integer num = cacheBuilderSpec.f52846a;
            if (num == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "initial capacity was already set to %s", num);
            cacheBuilderSpec.f52846a = Integer.valueOf(i);
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$f */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7468f implements InterfaceC7475m {
        @Override // com.google.common.cache.CacheBuilderSpec.InterfaceC7475m
        /* renamed from: a */
        public void mo41206a(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            if (!Strings.isNullOrEmpty(str2)) {
                try {
                    mo41208b(cacheBuilderSpec, Integer.parseInt(str2));
                    return;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException(CacheBuilderSpec.m41210c("key %s value set to %s, must be integer", str, str2), e);
                }
            }
            throw new IllegalArgumentException("value of key " + str + " omitted");
        }

        /* renamed from: b */
        public abstract void mo41208b(CacheBuilderSpec cacheBuilderSpec, int i);
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$g */
    /* loaded from: classes4.dex */
    public static class C7469g implements InterfaceC7475m {

        /* renamed from: a */
        public final LocalCache.Strength f52861a;

        public C7469g(LocalCache.Strength strength) {
            this.f52861a = strength;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.InterfaceC7475m
        /* renamed from: a */
        public void mo41206a(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            boolean z;
            boolean z2 = false;
            if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "key %s does not take values", str);
            LocalCache.Strength strength = cacheBuilderSpec.f52850e;
            if (strength == null) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "%s was already set to %s", str, strength);
            cacheBuilderSpec.f52850e = this.f52861a;
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$h */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC7470h implements InterfaceC7475m {
        @Override // com.google.common.cache.CacheBuilderSpec.InterfaceC7475m
        /* renamed from: a */
        public void mo41206a(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            if (!Strings.isNullOrEmpty(str2)) {
                try {
                    mo41207b(cacheBuilderSpec, Long.parseLong(str2));
                    return;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException(CacheBuilderSpec.m41210c("key %s value set to %s, must be integer", str, str2), e);
                }
            }
            throw new IllegalArgumentException("value of key " + str + " omitted");
        }

        /* renamed from: b */
        public abstract void mo41207b(CacheBuilderSpec cacheBuilderSpec, long j);
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$i */
    /* loaded from: classes4.dex */
    public static class C7471i extends AbstractC7470h {
        @Override // com.google.common.cache.CacheBuilderSpec.AbstractC7470h
        /* renamed from: b */
        public void mo41207b(CacheBuilderSpec cacheBuilderSpec, long j) {
            boolean z;
            Long l = cacheBuilderSpec.f52847b;
            boolean z2 = false;
            if (l == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "maximum size was already set to %s", l);
            Long l2 = cacheBuilderSpec.f52848c;
            if (l2 == null) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "maximum weight was already set to %s", l2);
            cacheBuilderSpec.f52847b = Long.valueOf(j);
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$j */
    /* loaded from: classes4.dex */
    public static class C7472j extends AbstractC7470h {
        @Override // com.google.common.cache.CacheBuilderSpec.AbstractC7470h
        /* renamed from: b */
        public void mo41207b(CacheBuilderSpec cacheBuilderSpec, long j) {
            boolean z;
            Long l = cacheBuilderSpec.f52848c;
            boolean z2 = false;
            if (l == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "maximum weight was already set to %s", l);
            Long l2 = cacheBuilderSpec.f52847b;
            if (l2 == null) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "maximum size was already set to %s", l2);
            cacheBuilderSpec.f52848c = Long.valueOf(j);
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$k */
    /* loaded from: classes4.dex */
    public static class C7473k implements InterfaceC7475m {
        @Override // com.google.common.cache.CacheBuilderSpec.InterfaceC7475m
        /* renamed from: a */
        public void mo41206a(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            boolean z;
            boolean z2 = false;
            if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "recordStats does not take values");
            if (cacheBuilderSpec.f52852g == null) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "recordStats already set");
            cacheBuilderSpec.f52852g = Boolean.TRUE;
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$l */
    /* loaded from: classes4.dex */
    public static class C7474l extends AbstractC7466d {
        @Override // com.google.common.cache.CacheBuilderSpec.AbstractC7466d
        /* renamed from: b */
        public void mo41205b(CacheBuilderSpec cacheBuilderSpec, long j, TimeUnit timeUnit) {
            boolean z;
            if (cacheBuilderSpec.f52858m == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "refreshAfterWrite already set");
            cacheBuilderSpec.f52857l = j;
            cacheBuilderSpec.f52858m = timeUnit;
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$m */
    /* loaded from: classes4.dex */
    public interface InterfaceC7475m {
        /* renamed from: a */
        void mo41206a(CacheBuilderSpec cacheBuilderSpec, String str, String str2);
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$n */
    /* loaded from: classes4.dex */
    public static class C7476n implements InterfaceC7475m {

        /* renamed from: a */
        public final LocalCache.Strength f52862a;

        public C7476n(LocalCache.Strength strength) {
            this.f52862a = strength;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.InterfaceC7475m
        /* renamed from: a */
        public void mo41206a(CacheBuilderSpec cacheBuilderSpec, String str, String str2) {
            boolean z;
            boolean z2 = false;
            if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "key %s does not take values", str);
            LocalCache.Strength strength = cacheBuilderSpec.f52851f;
            if (strength == null) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "%s was already set to %s", str, strength);
            cacheBuilderSpec.f52851f = this.f52862a;
        }
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$o */
    /* loaded from: classes4.dex */
    public static class C7477o extends AbstractC7466d {
        @Override // com.google.common.cache.CacheBuilderSpec.AbstractC7466d
        /* renamed from: b */
        public void mo41205b(CacheBuilderSpec cacheBuilderSpec, long j, TimeUnit timeUnit) {
            boolean z;
            if (cacheBuilderSpec.f52854i == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "expireAfterWrite already set");
            cacheBuilderSpec.f52853h = j;
            cacheBuilderSpec.f52854i = timeUnit;
        }
    }

    static {
        ImmutableMap.Builder put = ImmutableMap.builder().put("initialCapacity", new C7467e()).put("maximumSize", new C7471i()).put("maximumWeight", new C7472j()).put("concurrencyLevel", new C7465c());
        LocalCache.Strength strength = LocalCache.Strength.WEAK;
        f52845q = put.put("weakKeys", new C7469g(strength)).put("softValues", new C7476n(LocalCache.Strength.SOFT)).put("weakValues", new C7476n(strength)).put("recordStats", new C7473k()).put("expireAfterAccess", new C7464b()).put("expireAfterWrite", new C7477o()).put("refreshAfterWrite", new C7474l()).put("refreshInterval", new C7474l()).buildOrThrow();
    }

    public CacheBuilderSpec(String str) {
        this.f52859n = str;
    }

    /* renamed from: b */
    public static Long m41211b(long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            return null;
        }
        return Long.valueOf(timeUnit.toNanos(j));
    }

    /* renamed from: c */
    public static String m41210c(String str, Object... objArr) {
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
            for (String str3 : f52843o.split(str)) {
                ImmutableList copyOf = ImmutableList.copyOf(f52844p.split(str3));
                Preconditions.checkArgument(!copyOf.isEmpty(), "blank key-value pair");
                boolean z2 = false;
                if (copyOf.size() <= 2) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z, "key-value pair %s with more than one equals sign", str3);
                String str4 = (String) copyOf.get(0);
                InterfaceC7475m interfaceC7475m = (InterfaceC7475m) f52845q.get(str4);
                if (interfaceC7475m != null) {
                    z2 = true;
                }
                Preconditions.checkArgument(z2, "unknown key %s", str4);
                if (copyOf.size() == 1) {
                    str2 = null;
                } else {
                    str2 = (String) copyOf.get(1);
                }
                interfaceC7475m.mo41206a(cacheBuilderSpec, str4, str2);
            }
        }
        return cacheBuilderSpec;
    }

    /* renamed from: d */
    public CacheBuilder m41209d() {
        CacheBuilder<Object, Object> newBuilder = CacheBuilder.newBuilder();
        Integer num = this.f52846a;
        if (num != null) {
            newBuilder.initialCapacity(num.intValue());
        }
        Long l = this.f52847b;
        if (l != null) {
            newBuilder.maximumSize(l.longValue());
        }
        Long l2 = this.f52848c;
        if (l2 != null) {
            newBuilder.maximumWeight(l2.longValue());
        }
        Integer num2 = this.f52849d;
        if (num2 != null) {
            newBuilder.concurrencyLevel(num2.intValue());
        }
        LocalCache.Strength strength = this.f52850e;
        if (strength != null) {
            if (C7463a.f52860a[strength.ordinal()] == 1) {
                newBuilder.weakKeys();
            } else {
                throw new AssertionError();
            }
        }
        LocalCache.Strength strength2 = this.f52851f;
        if (strength2 != null) {
            int i = C7463a.f52860a[strength2.ordinal()];
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
        Boolean bool = this.f52852g;
        if (bool != null && bool.booleanValue()) {
            newBuilder.recordStats();
        }
        TimeUnit timeUnit = this.f52854i;
        if (timeUnit != null) {
            newBuilder.expireAfterWrite(this.f52853h, timeUnit);
        }
        TimeUnit timeUnit2 = this.f52856k;
        if (timeUnit2 != null) {
            newBuilder.expireAfterAccess(this.f52855j, timeUnit2);
        }
        TimeUnit timeUnit3 = this.f52858m;
        if (timeUnit3 != null) {
            newBuilder.refreshAfterWrite(this.f52857l, timeUnit3);
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
        if (Objects.equal(this.f52846a, cacheBuilderSpec.f52846a) && Objects.equal(this.f52847b, cacheBuilderSpec.f52847b) && Objects.equal(this.f52848c, cacheBuilderSpec.f52848c) && Objects.equal(this.f52849d, cacheBuilderSpec.f52849d) && Objects.equal(this.f52850e, cacheBuilderSpec.f52850e) && Objects.equal(this.f52851f, cacheBuilderSpec.f52851f) && Objects.equal(this.f52852g, cacheBuilderSpec.f52852g) && Objects.equal(m41211b(this.f52853h, this.f52854i), m41211b(cacheBuilderSpec.f52853h, cacheBuilderSpec.f52854i)) && Objects.equal(m41211b(this.f52855j, this.f52856k), m41211b(cacheBuilderSpec.f52855j, cacheBuilderSpec.f52856k)) && Objects.equal(m41211b(this.f52857l, this.f52858m), m41211b(cacheBuilderSpec.f52857l, cacheBuilderSpec.f52858m))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f52846a, this.f52847b, this.f52848c, this.f52849d, this.f52850e, this.f52851f, this.f52852g, m41211b(this.f52853h, this.f52854i), m41211b(this.f52855j, this.f52856k), m41211b(this.f52857l, this.f52858m));
    }

    public String toParsableString() {
        return this.f52859n;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).addValue(toParsableString()).toString();
    }
}
