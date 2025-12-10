package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* renamed from: PL1 */
/* loaded from: classes6.dex */
public final class PL1 implements Continuation, CoroutineStackFrame {

    /* renamed from: a */
    public final Continuation f4771a;

    /* renamed from: b */
    public final CoroutineContext f4772b;

    public PL1(Continuation continuation, CoroutineContext coroutineContext) {
        this.f4771a = continuation;
        this.f4772b = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f4771a;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f4772b;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        this.f4771a.resumeWith(obj);
    }
}