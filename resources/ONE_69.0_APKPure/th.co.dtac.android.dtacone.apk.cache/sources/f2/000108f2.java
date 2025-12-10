package p046rx;

import p046rx.exceptions.MissingBackpressureException;

/* renamed from: rx.BackpressureOverflow */
/* loaded from: classes5.dex */
public final class BackpressureOverflow {
    public static final Strategy ON_OVERFLOW_DEFAULT;
    public static final Strategy ON_OVERFLOW_DROP_LATEST;
    public static final Strategy ON_OVERFLOW_DROP_OLDEST;
    public static final Strategy ON_OVERFLOW_ERROR;

    /* renamed from: rx.BackpressureOverflow$Strategy */
    /* loaded from: classes5.dex */
    public interface Strategy {
        boolean mayAttemptDrop() throws MissingBackpressureException;
    }

    /* renamed from: rx.BackpressureOverflow$a */
    /* loaded from: classes5.dex */
    public static final class C13312a implements Strategy {

        /* renamed from: a */
        public static final C13312a f77722a = new C13312a();

        @Override // p046rx.BackpressureOverflow.Strategy
        public boolean mayAttemptDrop() {
            return false;
        }
    }

    /* renamed from: rx.BackpressureOverflow$b */
    /* loaded from: classes5.dex */
    public static final class C13313b implements Strategy {

        /* renamed from: a */
        public static final C13313b f77723a = new C13313b();

        @Override // p046rx.BackpressureOverflow.Strategy
        public boolean mayAttemptDrop() {
            return true;
        }
    }

    /* renamed from: rx.BackpressureOverflow$c */
    /* loaded from: classes5.dex */
    public static final class C13314c implements Strategy {

        /* renamed from: a */
        public static final C13314c f77724a = new C13314c();

        @Override // p046rx.BackpressureOverflow.Strategy
        public boolean mayAttemptDrop() {
            throw new MissingBackpressureException("Overflowed buffer");
        }
    }

    static {
        C13314c c13314c = C13314c.f77724a;
        ON_OVERFLOW_ERROR = c13314c;
        ON_OVERFLOW_DEFAULT = c13314c;
        ON_OVERFLOW_DROP_OLDEST = C13313b.f77723a;
        ON_OVERFLOW_DROP_LATEST = C13312a.f77722a;
    }
}