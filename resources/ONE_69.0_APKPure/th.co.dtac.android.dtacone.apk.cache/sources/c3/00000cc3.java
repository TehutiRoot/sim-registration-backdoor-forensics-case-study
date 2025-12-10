package p000;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;

/* renamed from: NT1 */
/* loaded from: classes6.dex */
public final class NT1 {

    /* renamed from: a */
    public final CoroutineContext f4178a;

    /* renamed from: b */
    public final Object[] f4179b;

    /* renamed from: c */
    public final ThreadContextElement[] f4180c;

    /* renamed from: d */
    public int f4181d;

    public NT1(CoroutineContext coroutineContext, int i) {
        this.f4178a = coroutineContext;
        this.f4179b = new Object[i];
        this.f4180c = new ThreadContextElement[i];
    }

    /* renamed from: a */
    public final void m67234a(ThreadContextElement threadContextElement, Object obj) {
        Object[] objArr = this.f4179b;
        int i = this.f4181d;
        objArr[i] = obj;
        ThreadContextElement[] threadContextElementArr = this.f4180c;
        this.f4181d = i + 1;
        Intrinsics.checkNotNull(threadContextElement, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        threadContextElementArr[i] = threadContextElement;
    }

    /* renamed from: b */
    public final void m67233b(CoroutineContext coroutineContext) {
        int length = this.f4180c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            ThreadContextElement threadContextElement = this.f4180c[length];
            Intrinsics.checkNotNull(threadContextElement);
            threadContextElement.restoreThreadContext(coroutineContext, this.f4179b[length]);
            if (i >= 0) {
                length = i;
            } else {
                return;
            }
        }
    }
}