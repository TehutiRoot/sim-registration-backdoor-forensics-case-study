package p000;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;

/* renamed from: QS1 */
/* loaded from: classes6.dex */
public final class QS1 {

    /* renamed from: a */
    public final CoroutineContext f5061a;

    /* renamed from: b */
    public final Object[] f5062b;

    /* renamed from: c */
    public final ThreadContextElement[] f5063c;

    /* renamed from: d */
    public int f5064d;

    public QS1(CoroutineContext coroutineContext, int i) {
        this.f5061a = coroutineContext;
        this.f5062b = new Object[i];
        this.f5063c = new ThreadContextElement[i];
    }

    /* renamed from: a */
    public final void m66561a(ThreadContextElement threadContextElement, Object obj) {
        Object[] objArr = this.f5062b;
        int i = this.f5064d;
        objArr[i] = obj;
        ThreadContextElement[] threadContextElementArr = this.f5063c;
        this.f5064d = i + 1;
        Intrinsics.checkNotNull(threadContextElement, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        threadContextElementArr[i] = threadContextElement;
    }

    /* renamed from: b */
    public final void m66560b(CoroutineContext coroutineContext) {
        int length = this.f5063c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            ThreadContextElement threadContextElement = this.f5063c[length];
            Intrinsics.checkNotNull(threadContextElement);
            threadContextElement.restoreThreadContext(coroutineContext, this.f5062b[length]);
            if (i >= 0) {
                length = i;
            } else {
                return;
            }
        }
    }
}
