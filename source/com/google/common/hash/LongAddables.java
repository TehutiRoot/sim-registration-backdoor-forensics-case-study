package com.google.common.hash;

import com.google.common.base.Supplier;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public abstract class LongAddables {

    /* renamed from: a */
    public static final Supplier f53848a;

    /* loaded from: classes4.dex */
    public static final class PureJavaLongAddable extends AtomicLong implements InterfaceC17489Dm0 {
        private PureJavaLongAddable() {
        }

        @Override // p000.InterfaceC17489Dm0
        public void add(long j) {
            getAndAdd(j);
        }

        @Override // p000.InterfaceC17489Dm0
        public void increment() {
            getAndIncrement();
        }

        @Override // p000.InterfaceC17489Dm0
        public long sum() {
            return get();
        }

        public /* synthetic */ PureJavaLongAddable(C8061a c8061a) {
            this();
        }
    }

    /* renamed from: com.google.common.hash.LongAddables$a */
    /* loaded from: classes4.dex */
    public class C8061a implements Supplier {
        @Override // com.google.common.base.Supplier
        /* renamed from: a */
        public InterfaceC17489Dm0 get() {
            return new LongAdder();
        }
    }

    /* renamed from: com.google.common.hash.LongAddables$b */
    /* loaded from: classes4.dex */
    public class C8062b implements Supplier {
        @Override // com.google.common.base.Supplier
        /* renamed from: a */
        public InterfaceC17489Dm0 get() {
            return new PureJavaLongAddable(null);
        }
    }

    static {
        Supplier c8062b;
        try {
            new LongAdder();
            c8062b = new C8061a();
        } catch (Throwable unused) {
            c8062b = new C8062b();
        }
        f53848a = c8062b;
    }

    /* renamed from: a */
    public static InterfaceC17489Dm0 m40045a() {
        return (InterfaceC17489Dm0) f53848a.get();
    }
}
