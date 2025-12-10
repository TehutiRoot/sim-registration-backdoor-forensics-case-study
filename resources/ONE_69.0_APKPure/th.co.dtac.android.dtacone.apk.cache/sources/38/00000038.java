package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* renamed from: AD2 */
/* loaded from: classes3.dex */
public final class AD2 {

    /* renamed from: a */
    public final Clock f46a;

    /* renamed from: b */
    public long f47b;

    public AD2(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.f46a = clock;
    }

    /* renamed from: a */
    public final void m69309a() {
        this.f47b = 0L;
    }

    /* renamed from: b */
    public final void m69308b() {
        this.f47b = this.f46a.elapsedRealtime();
    }

    /* renamed from: c */
    public final boolean m69307c(long j) {
        if (this.f47b == 0 || this.f46a.elapsedRealtime() - this.f47b >= CoreConstants.MILLIS_IN_ONE_HOUR) {
            return true;
        }
        return false;
    }
}