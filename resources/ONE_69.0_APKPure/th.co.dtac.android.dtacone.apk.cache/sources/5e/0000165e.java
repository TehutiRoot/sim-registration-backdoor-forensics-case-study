package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import p000.C13894s8;

/* renamed from: XS */
/* loaded from: classes3.dex */
public abstract class AbstractC1667XS {

    /* renamed from: a */
    public static final AbstractC1667XS f7559a = m65610a().mo22863f(SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE).mo22865d(200).mo22867b(10000).mo22866c(CoreConstants.MILLIS_IN_ONE_WEEK).mo22864e(81920).mo22868a();

    /* renamed from: XS$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC1668a {
        /* renamed from: a */
        public abstract AbstractC1667XS mo22868a();

        /* renamed from: b */
        public abstract AbstractC1668a mo22867b(int i);

        /* renamed from: c */
        public abstract AbstractC1668a mo22866c(long j);

        /* renamed from: d */
        public abstract AbstractC1668a mo22865d(int i);

        /* renamed from: e */
        public abstract AbstractC1668a mo22864e(int i);

        /* renamed from: f */
        public abstract AbstractC1668a mo22863f(long j);
    }

    /* renamed from: a */
    public static AbstractC1668a m65610a() {
        return new C13894s8.C13896b();
    }

    /* renamed from: b */
    public abstract int mo22873b();

    /* renamed from: c */
    public abstract long mo22872c();

    /* renamed from: d */
    public abstract int mo22871d();

    /* renamed from: e */
    public abstract int mo22870e();

    /* renamed from: f */
    public abstract long mo22869f();
}