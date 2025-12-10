package p000;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;

/* renamed from: SG1 */
/* loaded from: classes6.dex */
public final class SG1 {

    /* renamed from: a */
    public final Flow f5568a;

    /* renamed from: b */
    public final int f5569b;

    /* renamed from: c */
    public final BufferOverflow f5570c;

    /* renamed from: d */
    public final CoroutineContext f5571d;

    public SG1(Flow flow, int i, BufferOverflow bufferOverflow, CoroutineContext coroutineContext) {
        this.f5568a = flow;
        this.f5569b = i;
        this.f5570c = bufferOverflow;
        this.f5571d = coroutineContext;
    }
}
