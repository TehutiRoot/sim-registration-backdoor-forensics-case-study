package p000;

import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;

/* renamed from: ZO1 */
/* loaded from: classes6.dex */
public final class ZO1 extends JobImpl {
    public ZO1(Job job) {
        super(job);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean childCancelled(Throwable th2) {
        return false;
    }
}
