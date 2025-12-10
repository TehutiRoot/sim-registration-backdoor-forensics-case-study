package p000;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;

/* renamed from: FL1 */
/* loaded from: classes6.dex */
public class FL1 extends AbstractCoroutine {
    public FL1(CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean handleJobException(Throwable th2) {
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th2);
        return true;
    }
}
