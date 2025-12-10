package p000;

import ch.qos.logback.core.CoreConstants;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* renamed from: pT1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC21592pT1 extends ScopeCoroutine implements Runnable {

    /* renamed from: d */
    public final long f76594d;

    public RunnableC21592pT1(long j, Continuation continuation) {
        super(continuation.getContext(), continuation);
        this.f76594d = j;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine, kotlinx.coroutines.JobSupport
    public String nameString$kotlinx_coroutines_core() {
        return super.nameString$kotlinx_coroutines_core() + "(timeMillis=" + this.f76594d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // java.lang.Runnable
    public void run() {
        cancelCoroutine(TimeoutKt.TimeoutCancellationException(this.f76594d, DelayKt.getDelay(getContext()), this));
    }
}
