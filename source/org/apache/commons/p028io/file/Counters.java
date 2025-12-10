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
        public final Counter f73285a;

        /* renamed from: b */
        public final Counter f73286b;

        /* renamed from: c */
        public final Counter f73287c;

        public C12510b(Counter counter, Counter counter2, Counter counter3) {
            this.f73285a = counter;
            this.f73286b = counter2;
            this.f73287c = counter3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12510b)) {
                return false;
            }
            C12510b c12510b = (C12510b) obj;
            if (Objects.equals(this.f73285a, c12510b.f73285a) && Objects.equals(this.f73286b, c12510b.f73286b) && Objects.equals(this.f73287c, c12510b.f73287c)) {
                return true;
            }
            return false;
        }

        @Override // org.apache.commons.p028io.file.Counters.PathCounters
        public Counter getByteCounter() {
            return this.f73285a;
        }

        @Override // org.apache.commons.p028io.file.Counters.PathCounters
        public Counter getDirectoryCounter() {
            return this.f73286b;
        }

        @Override // org.apache.commons.p028io.file.Counters.PathCounters
        public Counter getFileCounter() {
            return this.f73287c;
        }

        public int hashCode() {
            return Objects.hash(this.f73285a, this.f73286b, this.f73287c);
        }

        @Override // org.apache.commons.p028io.file.Counters.PathCounters
        public void reset() {
            this.f73285a.reset();
            this.f73286b.reset();
            this.f73287c.reset();
        }

        public String toString() {
            return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(this.f73287c.get()), Long.valueOf(this.f73286b.get()), Long.valueOf(this.f73285a.get()));
        }
    }

    /* renamed from: org.apache.commons.io.file.Counters$c */
    /* loaded from: classes6.dex */
    public static final class C12511c implements Counter {

        /* renamed from: a */
        public BigInteger f73288a;

        public C12511c() {
            this.f73288a = BigInteger.ZERO;
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public void add(long j) {
            this.f73288a = this.f73288a.add(BigInteger.valueOf(j));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Counter)) {
                return false;
            }
            return Objects.equals(this.f73288a, ((Counter) obj).getBigInteger());
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public long get() {
            long longValueExact;
            longValueExact = this.f73288a.longValueExact();
            return longValueExact;
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public BigInteger getBigInteger() {
            return this.f73288a;
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public Long getLong() {
            long longValueExact;
            longValueExact = this.f73288a.longValueExact();
            return Long.valueOf(longValueExact);
        }

        public int hashCode() {
            return Objects.hash(this.f73288a);
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public void increment() {
            this.f73288a = this.f73288a.add(BigInteger.ONE);
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public void reset() {
            this.f73288a = BigInteger.ZERO;
        }

        public String toString() {
            return this.f73288a.toString();
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
        public long f73289a;

        public C12513e() {
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public void add(long j) {
            this.f73289a += j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Counter) && this.f73289a == ((Counter) obj).get()) {
                return true;
            }
            return false;
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public long get() {
            return this.f73289a;
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public BigInteger getBigInteger() {
            return BigInteger.valueOf(this.f73289a);
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public Long getLong() {
            return Long.valueOf(this.f73289a);
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f73289a));
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public void increment() {
            this.f73289a++;
        }

        @Override // org.apache.commons.p028io.file.Counters.Counter
        public void reset() {
            this.f73289a = 0L;
        }

        public String toString() {
            return Long.toString(this.f73289a);
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
        public static final C12515g f73290a = new C12515g();

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
            AbstractC0837Ly.m67450a(this);
        }

        public String toString() {
            return "0";
        }
    }

    /* renamed from: org.apache.commons.io.file.Counters$h */
    /* loaded from: classes6.dex */
    public static final class C12516h extends C12510b {

        /* renamed from: d */
        public static final C12516h f73291d = new C12516h();

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
        return C12515g.f73290a;
    }

    public static PathCounters noopPathCounters() {
        return C12516h.f73291d;
    }
}
