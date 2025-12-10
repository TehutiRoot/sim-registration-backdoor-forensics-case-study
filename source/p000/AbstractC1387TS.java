package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import p000.C13899s8;

/* renamed from: TS */
/* loaded from: classes3.dex */
public abstract class AbstractC1387TS {

    /* renamed from: a */
    public static final AbstractC1387TS f6018a = m66202a().mo22694f(SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE).mo22696d(200).mo22698b(10000).mo22697c(CoreConstants.MILLIS_IN_ONE_WEEK).mo22695e(81920).mo22699a();

    /* renamed from: TS$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC1388a {
        /* renamed from: a */
        public abstract AbstractC1387TS mo22699a();

        /* renamed from: b */
        public abstract AbstractC1388a mo22698b(int i);

        /* renamed from: c */
        public abstract AbstractC1388a mo22697c(long j);

        /* renamed from: d */
        public abstract AbstractC1388a mo22696d(int i);

        /* renamed from: e */
        public abstract AbstractC1388a mo22695e(int i);

        /* renamed from: f */
        public abstract AbstractC1388a mo22694f(long j);
    }

    /* renamed from: a */
    public static AbstractC1388a m66202a() {
        return new C13899s8.C13901b();
    }

    /* renamed from: b */
    public abstract int mo22704b();

    /* renamed from: c */
    public abstract long mo22703c();

    /* renamed from: d */
    public abstract int mo22702d();

    /* renamed from: e */
    public abstract int mo22701e();

    /* renamed from: f */
    public abstract long mo22700f();
}
