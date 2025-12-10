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
    public static final class C13311a implements Strategy {

        /* renamed from: a */
        public static final C13311a f77516a = new C13311a();

        @Override // p046rx.BackpressureOverflow.Strategy
        public boolean mayAttemptDrop() {
            return false;
        }
    }

    /* renamed from: rx.BackpressureOverflow$b */
    /* loaded from: classes5.dex */
    public static final class C13312b implements Strategy {

        /* renamed from: a */
        public static final C13312b f77517a = new C13312b();

        @Override // p046rx.BackpressureOverflow.Strategy
        public boolean mayAttemptDrop() {
            return true;
        }
    }

    /* renamed from: rx.BackpressureOverflow$c */
    /* loaded from: classes5.dex */
    public static final class C13313c implements Strategy {

        /* renamed from: a */
        public static final C13313c f77518a = new C13313c();

        @Override // p046rx.BackpressureOverflow.Strategy
        public boolean mayAttemptDrop() {
            throw new MissingBackpressureException("Overflowed buffer");
        }
    }

    static {
        C13313c c13313c = C13313c.f77518a;
        ON_OVERFLOW_ERROR = c13313c;
        ON_OVERFLOW_DEFAULT = c13313c;
        ON_OVERFLOW_DROP_OLDEST = C13312b.f77517a;
        ON_OVERFLOW_DROP_LATEST = C13311a.f77516a;
    }
}
