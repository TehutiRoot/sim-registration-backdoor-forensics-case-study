package p000;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;

/* renamed from: PH1 */
/* loaded from: classes6.dex */
public final class PH1 {

    /* renamed from: a */
    public final Flow f4746a;

    /* renamed from: b */
    public final int f4747b;

    /* renamed from: c */
    public final BufferOverflow f4748c;

    /* renamed from: d */
    public final CoroutineContext f4749d;

    public PH1(Flow flow, int i, BufferOverflow bufferOverflow, CoroutineContext coroutineContext) {
        this.f4746a = flow;
        this.f4747b = i;
        this.f4748c = bufferOverflow;
        this.f4749d = coroutineContext;
    }
}