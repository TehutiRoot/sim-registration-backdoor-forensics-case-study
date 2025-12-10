package p000;

import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;

/* renamed from: WP1 */
/* loaded from: classes6.dex */
public final class WP1 extends JobImpl {
    public WP1(Job job) {
        super(job);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean childCancelled(Throwable th2) {
        return false;
    }
}