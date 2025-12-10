package io.opencensus.common;

/* loaded from: classes5.dex */
public final class Functions {

    /* renamed from: a */
    public static final Function f63530a = new C10562a();

    /* renamed from: b */
    public static final Function f63531b = new C10563b();

    /* renamed from: c */
    public static final Function f63532c = new C10564c();

    /* renamed from: d */
    public static final Function f63533d = new C10565d();

    /* renamed from: io.opencensus.common.Functions$a */
    /* loaded from: classes5.dex */
    public class C10562a implements Function {
        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(Object obj) {
            return null;
        }
    }

    /* renamed from: io.opencensus.common.Functions$b */
    /* loaded from: classes5.dex */
    public class C10563b implements Function {
        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(Object obj) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: io.opencensus.common.Functions$c */
    /* loaded from: classes5.dex */
    public class C10564c implements Function {
        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(Object obj) {
            throw new AssertionError();
        }
    }

    /* renamed from: io.opencensus.common.Functions$d */
    /* loaded from: classes5.dex */
    public class C10565d implements Function {
        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public String apply(Object obj) {
            if (obj == null) {
                return null;
            }
            return obj.toString();
        }
    }

    /* renamed from: io.opencensus.common.Functions$e */
    /* loaded from: classes5.dex */
    public class C10566e implements Function {

        /* renamed from: a */
        public final /* synthetic */ Object f63534a;

        public C10566e(Object obj) {
            this.f63534a = obj;
        }

        @Override // io.opencensus.common.Function
        public Object apply(Object obj) {
            return this.f63534a;
        }
    }

    public static <T> Function<Object, T> returnConstant(T t) {
        return new C10566e(t);
    }

    public static <T> Function<Object, T> returnNull() {
        return f63530a;
    }

    public static Function<Object, String> returnToString() {
        return f63533d;
    }

    public static <T> Function<Object, T> throwAssertionError() {
        return f63532c;
    }

    public static <T> Function<Object, T> throwIllegalArgumentException() {
        return f63531b;
    }
}