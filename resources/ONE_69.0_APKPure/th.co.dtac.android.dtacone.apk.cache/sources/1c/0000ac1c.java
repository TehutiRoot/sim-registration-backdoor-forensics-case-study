package com.google.common.hash;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public abstract class LongAddables {

    /* renamed from: a */
    public static final Supplier f53860a;

    /* loaded from: classes4.dex */
    public static final class PureJavaLongAddable extends AtomicLong implements InterfaceC17905Jm0 {
        private PureJavaLongAddable() {
        }

        @Override // p000.InterfaceC17905Jm0
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // p000.InterfaceC17905Jm0
        public void increment() {
            getAndIncrement();
        }

        @Override // p000.InterfaceC17905Jm0
        public long sum() {
            return get();
        }

        public /* synthetic */ PureJavaLongAddable(C8050a c8050a) {
            this();
        }
    }

    /* renamed from: com.google.common.hash.LongAddables$a */
    /* loaded from: classes4.dex */
    public class C8050a implements Supplier {
        @Override // com.google.common.base.Supplier
        /* renamed from: a */
        public InterfaceC17905Jm0 get() {
            return new LongAdder();
        }
    }

    /* renamed from: com.google.common.hash.LongAddables$b */
    /* loaded from: classes4.dex */
    public class C8051b implements Supplier {
        @Override // com.google.common.base.Supplier
        /* renamed from: a */
        public InterfaceC17905Jm0 get() {
            return new PureJavaLongAddable(null);
        }
    }

    static {
        Supplier c8051b;
        try {
            new LongAdder();
            c8051b = new C8050a();
        } catch (Throwable unused) {
            c8051b = new C8051b();
        }
        f53860a = c8051b;
    }

    /* renamed from: a */
    public static InterfaceC17905Jm0 m40036a() {
        return (InterfaceC17905Jm0) f53860a.get();
    }
}