package p000;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* renamed from: DC2 */
/* loaded from: classes3.dex */
public final class DC2 {

    /* renamed from: a */
    public final Clock f935a;

    /* renamed from: b */
    public long f936b;

    public DC2(Clock clock) {
        Preconditions.checkNotNull(clock);
        this.f935a = clock;
    }

    /* renamed from: a */
    public final void m68676a() {
        this.f936b = 0L;
    }

    /* renamed from: b */
    public final void m68675b() {
        this.f936b = this.f935a.elapsedRealtime();
    }

    /* renamed from: c */
    public final boolean m68674c(long j) {
        if (this.f936b == 0 || this.f935a.elapsedRealtime() - this.f936b >= CoreConstants.MILLIS_IN_ONE_HOUR) {
            return true;
        }
        return false;
    }
}
