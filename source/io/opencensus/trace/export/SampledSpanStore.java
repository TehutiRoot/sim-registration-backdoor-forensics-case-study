package io.opencensus.trace.export;

import io.opencensus.internal.Utils;
import io.opencensus.trace.Status;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes5.dex */
public abstract class SampledSpanStore {

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class ErrorFilter {
        public static ErrorFilter create(String str, @Nullable Status.CanonicalCode canonicalCode, int i) {
            boolean z;
            boolean z2 = false;
            if (canonicalCode != null) {
                if (canonicalCode != Status.CanonicalCode.OK) {
                    z = true;
                } else {
                    z = false;
                }
                Utils.checkArgument(z, "Invalid canonical code.");
            }
            if (i >= 0) {
                z2 = true;
            }
            Utils.checkArgument(z2, "Negative maxSpansToReturn.");
            return new C10716d(str, canonicalCode, i);
        }

        @Nullable
        public abstract Status.CanonicalCode getCanonicalCode();

        public abstract int getMaxSpansToReturn();

        public abstract String getSpanName();
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ZERO_MICROSx10 uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes5.dex */
    public static final class LatencyBucketBoundaries {
        private static final /* synthetic */ LatencyBucketBoundaries[] $VALUES;
        public static final LatencyBucketBoundaries MICROSx100_MILLIx1;
        public static final LatencyBucketBoundaries MICROSx10_MICROSx100;
        public static final LatencyBucketBoundaries MILLIx100_SECONDx1;
        public static final LatencyBucketBoundaries MILLIx10_MILLIx100;
        public static final LatencyBucketBoundaries MILLIx1_MILLIx10;
        public static final LatencyBucketBoundaries SECONDx100_MAX;
        public static final LatencyBucketBoundaries SECONDx10_SECONDx100;
        public static final LatencyBucketBoundaries SECONDx1_SECONDx10;
        public static final LatencyBucketBoundaries ZERO_MICROSx10;
        private final long latencyLowerNs;
        private final long latencyUpperNs;

        static {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            LatencyBucketBoundaries latencyBucketBoundaries = new LatencyBucketBoundaries("ZERO_MICROSx10", 0, 0L, timeUnit.toNanos(10L));
            ZERO_MICROSx10 = latencyBucketBoundaries;
            LatencyBucketBoundaries latencyBucketBoundaries2 = new LatencyBucketBoundaries("MICROSx10_MICROSx100", 1, timeUnit.toNanos(10L), timeUnit.toNanos(100L));
            MICROSx10_MICROSx100 = latencyBucketBoundaries2;
            long nanos = timeUnit.toNanos(100L);
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            LatencyBucketBoundaries latencyBucketBoundaries3 = new LatencyBucketBoundaries("MICROSx100_MILLIx1", 2, nanos, timeUnit2.toNanos(1L));
            MICROSx100_MILLIx1 = latencyBucketBoundaries3;
            LatencyBucketBoundaries latencyBucketBoundaries4 = new LatencyBucketBoundaries("MILLIx1_MILLIx10", 3, timeUnit2.toNanos(1L), timeUnit2.toNanos(10L));
            MILLIx1_MILLIx10 = latencyBucketBoundaries4;
            LatencyBucketBoundaries latencyBucketBoundaries5 = new LatencyBucketBoundaries("MILLIx10_MILLIx100", 4, timeUnit2.toNanos(10L), timeUnit2.toNanos(100L));
            MILLIx10_MILLIx100 = latencyBucketBoundaries5;
            long nanos2 = timeUnit2.toNanos(100L);
            TimeUnit timeUnit3 = TimeUnit.SECONDS;
            LatencyBucketBoundaries latencyBucketBoundaries6 = new LatencyBucketBoundaries("MILLIx100_SECONDx1", 5, nanos2, timeUnit3.toNanos(1L));
            MILLIx100_SECONDx1 = latencyBucketBoundaries6;
            LatencyBucketBoundaries latencyBucketBoundaries7 = new LatencyBucketBoundaries("SECONDx1_SECONDx10", 6, timeUnit3.toNanos(1L), timeUnit3.toNanos(10L));
            SECONDx1_SECONDx10 = latencyBucketBoundaries7;
            LatencyBucketBoundaries latencyBucketBoundaries8 = new LatencyBucketBoundaries("SECONDx10_SECONDx100", 7, timeUnit3.toNanos(10L), timeUnit3.toNanos(100L));
            SECONDx10_SECONDx100 = latencyBucketBoundaries8;
            LatencyBucketBoundaries latencyBucketBoundaries9 = new LatencyBucketBoundaries("SECONDx100_MAX", 8, timeUnit3.toNanos(100L), Long.MAX_VALUE);
            SECONDx100_MAX = latencyBucketBoundaries9;
            $VALUES = new LatencyBucketBoundaries[]{latencyBucketBoundaries, latencyBucketBoundaries2, latencyBucketBoundaries3, latencyBucketBoundaries4, latencyBucketBoundaries5, latencyBucketBoundaries6, latencyBucketBoundaries7, latencyBucketBoundaries8, latencyBucketBoundaries9};
        }

        private LatencyBucketBoundaries(String str, int i, long j, long j2) {
            this.latencyLowerNs = j;
            this.latencyUpperNs = j2;
        }

        public static LatencyBucketBoundaries valueOf(String str) {
            return (LatencyBucketBoundaries) Enum.valueOf(LatencyBucketBoundaries.class, str);
        }

        public static LatencyBucketBoundaries[] values() {
            return (LatencyBucketBoundaries[]) $VALUES.clone();
        }

        public long getLatencyLowerNs() {
            return this.latencyLowerNs;
        }

        public long getLatencyUpperNs() {
            return this.latencyUpperNs;
        }
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class LatencyFilter {
        public static LatencyFilter create(String str, long j, long j2, int i) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "Negative maxSpansToReturn.");
            if (j >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Utils.checkArgument(z2, "Negative latencyLowerNs");
            if (j2 >= 0) {
                z3 = true;
            }
            Utils.checkArgument(z3, "Negative latencyUpperNs");
            return new C10717e(str, j, j2, i);
        }

        public abstract long getLatencyLowerNs();

        public abstract long getLatencyUpperNs();

        public abstract int getMaxSpansToReturn();

        public abstract String getSpanName();
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class PerSpanNameSummary {
        public static PerSpanNameSummary create(Map<LatencyBucketBoundaries, Integer> map, Map<Status.CanonicalCode, Integer> map2) {
            return new C10718f(Collections.unmodifiableMap(new HashMap((Map) Utils.checkNotNull(map, "numbersOfLatencySampledSpans"))), Collections.unmodifiableMap(new HashMap((Map) Utils.checkNotNull(map2, "numbersOfErrorSampledSpans"))));
        }

        public abstract Map<Status.CanonicalCode, Integer> getNumbersOfErrorSampledSpans();

        public abstract Map<LatencyBucketBoundaries, Integer> getNumbersOfLatencySampledSpans();
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class Summary {
        public static Summary create(Map<String, PerSpanNameSummary> map) {
            return new C10719g(Collections.unmodifiableMap(new HashMap((Map) Utils.checkNotNull(map, "perSpanNameSummary"))));
        }

        public abstract Map<String, PerSpanNameSummary> getPerSpanNameSummary();
    }

    /* renamed from: io.opencensus.trace.export.SampledSpanStore$b */
    /* loaded from: classes5.dex */
    public static final class C10710b extends SampledSpanStore {

        /* renamed from: b */
        public static final PerSpanNameSummary f63720b = PerSpanNameSummary.create(Collections.emptyMap(), Collections.emptyMap());

        /* renamed from: a */
        public final Set f63721a;

        public C10710b() {
            this.f63721a = new HashSet();
        }

        @Override // io.opencensus.trace.export.SampledSpanStore
        public Collection getErrorSampledSpans(ErrorFilter errorFilter) {
            Utils.checkNotNull(errorFilter, "errorFilter");
            return Collections.emptyList();
        }

        @Override // io.opencensus.trace.export.SampledSpanStore
        public Collection getLatencySampledSpans(LatencyFilter latencyFilter) {
            Utils.checkNotNull(latencyFilter, "latencyFilter");
            return Collections.emptyList();
        }

        @Override // io.opencensus.trace.export.SampledSpanStore
        public Set getRegisteredSpanNamesForCollection() {
            Set unmodifiableSet;
            synchronized (this.f63721a) {
                unmodifiableSet = Collections.unmodifiableSet(new HashSet(this.f63721a));
            }
            return unmodifiableSet;
        }

        @Override // io.opencensus.trace.export.SampledSpanStore
        public Summary getSummary() {
            HashMap hashMap = new HashMap();
            synchronized (this.f63721a) {
                try {
                    for (String str : this.f63721a) {
                        hashMap.put(str, f63720b);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return Summary.create(hashMap);
        }

        @Override // io.opencensus.trace.export.SampledSpanStore
        public void registerSpanNamesForCollection(Collection collection) {
            Utils.checkNotNull(collection, "spanNames");
            synchronized (this.f63721a) {
                this.f63721a.addAll(collection);
            }
        }

        @Override // io.opencensus.trace.export.SampledSpanStore
        public void unregisterSpanNamesForCollection(Collection collection) {
            Utils.checkNotNull(collection, "spanNames");
            synchronized (this.f63721a) {
                this.f63721a.removeAll(collection);
            }
        }
    }

    /* renamed from: a */
    public static SampledSpanStore m30135a() {
        return new C10710b();
    }

    public abstract Collection<SpanData> getErrorSampledSpans(ErrorFilter errorFilter);

    public abstract Collection<SpanData> getLatencySampledSpans(LatencyFilter latencyFilter);

    public abstract Set<String> getRegisteredSpanNamesForCollection();

    public abstract Summary getSummary();

    @Deprecated
    public abstract void registerSpanNamesForCollection(Collection<String> collection);

    @Deprecated
    public abstract void unregisterSpanNamesForCollection(Collection<String> collection);
}
