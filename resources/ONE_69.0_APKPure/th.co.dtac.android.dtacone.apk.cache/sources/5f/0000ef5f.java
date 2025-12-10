package org.apache.commons.p028io.file;

import java.math.BigInteger;
import java.util.Objects;

/* renamed from: org.apache.commons.io.file.Counters */
/* loaded from: classes6.dex */
public class Counters {

    /* renamed from: org.apache.commons.io.file.Counters$Counter */
    /* loaded from: classes6.dex */
    public interface Counter {
        void add(long j);

        long get();

        BigInteger getBigInteger();

        Long getLong();

        void increment();

        void reset();
    }

    /* renamed from: org.apache.commons.io.file.Counters$PathCounters */
    /* loaded from: classes6.dex */
    public interface PathCounters {
        Counter getByteCounter();

        Counter getDirectoryCounter();

        Counter getFileCounter();

        void reset();
    }

    /* renamed from: org.apache.commons.io.file.Counters$b */
    /* loaded from: classes6.dex */
    public static class C12510b implements PathCounters {

        /* renamed from: a */
        public final Counter f73369a;

        /* renamed from: b */
        public final Counter f73370b;

        /* renamed from: c */
        public final Counter f73371c;

        public C12510b(Counter counter, Counter counter2, Counter counter3) {
            this.f73369a = counter;
            this.f73370b = counter2;
            this.f73371c = counter3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12510b)) {
                return false;
            }
            C12510b c12510b = (C12510b) obj;
            if (Objects.equals(this.f73369a, c12510b.f73369a) && Objects.equals(this.f73370b, c12510b.f73370b) && Objects.equals(this.f73371c, c12510b.f73371c)) {
                return true;
            }
            return false;
        }

        @Override // org.apache.commons.p028io.file.Counters.PathCounters
        public Counter getByteCounter() {
            return this.f73369a;
        }

        @Override // org.apache.commons.p028io.file.Counters.PathCounters
        public Counter getDirectoryCounter() {
            return this.f73370b;
        }

        @Override // org.apache.commons.p028io.file.Counters.PathCounters
        public Counter getFileCounter() {
            return this.f73371c;
        }

        public int hashCode() {
            return Objects.hash(this.f73369a, this.f73370b, this.f73371c);
        }

        @Override // org.apache.commons.p028io.file.Counters.PathCounters
        public void reset() {
            this.f73369a.reset();
            this.f73370b.reset();
            this.f73371c.reset();
        }

        public String toString() {
            return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(this.f73371c.get()), Long.valueOf(this.f73370b.get()), Long.valueOf(this.f73369a.get()));
        }
    }

    /* renamed from: org.apache.commons.io.file.Counters$c */
    /* loaded from: classes6.dex */
    public static final class C12511c implements Counter {

        /* renamed from: a */
        public BigInteger f73372a;

        public C12511c() {
            this.f73372a = BigInteger.ZERO;
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public void add(long j) {
            this.f73372a = this.f73372a.add(BigInteger.valueOf(j));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Counter)) {
                return false;
            }
            return Objects.equals(this.f73372a, ((Counter) obj).getBigInteger());
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public long get() {
            long longValueExact;
            longValueExact = this.f73372a.longValueExact();
            return longValueExact;
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public BigInteger getBigInteger() {
            return this.f73372a;
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public Long getLong() {
            long longValueExact;
            longValueExact = this.f73372a.longValueExact();
            return Long.valueOf(longValueExact);
        }

        public int hashCode() {
            return Objects.hash(this.f73372a);
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public void increment() {
            this.f73372a = this.f73372a.add(BigInteger.ONE);
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public void reset() {
            this.f73372a = BigInteger.ZERO;
        }

        public String toString() {
            return this.f73372a.toString();
        }
    }

    /* renamed from: org.apache.commons.io.file.Counters$d */
    /* loaded from: classes6.dex */
    public static final class C12512d extends C12510b {
        public C12512d() {
            super(Counters.bigIntegerCounter(), Counters.bigIntegerCounter(), Counters.bigIntegerCounter());
        }
    }

    /* renamed from: org.apache.commons.io.file.Counters$e */
    /* loaded from: classes6.dex */
    public static final class C12513e implements Counter {

        /* renamed from: a */
        public long f73373a;

        public C12513e() {
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public void add(long j) {
            this.f73373a += j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Counter) && this.f73373a == ((Counter) obj).get()) {
                return true;
            }
            return false;
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public long get() {
            return this.f73373a;
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public BigInteger getBigInteger() {
            return BigInteger.valueOf(this.f73373a);
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public Long getLong() {
            return Long.valueOf(this.f73373a);
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f73373a));
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public void increment() {
            this.f73373a++;
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public void reset() {
            this.f73373a = 0L;
        }

        public String toString() {
            return Long.toString(this.f73373a);
        }
    }

    /* renamed from: org.apache.commons.io.file.Counters$f */
    /* loaded from: classes6.dex */
    public static final class C12514f extends C12510b {
        public C12514f() {
            super(Counters.longCounter(), Counters.longCounter(), Counters.longCounter());
        }
    }

    /* renamed from: org.apache.commons.io.file.Counters$g */
    /* loaded from: classes6.dex */
    public static final class C12515g implements Counter {

        /* renamed from: a */
        public static final C12515g f73374a = new C12515g();

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public void add(long j) {
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public long get() {
            return 0L;
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public BigInteger getBigInteger() {
            return BigInteger.ZERO;
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public Long getLong() {
            return 0L;
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public void increment() {
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public /* synthetic */ void reset() {
            AbstractC0833Ly.m67464a(this);
        }

        public String toString() {
            return "0";
        }
    }

    /* renamed from: org.apache.commons.io.file.Counters$h */
    /* loaded from: classes6.dex */
    public static final class C12516h extends C12510b {

        /* renamed from: d */
        public static final C12516h f73375d = new C12516h();

        public C12516h() {
            super(Counters.noopCounter(), Counters.noopCounter(), Counters.noopCounter());
        }
    }

    public static Counter bigIntegerCounter() {
        return new C12511c();
    }

    public static PathCounters bigIntegerPathCounters() {
        return new C12512d();
    }

    public static Counter longCounter() {
        return new C12513e();
    }

    public static PathCounters longPathCounters() {
        return new C12514f();
    }

    public static Counter noopCounter() {
        return C12515g.f73374a;
    }

    public static PathCounters noopPathCounters() {
        return C12516h.f73375d;
    }
}