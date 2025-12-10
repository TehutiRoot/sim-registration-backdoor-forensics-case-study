package io.opencensus.common;

/* loaded from: classes5.dex */
public final class Functions {

    /* renamed from: a */
    public static final Function f63467a = new C10575a();

    /* renamed from: b */
    public static final Function f63468b = new C10576b();

    /* renamed from: c */
    public static final Function f63469c = new C10577c();

    /* renamed from: d */
    public static final Function f63470d = new C10578d();

    /* renamed from: io.opencensus.common.Functions$a */
    /* loaded from: classes5.dex */
    public class C10575a implements Function {
        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(Object obj) {
            return null;
        }
    }

    /* renamed from: io.opencensus.common.Functions$b */
    /* loaded from: classes5.dex */
    public class C10576b implements Function {
        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(Object obj) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: io.opencensus.common.Functions$c */
    /* loaded from: classes5.dex */
    public class C10577c implements Function {
        @Override // io.opencensus.common.Function
        /* renamed from: a */
        public Void apply(Object obj) {
            throw new AssertionError();
        }
    }

    /* renamed from: io.opencensus.common.Functions$d */
    /* loaded from: classes5.dex */
    public class C10578d implements Function {
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
    public class C10579e implements Function {

        /* renamed from: a */
        public final /* synthetic */ Object f63471a;

        public C10579e(Object obj) {
            this.f63471a = obj;
        }

        @Override // io.opencensus.common.Function
        public Object apply(Object obj) {
            return this.f63471a;
        }
    }

    public static <T> Function<Object, T> returnConstant(T t) {
        return new C10579e(t);
    }

    public static <T> Function<Object, T> returnNull() {
        return f63467a;
    }

    public static Function<Object, String> returnToString() {
        return f63470d;
    }

    public static <T> Function<Object, T> throwAssertionError() {
        return f63469c;
    }

    public static <T> Function<Object, T> throwIllegalArgumentException() {
        return f63468b;
    }
}
