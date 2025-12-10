package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* renamed from: SK1 */
/* loaded from: classes6.dex */
public final class SK1 implements Continuation, CoroutineStackFrame {

    /* renamed from: a */
    public final Continuation f5591a;

    /* renamed from: b */
    public final CoroutineContext f5592b;

    public SK1(Continuation continuation, CoroutineContext coroutineContext) {
        this.f5591a = continuation;
        this.f5592b = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f5591a;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return this.f5592b;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        this.f5591a.resumeWith(obj);
    }
}
