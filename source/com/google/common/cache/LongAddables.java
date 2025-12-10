package com.google.common.cache;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public abstract class LongAddables {

    /* renamed from: a */
    public static final Supplier f52968a;

    /* loaded from: classes4.dex */
    public static final class PureJavaLongAddable extends AtomicLong implements InterfaceC17553Em0 {
        private PureJavaLongAddable() {
        }

        @Override // p000.InterfaceC17553Em0
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // p000.InterfaceC17553Em0
        public void increment() {
            getAndIncrement();
        }

        @Override // p000.InterfaceC17553Em0
        public long sum() {
            return get();
        }

        public /* synthetic */ PureJavaLongAddable(C7525a c7525a) {
            this();
        }
    }

    /* renamed from: com.google.common.cache.LongAddables$a */
    /* loaded from: classes4.dex */
    public class C7525a implements Supplier {
        @Override // com.google.common.base.Supplier
        /* renamed from: a */
        public InterfaceC17553Em0 get() {
            return new LongAdder();
        }
    }

    /* renamed from: com.google.common.cache.LongAddables$b */
    /* loaded from: classes4.dex */
    public class C7526b implements Supplier {
        @Override // com.google.common.base.Supplier
        /* renamed from: a */
        public InterfaceC17553Em0 get() {
            return new PureJavaLongAddable(null);
        }
    }

    static {
        Supplier c7526b;
        try {
            new LongAdder();
            c7526b = new C7525a();
        } catch (Throwable unused) {
            c7526b = new C7526b();
        }
        f52968a = c7526b;
    }

    /* renamed from: a */
    public static InterfaceC17553Em0 m41134a() {
        return (InterfaceC17553Em0) f52968a.get();
    }
}
